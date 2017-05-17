/**
 * Created by admin on 16.05.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "user_st", schema = "public", catalog = "students")
public class UserSt {
    private int id;
    private String login;
    private String password;
    private boolean isBlocked;

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
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
    @javax.persistence.Column(name = "password")
    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_blocked")
    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        UserSt userSt = (UserSt) object;

        if (id != userSt.id) return false;
        if (isBlocked != userSt.isBlocked) return false;
        if (login != null ? !login.equals(userSt.login) : userSt.login != null) return false;
        if (password != null ? !password.equals(userSt.password) : userSt.password != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (isBlocked ? 1 : 0);
        return result;
    }
}
