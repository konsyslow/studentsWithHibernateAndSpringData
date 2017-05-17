package main.services.impl;

import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import main.model.dao.LessonDAO;
import main.model.dao.LessonRepo;
import main.model.dto.LessonDTO;
import main.model.entity.Lesson;
import main.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by admin on 16.05.2017.
 */
@Service
public class LessonServiceImpl implements LessonService {


    @Autowired
    private LessonRepo lessonRepo;

    private LessonDAO lessonDAO;

    @Autowired
    public void setLessonDAO(LessonDAO lessonDAO) {
        this.lessonDAO = lessonDAO;
    }

    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private static BoundMapperFacade<Lesson, LessonDTO> boundMapper = mapperFactory.getMapperFacade(Lesson.class, LessonDTO.class);

    {mapperFactory.classMap(
            Lesson.class, LessonDTO.class).field("groupId", "studyGroupId");}

    @Override
    @PreAuthorize(value = "hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<LessonDTO> getAllLessons() {

        List<Lesson> lessons =(List<Lesson>) lessonRepo.findAll();
        lessons.sort(Comparator.comparingLong(Lesson::getId));
        List<LessonDTO> lessonDTOS = new ArrayList<>();
        lessons.forEach(lesson -> {
            lessonDTOS.add(boundMapper.map(lesson));
        });
        return lessonDTOS;
    }

    @Override
    @PreAuthorize(value = "hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public void saveLesson(LessonDTO lessonDTO) {

        Lesson lessonEntity = boundMapper.mapReverse(lessonDTO);
        lessonRepo.save(lessonEntity);
    }

    @Override
    @PreAuthorize(value = "hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public void updateLesson(LessonDTO lessonDTO) {
        Lesson lessonEntity = boundMapper.mapReverse(lessonDTO);
        lessonRepo.save(lessonEntity);

    }

    @Override
    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    public void deleteLesson(long id) {

        lessonRepo.delete(id);
    }

    @Override
    @PreAuthorize(value = "hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public LessonDTO getById(long lessonId) {

        Lesson lesson = lessonRepo.findOne(lessonId);
        return boundMapper.map(lesson);
    }
}
