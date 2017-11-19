package dao;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import configs.DbSingleton;
import entities.ConcreteTour;
import entities.Hotel;
import entities.Tour;
import entities.TourHotel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
                    resultSet.getInt("tour_id"),resultSet.getString("date"),
                    resultSet.getString("date_end"),
                    resultSet.getString("airline"), resultSet.getString("nutrition_type"),
                    resultSet.getInt("price")
            ));

            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Map<TourHotel,List<ConcreteTour>> getAllConcreteToursByTourParams(String fromCity, String toCity, String fromDate, String toDate, int fromPrice, int toPrice){
        System.out.println("here");
        String request = "select t.hotel_id, t.description, t.from_city, t.to_city,t.special_mark, t.name as tour_name, h.name as hotel_name, h.count_star, h.description, c.id, c.tour_id, c.date, c.date_end,\n" +
                "c.airline, c.nutrition_type, c.price \n" +
                " from tour as t   join concrete_tour as c on c.tour_id = t.id JOIN hotel as h on h.id = t.hotel_id\n" +
                " where t.from_city = ? and t.to_city = ? and price >= ? and  price <= ? and date >= ? and date <= ?" ;

        System.out.println("Concr tour Dao");
        System.out.println(fromCity);
        System.out.println(toCity);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-y");
        System.out.println(toDate);

        System.out.println(fromPrice);
        System.out.println(toPrice);
        try {
            PreparedStatement st = DbSingleton.getConnection().prepareStatement(request);
            st.setString(1, fromCity);
            st.setString(2, toCity);

            st.setInt(3, fromPrice);
            st.setInt(4, toPrice);
           st.setTimestamp(5, new Timestamp ((dateFormat.parse(fromDate)).getTime()));
            System.out.println((dateFormat.parse(fromDate)).getTime());
            System.out.println(new Timestamp ((dateFormat.parse(fromDate)).getTime()));
            st.setTimestamp(6, new Timestamp ((dateFormat.parse(toDate)).getTime()));
            System.out.println(new Timestamp ((dateFormat.parse(toDate)).getTime()));

            ResultSet resultSet = st.executeQuery();
            Map<TourHotel, List<ConcreteTour>> map = new HashMap<>();
            Set<Integer> tourIdSet = new HashSet<>();
            while (resultSet.next()) {
                System.out.println("5");
                Integer id = resultSet.getInt("hotel_id");
                ConcreteTour concreteTour = new ConcreteTour(resultSet.getInt("id"),
                        resultSet.getInt("tour_id"), resultSet.getString("date"),
                        resultSet.getString("date_end"),
                        resultSet.getString("airline"), resultSet.getString("nutrition_type"),
                        resultSet.getInt("price"));
                TourHotel tourHotel = new TourHotel(new Tour(resultSet.getInt("tour_id"), resultSet.getString("tour_name"),
                        resultSet.getInt("hotel_id"), resultSet.getBoolean("special_mark"),
                        resultSet.getString("description"), resultSet.getString("from_city").toLowerCase(),
                resultSet.getString("to_city").toLowerCase()),new Hotel(resultSet.getInt("hotel_id"), resultSet.getString("hotel_name"), resultSet.getInt("count_star"), resultSet.getString("description")));
                if (map.containsKey(tourHotel)) {
                    map.get(tourHotel).add(concreteTour);
                } else {
                    tourIdSet.add(id);
                    List<ConcreteTour> list = new ArrayList<>();
                    list.add(concreteTour);

                    map.put(tourHotel, list);
                }
            }
            System.out.println("map size" + map.size());
            return map;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("map size = 0");
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
                    resultSet.getInt("tour_id"),resultSet.getString("date"),
                    resultSet.getString("date_end"),
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
