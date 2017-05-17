/**
 * Created by admin on 16.05.2017.
 */
@javax.persistence.Entity
public class Lesson {
    private int id;
    private int studyGroupId;
    private Timestamp lessonDate;
    private int room;
    private String description;

    public void setLessonDate(java.sql.Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setLessonDate(java.sql.Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setLessonDate(java.sql.Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setLessonDate(java.sql.Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @javax.persistence.Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "study_group_id")
    public int getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "lesson_date")
    public java.sql.Timestamp getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(java.sql.Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room")
    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "description")
    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Lesson lesson = (Lesson) object;

        if (id != lesson.id) return false;
        if (studyGroupId != lesson.studyGroupId) return false;
        if (room != lesson.room) return false;
        if (lessonDate != null ? !lessonDate.equals(lesson.lessonDate) : lesson.lessonDate != null) return false;
        if (description != null ? !description.equals(lesson.description) : lesson.description != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + studyGroupId;
        result = 31 * result + (lessonDate != null ? lessonDate.hashCode() : 0);
        result = 31 * result + room;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
