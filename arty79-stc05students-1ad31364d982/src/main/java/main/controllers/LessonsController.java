package main.controllers;

import main.model.dto.LessonDTO;
import main.services.LessonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 16.05.2017.
 */
@Controller
public class LessonsController {

    private static final Logger logger = Logger.getLogger(StudentsController.class);

    private LessonService lessonService;

    @Autowired
    public void setLessonService(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @RequestMapping(value = "/listLessons", method = RequestMethod.GET)
    public String showLessonsList(Model model) {

        List<LessonDTO> lessons = lessonService.getAllLessons();
        model.addAttribute("lessons", lessons);

        return "listLessons";
    }

    @RequestMapping(value = "/listLessons/edit")
    public ModelAndView editLesson(@RequestParam(value = "id") long lessonId) {
        ModelAndView mnv = new ModelAndView();
        LessonDTO lesson = lessonService.getById(lessonId);
        mnv.addObject("lesson", lesson);
        mnv.setViewName("addLesson");
        return mnv;
    }

    @RequestMapping(value = "/listLessons/delete", method = RequestMethod.GET)
    public String deleteLesson(@RequestParam(value = "id") long lessonId) {

        lessonService.deleteLesson(lessonId);
        return "redirect:/listLessons";
    }

    @RequestMapping(value = "/listLessons/add", method = RequestMethod.GET)
    public String addLesson() {
        return  "addLesson";
    }

    @RequestMapping(value = "/listLessons/update", method = RequestMethod.POST)
    public String saveLesson(@RequestParam(value = "id", required = false) Long id,
                              @RequestParam("room") int room,
                              @RequestParam("lessonDate") String lessonDate,
                              @RequestParam("studyGroupId") long studyGroupId,
                              @RequestParam("description") String description) {


        logger.debug("lesson id: " + id);


        LessonDTO lesson;
        if (id != null && id > 0) {
            lesson = lessonService.getById(id);
        } else {
            lesson = new LessonDTO();
        }

        Timestamp timestamp = null;

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(lessonDate);
            timestamp = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){
        }

        lesson.setDescription(description);
        lesson.setLessonDate(timestamp);
        lesson.setRoom(room);
        lesson.setStudyGroupId(studyGroupId);
        lessonService.saveLesson(lesson);

        return  "redirect:/listLessons";

    }
}
