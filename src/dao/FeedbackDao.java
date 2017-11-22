package dao;

import configs.DbSingleton;
import entities.Feedback;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FeedbackDao implements FeedbackDaoInterface {
    @Override
    public Feedback getFeedBackById(int id) {
        return null;
    }

    @Override
    public List<Feedback> getAllFeedbacks() {
        String request = "SELECT * FROM feedback ";
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            ResultSet resultSet = st.executeQuery();
            List<Feedback> a = new ArrayList<>();
            while (resultSet.next()) a.add(new Feedback(resultSet.getString("feedback"), resultSet.getInt("rate"),
                    resultSet.getString("date"), resultSet.getInt("id"),
                    resultSet.getInt("user_id")));
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Feedback> getAllFeedBacksByUserId(int id) {
        String request = ("SELECT * FROM feedback where user_id = ?");
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            ResultSet resultSet = st.executeQuery();
            List<Feedback> a = new ArrayList<>();
            while (resultSet.next()) a.add(new Feedback(resultSet.getString("feedback"), resultSet.getInt("rate"),
                    resultSet.getString("date"), resultSet.getInt("id"),
                    resultSet.getInt("user_id")));
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public boolean addFeedBack(String text, int count, String date, int user_id) {
        if (DbSingleton.getConnection() != null && text != null) {
            String request = "INSERT INTO feedback (feedback, user_id, rate, date) VALUES (?,?,?,?)";

            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);

                Date  today = new Date();
                Timestamp timestamp = new Timestamp(today.getTime());

                st.setString(1, text);
                st.setInt(2, user_id);
                st.setInt(3, count);
                st.setTimestamp(4, timestamp);


                st.executeUpdate();
                return true;

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }
        return false;
    }
}


