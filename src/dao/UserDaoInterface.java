package dao;

import entities.User;

import java.util.List;

public interface UserDaoInterface {
    void addUser(User user);
    void deleteUser(String id) ;

    List getAllUsers();
    User getUserById(String id);
    User getUserByLogin(String login);

}
