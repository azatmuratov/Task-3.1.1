package web.sprungboot.service;

import web.sprungboot.model.User;

import java.util.List;

public interface UserService {
    List<User>getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}
