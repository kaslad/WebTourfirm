package services;

import dao.UserDao;
import entities.User;

import java.util.List;

public class UserService implements UserServiceInterface{
    private UserDao userDao;
    public UserService(){
        this.userDao = new UserDao();
    }


    @Override
    public void add(String login, String password) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean check(String login, String password) {
        return true;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public List getAllUsers() {
        return null;
    }
}
