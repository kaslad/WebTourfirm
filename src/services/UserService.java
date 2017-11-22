package services;

import dao.UserDao;
import entities.User;
import helpers.Hash;
import helpers.MyError;
import helpers.RegularExp;

import java.util.List;

public class UserService implements UserServiceInterface{
    private UserDao userDao;
    MyError err = null;
    public UserService(){
        this.userDao = new UserDao();
    }


    @Override
    public User add(String login, String password, String passwordAgain) {


        if ( RegularExp.IsLoginRight(login) && RegularExp.IsPasswordRight(password) && RegularExp.IsPasswordRight(passwordAgain)){
            if (password.equals(passwordAgain)) {
                password = Hash.getMd5Apache(password);
                User newUser = new User(login, password);
                if (userDao.getUserByLogin( login) == null) {
                    userDao.addUser(newUser);
                    return newUser;
                }
                else{
                    err = new MyError("", "user_exist");
                    System.out.println("user_ex");
                }

            } else {
                err = new MyError("", "Passwords do not match");
            }
        }else{
            err = new MyError("", "wrong_login_or_password_inp");
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }


    @Override
    public User check(String login, String password) {
        User user = userDao.getUserByLogin(login);
        System.out.println("here");
        System.out.println("password");
        if (user != null) {
            System.out.println("user!=nulll");
            System.out.println(password);
            System.out.println(login);
            System.out.println(user.getPassword());
            if (Hash.getMd5Apache(password).equals(user.getPassword())) {
                System.out.println("true");
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        err = null;
        User user = null;
        user = userDao.getUserByLogin(login);
        System.out.println(user.getLogin() + " METHOD");

        if (user == null) {
            err = new MyError("", "user_not_found");
            return null;
        } else {
            return user;
        }
    }

    @Override
    public User getUserById(int id) {
        err = null;
        User user = userDao.getUserById(id);
        System.out.println("id  "  + id);
        if (user == null) {
            err = new MyError("", "user_not_found");
            return null;
        } else {
            return user;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public boolean existUserByLogin(String login) {
        return getUserByLogin(login) != null;
    }
}
