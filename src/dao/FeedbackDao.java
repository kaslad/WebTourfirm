package dao;

import configs.DbSingleton;
import entities.Feedback;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
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
    public boolean addFeedBack(Feedback feedback) {
        if (DbSingleton.getConnection() != null && feedback != null) {
            String request = "INSERT INTO feedback (id, feedback, user_id, rate, date) VALUES (?,?,?,?,?)";

            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setInt(1, feedback.getId());
                st.setString(2, feedback.getFeedback());
                st.setInt(3, feedback.getUserId());
                st.setInt(4, feedback.getRate());
                st.setString(5, feedback.getDate());


                st.executeUpdate();
                return true;

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }
        return false;
    }
}


