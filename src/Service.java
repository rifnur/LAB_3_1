import java.util.Collection;

public interface Service<T> {
    Collection<T> findAll();
    T findById(int id);
    T findByLoginPass(String login,String pass);
    void update(T object);
    boolean add(T object);
}
