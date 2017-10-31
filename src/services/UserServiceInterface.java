package services;

import entities.User;

import java.util.List;

public interface UserServiceInterface {
    void add(String login, String password);
    void delete(String id);
    boolean check(String login, String password);
    User getUserByLogin(String login);
    User getUserById(String id);
    List getAllUsers();




}
