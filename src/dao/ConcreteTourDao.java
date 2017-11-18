package dao;

import configs.DbSingleton;
import entities.ConcreteTour;
import entities.Hotel;
import entities.Tour;
import entities.TourHotel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ConcreteTourDao implements ConcreteTourDaoInterface {
    @Override
    public List<ConcreteTour> getAllConcreteTours() {
        String request = ("SELECT * FROM concrete_tour");
        return getAllConcreteTours(request);

    }

    @Override
    public ConcreteTour getConcreteTourById(int id) {
        return null;
    }
    private List<ConcreteTour> getAllConcreteTours(String request){
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            ResultSet resultSet = st.executeQuery();
            List<ConcreteTour> a = new ArrayList<>();
            while (resultSet.next()) a.add(new ConcreteTour(resultSet.getInt("id"),
                    resultSet.getInt("tour_id"),resultSet.getLong("date"),
                    resultSet.getLong("date_end"),
                    resultSet.getString("airline"), resultSet.getString("nutrition_type"),
                    resultSet.getInt("price")
            ));

            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Map<TourHotel,List<ConcreteTour>> getAllConcreteToursByTourParams(String fromCity, String toCity, Calendar fromDate, Calendar toDate, int fromPrice, int toPrice){
        String request = "select t.id, t.hotel_id, t.description, t.from_city, t.to_city,t.special_mark, t.name,t.id, h.id, h.name, h.count_star, h.description, c.id, c.date, c.date_end,\n" +
                "c.airline, c.nutrition_type, c.price, \n" +
                " from tour as t   join concrete_tour as c on c.tour_id = t.id JOIN hotel as h on h.id = t.hotel_id\n" +
                " where t.from_city = ? and t.to_city = ? and price >= ? and price <= and date <= ? and date >= ?";
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            st.setString(1, fromCity);
            st.setString(2, toCity);
            st.setLong(3, fromDate.getTimeInMillis());
            st.setLong(4, toDate.getTimeInMillis());
            st.setInt(5, fromPrice);
            st.setInt(6, toPrice);
            ResultSet resultSet = st.executeQuery();
            Map<TourHotel, List<ConcreteTour>> map = new HashMap<>();
            Set<Integer> tourIdSet = new HashSet<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("h.id");
                ConcreteTour concreteTour = new ConcreteTour(resultSet.getInt("c.id"),
                        resultSet.getInt("c.tour_id"), resultSet.getLong("c.date"),
                        resultSet.getLong("c.date_end"),
                        resultSet.getString("c.airline"), resultSet.getString("c.nutrition_type"),
                        resultSet.getInt("c.price"));
                TourHotel tourHotel = new TourHotel(new Tour(resultSet.getInt("t.id"), resultSet.getString("t.name"),
                        resultSet.getInt("t.hotel_id"), resultSet.getBoolean("t.special_mark"),
                        resultSet.getString("t.description"), resultSet.getString("t.from_city"),
                resultSet.getString("t.to_city")),new Hotel(resultSet.getInt("h.id"), resultSet.getString("h.name"), resultSet.getInt("h.count_star"), resultSet.getString("h.description")));
                if (map.containsKey(tourHotel)) {
                    map.get(tourHotel).add(concreteTour);
                } else {
                    tourIdSet.add(id);
                    List<ConcreteTour> list = new ArrayList<>();
                    list.add(concreteTour);

                    map.put(tourHotel, list);
                }
            }

            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }




    @Override
    public List<ConcreteTour> getAllConcreteToursByTourId(int id) {
        String request = "SELECT * FROM concrete_tour where tour_id = ?";
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            st.setInt(1, id);
            ResultSet resultSet = st.executeQuery();
            List<ConcreteTour> a = new ArrayList<>();
            while (resultSet.next()) a.add(new ConcreteTour(resultSet.getInt("id"),
                    resultSet.getInt("tour_id"),resultSet.getLong("date"),
                    resultSet.getLong("date_end"),
                    resultSet.getString("airline"), resultSet.getString("nutrition_type"),
                    resultSet.getInt("price")
            ));

            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }



}
