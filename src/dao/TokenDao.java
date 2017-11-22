package dao;


import configs.DbSingleton;
import helpers.DeleteTokenFromDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TokenDao implements  TokenDaoInterface {

    @Override
    public void addToken(int id, String token) {

        if (DbSingleton.getConnection() != null && !token.equals("")) {
            String request = "INSERT INTO cookies (id,token) VALUES ( ? , ? )";
            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st = DbSingleton.getConnection().prepareStatement(request);
                st.setInt(1,id);
                st.setString(2,token);
                st.executeUpdate();
                st.close();
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
        }

    }
    @ Override
    public void updateToken(int id, String token) {
        if (DbSingleton.getConnection() != null  && !token.equals("")) {
            String request = "UPDATE cookies SET token = ?  WHERE id = ? ";
            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st = DbSingleton.getConnection().prepareStatement(request);
                st.setString(1,token);
                st.setInt(2,id);
                st.executeUpdate();
                st.close();
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
        }
    }
    @Override

    public void deleteToken(String token) {
        String request = "DELETE FROM cookies WHERE token = ? ";
        DeleteTokenFromDB d = new DeleteTokenFromDB();
        d.delete(request,token);
    }
    @Override
    public int findToken(String token) {
        if (DbSingleton.getConnection() != null && !token.equals("")) {
            String request = "SELECT * FROM cookies " +
                    "WHERE token= ? ";
            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setString(1,token);
                ResultSet resultSet = st.executeQuery();
                while (resultSet.next()) {
                    return resultSet.getInt("id");
                }
                st.close();
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
        }
        return -1;
    }

}