package dao;

import configs.DbSingleton;
import entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements UserDaoInterface{

    @Override
    public void addUser(User user) {
        System.out.println("da");
        if (DbSingleton.getConnection() != null && user != null) {
            String request = "INSERT INTO \"user\" (login,password,phone_number) VALUES (?,?,?)";

            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setString(1, user.getLogin());
                st.setString(2, user.getPassword());
                st.setString(3, "+7");
                st.executeUpdate();
                System.out.println("da");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteUser(int id) {
    }



    @Override
    public User getUserByLogin(String login){
            if (DbSingleton.getConnection() != null && !login.equals("")) {
                String request = "SELECT * FROM \"user\" WHERE login= ? ";
                try {
                    PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                    st.setString(1, login);
                    ResultSet resultSet = st.executeQuery();
                    while (resultSet.next()) {
                        return new User(resultSet.getString("login"), resultSet.getInt("id"),
                                    resultSet.getString("password"), resultSet.getString("cookie"),
                                    resultSet.getString("name"), resultSet.getString("last_name"),
                                    resultSet.getString("father_name"), resultSet.getString("img_url"),
                                    resultSet.getString("sex"), resultSet.getString("passport_series"),
                                    resultSet.getString("passport_number"), resultSet.getString("passport_who_gave"));

                    }
                } catch (SQLException sql) {
                    sql.printStackTrace();
                }
            }
            return null;
        }
    @Override
    public User getUserById(int id) {
        if (DbSingleton.getConnection()!= null) {
            String request = "SELECT * FROM \"user\" WHERE id= ? ";
            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setInt(1,id);
                ResultSet resultSet = st.executeQuery();
                while (resultSet.next()) {
                    return new User(resultSet.getString("login"), resultSet.getInt("id"),
                            resultSet.getString("password"), resultSet.getString("cookie"),
                            resultSet.getString("name"), resultSet.getString("last_name"),
                            resultSet.getString("father_name"), resultSet.getString("img_url"),
                            resultSet.getString("sex"), resultSet.getString("passport_series"),
                            resultSet.getString("passport_number"), resultSet.getString("passport_who_gave"));

                }
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
            return null;
        }
        return null;
    }

    @Override
    public List getAllUsers() {
        String request = ("SELECT * FROM \"user\"");
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            ResultSet resultSet = st.executeQuery();
            List<User> a = new ArrayList<>();
            while (resultSet.next()) a.add(new User(resultSet.getString("login"), resultSet.getInt("id"),
                    resultSet.getString("password"), resultSet.getString("cookie"),
                    resultSet.getString("name"), resultSet.getString("last_name"),
                    resultSet.getString("father_name"), resultSet.getString("img_url"),
                    resultSet.getString("sex"), resultSet.getString("passport_series"),
                    resultSet.getString("passport_number"), resultSet.getString("passport_who_gave"))
            );
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
