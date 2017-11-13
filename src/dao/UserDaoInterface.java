package dao;

import entities.User;

import java.util.List;

public interface UserDaoInterface {
    void addUser(User user);
    void deleteUser(int id) ;

    List getAllUsers();
    User getUserById(int id);
    User getUserByLogin(String login);

}
