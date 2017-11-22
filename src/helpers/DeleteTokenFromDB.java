package helpers;

import configs.DbSingleton;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTokenFromDB {
    public void delete(String request, String parametr) {

        if (DbSingleton.getConnection() != null && !parametr.equals("")) {

            try {


                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setString(1, parametr);
                st.executeUpdate();
                st.close();

            } catch (SQLException sql) {

                sql.printStackTrace();

            }

        }

    }
}
