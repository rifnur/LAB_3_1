public interface AuthService {
    void start();
    //String getNickByLoginPass(String login, String pass);
    String findByLoginAndPassword(String login, String pass);
    void stop();
}