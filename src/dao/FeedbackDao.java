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
    public List getAllFeedbacks() {
        return null;
    }

    @Override
    public List getAllFeedBacksByUserId(int id) {
        String request = ("SELECT * FROM feedback where user_id = ?");
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            ResultSet resultSet = st.executeQuery();
            List<Feedback> a = new ArrayList<>();
            while (resultSet.next()) a.add(new Feedback(resultSet.getString("feedback"), resultSet.getInt("rate"),
                    resultSet.getLong("date"), resultSet.getInt("id"),
                    resultSet.getInt("user_id"), resultSet.getInt("hotel_id")));
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addFeedBack(Feedback feedback) {
        if (DbSingleton.getConnection() != null && feedback != null) {
            String request = "INSERT INTO feedback (id, feedback, user_id, rate, date, hotel_id) VALUES (?,?)";

            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setInt(1, feedback.getId());
                st.setString(2, feedback.getFeedback());
                st.setInt(3, feedback.getUserId());
                st.setInt(4, feedback.getRate());
                st.setLong(5, feedback.getDate().getTimeInMillis());
                st.setInt(6, feedback.getHotelId());

                st.executeUpdate();
                return true;

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }
        return false;
    }
}


