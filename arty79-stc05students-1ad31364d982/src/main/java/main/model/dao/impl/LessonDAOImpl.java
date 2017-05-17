package main.model.dao.impl;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.model.dao.LessonDAO;
import main.model.entity.Lesson;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 */
@Repository
@Transactional
public class LessonDAOImpl implements LessonDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Lesson> getAll() {
        //Set<Lesson> lessons = new HashSet<>();
        List<Lesson> lessons = em.createNamedQuery("Lesson.findAll", Lesson.class).getResultList();
        return lessons;
    }

    @Override
    public Lesson getById(Long id) {
        //Lesson lesson = null;
        Lesson lesson = em.find(Lesson.class,id);

        return lesson;
    }

    @Override
    public Long insert(Lesson entity) {
        //long result = -1;

        if (entity.getId() == 0) {
            em.persist(entity);
        } else {
            em.merge(entity);
        }
        return entity.getId();
        //return result;
    }

    @Override
    public void update(Lesson entity) {

    }

    @Override
    public void delete(Lesson entity) {

    }

}
