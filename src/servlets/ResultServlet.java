package servlets;

import entities.ConcreteTour;
import entities.Tour;
import entities.TourHotel;
import entities.User;
import helpers.ConfigHelper;
import javafx.util.Pair;
import services.ConcreteTourService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("current_user");
        // out params
        /* Map<String, String[]> params = request.getParameterMap();
        System.out.println("Result Servlet" + params.size());
        for(String i: params.keySet()){
            System.out.println("key = " + i);
            for(String j : params.get(i)){
                System.out.print("val = " + j);
            }
            System.out.println();
        }
        */
        Map<String, Object> root = new HashMap<>();


        ConcreteTourService concreteTourService = new ConcreteTourService();
        Map<TourHotel, List<ConcreteTour>> mapTourAndItsConcTours = new HashMap<>();

        List<Pair<TourHotel, List<ConcreteTour>>> list = new ArrayList<>();


        if(request.getParameter("from_date") != "" && request.getParameter("to_date") != null
                && request.getParameter("from_city") != null && request.getParameter("to_city") != null) {
            String fromCity = request.getParameter("from_city").toLowerCase();
            String toCity = request.getParameter("to_city").toLowerCase();
            String toDate = getTimeStampDate(request.getParameter("to_date"));
            System.out.println("todate" + toDate);
            String fromDate = getTimeStampDate(request.getParameter("from_date"));
            System.out.println("fromdate" + fromDate);



            String price [] = request.getParameter("price").split("-" );
            System.out.println(request.getParameter("price") + " price");
            int fromPrice = Integer.parseInt(price[0]);
            int toPrice = Integer.parseInt(price[1]);
            mapTourAndItsConcTours = concreteTourService.getTourAndItsConcreteTours(fromCity, toCity, fromDate, toDate, fromPrice, toPrice);

            /*for(int i = 0; i < tourHotelSet.size(); i++){
                System.out.print(tourHotelSet.get(i).getTour().getId());
                System.out.println(" hotel_id = " + tourHotelSet.get(i).getHotel().getId());
                List<ConcreteTour> concreteTourList = new ArrayList<>(mapTourAndItsConcTours.get(tourHotelSet.get(i)));
                System.out.print("id = ");
                for(int g = 0; g < concreteTourList.size(); g++){
                    System.out.print(concreteTourList.get(g).getId() + " ");
                }
                System.out.println();
            }*/

                try {
                    for (Map.Entry<TourHotel, List<ConcreteTour>> entry : mapTourAndItsConcTours.entrySet()) {
                        list.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                } catch(NullPointerException e){
                    e.printStackTrace();
                }


        }
        root.put("list", list);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ConfigHelper.render(request,response,"results.ftl",(HashMap) root);
    }
    private static String getTimeStampDate(String s){
        s = s.replaceAll("/","-");
        StringBuilder sb = new StringBuilder();
        for( char i : s.toCharArray()){
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getTimeStampDate("17/11/2017"));
    }
}
