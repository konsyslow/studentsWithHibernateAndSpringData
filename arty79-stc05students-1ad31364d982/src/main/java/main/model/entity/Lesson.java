package main.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "lesson")
@NamedQueries({
        @NamedQuery(name="Lesson.findAll", query="select c from Lesson c"),
        @NamedQuery(name="Lesson.findById",
                query="select distinct c from Lesson c where c.id = :id"),
})
@SqlResultSetMapping(
        name="lessonResult",
        entities=@EntityResult(entityClass=Lesson.class)
)
public class Lesson implements Serializable {
    private long id;
    private long groupId;
    private Timestamp lessonDate;
    private int room;
    private String description;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "lesson_date")
    public Timestamp getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    @Column(name = "room")
    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "study_group_id")
    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
