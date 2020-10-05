public class User {
    private long id;
    private String login;
    private String pass;
    private String name;

    public User(String login) {
        this.login = login;
    }
    public User(long id, String login, String pass, String name) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {return name;}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
