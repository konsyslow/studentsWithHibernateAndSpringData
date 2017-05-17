package main.services;

import main.model.dto.LessonDTO;

import java.util.List;

/**
 * Created by admin on 16.05.2017.
 */
public interface LessonService {
    List<LessonDTO> getAllLessons();

    //long saveStudent(StudentDTO student);
    void saveLesson(LessonDTO lessonDTO);

    void updateLesson(LessonDTO lessonDTO);

    void deleteLesson(long id);

    LessonDTO getById(long lessonId);
}
