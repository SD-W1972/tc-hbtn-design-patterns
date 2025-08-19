package domain;

import ports.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUser(String id, String name) {
        this.userRepository.save(new User(id, name));
    }


    public User getUser(String id) {
        //implemente o metodo
    }


    public List<User> listUsers() {
        //implemente o metodo
    }
}