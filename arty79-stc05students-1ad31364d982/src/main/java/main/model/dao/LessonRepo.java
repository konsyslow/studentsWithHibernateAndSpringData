package main.model.dao;

import main.model.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 16.05.2017.
 */
@Repository
public interface LessonRepo extends CrudRepository<Lesson,Long> {
}
