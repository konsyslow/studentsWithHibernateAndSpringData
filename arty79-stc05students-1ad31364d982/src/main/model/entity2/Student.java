/**
 * Created by admin on 16.05.2017.
 */
@javax.persistence.Entity
public class Student {
    private int id;
    private String name;
    private int age;
    private Integer groupId;
    private Integer userStId;

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    public void setUserStId(java.lang.Integer userStId) {
        this.userStId = userStId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    public void setUserStId(java.lang.Integer userStId) {
        this.userStId = userStId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    public void setUserStId(java.lang.Integer userStId) {
        this.userStId = userStId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    public void setUserStId(java.lang.Integer userStId) {
        this.userStId = userStId;
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
    @javax.persistence.Column(name = "name")
    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "group_id")
    public java.lang.Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_st_id")
    public java.lang.Integer getUserStId() {
        return userStId;
    }

    public void setUserStId(java.lang.Integer userStId) {
        this.userStId = userStId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Student student = (Student) object;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (groupId != null ? !groupId.equals(student.groupId) : student.groupId != null) return false;
        if (userStId != null ? !userStId.equals(student.userStId) : student.userStId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (userStId != null ? userStId.hashCode() : 0);
        return result;
    }
}
