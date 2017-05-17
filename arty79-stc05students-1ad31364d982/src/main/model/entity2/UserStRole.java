/**
 * Created by admin on 16.05.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "user_st_role", schema = "public", catalog = "students")
public class UserStRole {
    private int id;
    private String login;
    private String userStRole;

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setUserStRole(java.lang.String userStRole) {
        this.userStRole = userStRole;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setUserStRole(java.lang.String userStRole) {
        this.userStRole = userStRole;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setUserStRole(java.lang.String userStRole) {
        this.userStRole = userStRole;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setUserStRole(java.lang.String userStRole) {
        this.userStRole = userStRole;
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
    @javax.persistence.Column(name = "login")
    public java.lang.String getLogin() {
        return login;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_st_role")
    public java.lang.String getUserStRole() {
        return userStRole;
    }

    public void setUserStRole(java.lang.String userStRole) {
        this.userStRole = userStRole;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        UserStRole that = (UserStRole) object;

        if (id != that.id) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (userStRole != null ? !userStRole.equals(that.userStRole) : that.userStRole != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (userStRole != null ? userStRole.hashCode() : 0);
        return result;
    }
}
