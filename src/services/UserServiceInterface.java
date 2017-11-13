package services;

import entities.User;

import java.util.List;

public interface UserServiceInterface {
    boolean add(String login, String password, String passwordAgain);
    void delete(String id);
    boolean check(String login, String password);
    User getUserByLogin(String login);
    User getUserById(int id);
    List getAllUsers();
    boolean existUserByLogin(String login);




}
