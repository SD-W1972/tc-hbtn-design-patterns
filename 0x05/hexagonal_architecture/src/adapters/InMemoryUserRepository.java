// Adaptador (Implementação do repositório em memória)
package adapters;
import domain.User;
import ports.UserRepository;
import java.util.*;


public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<>();


    public void save(User user)
    {
        database.put(user.getId(), user);
    }

    public User findById(String id)
    {
        //implemente o metodo
    }

    public List<User> findAll()
    {
        //implemente o metodo
    }
}