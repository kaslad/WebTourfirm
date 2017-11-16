package helpers;

import configs.DbSingleton;

import java.sql.PreparedStatement;
import java.sql.SQLException;
public abstract class BDChanger {

    public static void update (String table, String column, Integer id, String text){

        if (DbSingleton.getConnection() != null && table != null && column != null && id != null && text != null ) {
            String request = "UPDATE " + table + " set " + column + " = " + text + " where id = " + id;
            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.execute();
                st.close();

            } catch (SQLException sql) {

                sql.printStackTrace();

            }
        }

    }

}
