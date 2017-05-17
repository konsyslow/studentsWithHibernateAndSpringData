/**
 * Created by admin on 16.05.2017.
 */
@javax.persistence.Entity
public class Journal {
    private int id;
    private int lessonId;
    private int studentId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "lesson_id")
    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "student_id")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Journal journal = (Journal) object;

        if (id != journal.id) return false;
        if (lessonId != journal.lessonId) return false;
        if (studentId != journal.studentId) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + lessonId;
        result = 31 * result + studentId;
        return result;
    }
}
