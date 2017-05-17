package main.model.dao.impl;

import main.model.dao.StudentDAO;
import main.model.dao.mappers.StudentMapper;
import main.model.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;


/**
 *
 */
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Collection<Student> getAll() {

        return studentMapper.getAllStudents();
        /*try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            StudentMapper mapper = factory.openSession().getMapper(StudentMapper.class);
            return mapper.getAllStudents();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
        return null;*/

        /*List<Student> students = em.createNamedQuery("Student.findAll", Student.class).getResultList();

        return students;*/
    }


    @Override
    public Student getById(Long id) {
        /*Student student = em.find(Student.class, id);
        return student;*/
        /*try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            StudentMapper mapper = factory.openSession().getMapper(StudentMapper.class);
            return mapper.getStudentById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
        return null;*/
        return studentMapper.getStudentById(id);
    }

    @Override
    public Long insert(Student entity) {
        if (entity.getId() == 0) {
            em.persist(entity);
        } else {
            em.merge(entity);
        }
        return entity.getId();
    }

    @Override
    public void update(Student entity) {
    }

    @Override
    public void delete(Student entity) {
        studentMapper.deleteStudent(entity.getId());
    }


    @Override
    public String getStudentLogin(Student student) {
        String login = null;

        return login;
    }
}
