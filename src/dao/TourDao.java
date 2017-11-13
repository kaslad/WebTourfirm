package dao;

import configs.DbSingleton;
import entities.Tour;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TourDao implements TourDaoInterface {
    @Override
    public void addTour(Tour tour) {
        if (DbSingleton.getConnection() != null && tour != null) {
            String request = "INSERT INTO tour (name, hotel_id, special_mark, description) VALUES (?,?,?,?,?)";

            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setString(1, tour.getName());
                st.setInt(2, tour.getHotelId());
                st.setBoolean(3, tour.isSpecialMark());
                st.setString(4, tour.getDescription());
                st.executeUpdate();
                System.out.println("da");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteTour(int id) {

    }

    @Override
    public List<Tour> getAllTours() {
        String request = ("SELECT * FROM tour");
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            ResultSet resultSet = st.executeQuery();
            List<Tour> a = new ArrayList<>();
            while (resultSet.next()) a.add(new Tour(resultSet.getInt("id"), resultSet.getString("name"),
                    resultSet.getInt("hotel_id"), resultSet.getBoolean("special_mark"),
                    resultSet.getString("description")));


            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;    }

    @Override
    public Tour getTourById(int id) {
        if (DbSingleton.getConnection()!= null) {
            String request = "SELECT * FROM tour WHERE id= ? ";
            try {
                PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
                st.setInt(1,id);
                ResultSet resultSet = st.executeQuery();
                while (resultSet.next()) {
                      new Tour(resultSet.getInt("id"), resultSet.getString("name"),
                            resultSet.getInt("hotel_id"), resultSet.getBoolean("special_mark"),
                            resultSet.getString("description"));

                }
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
