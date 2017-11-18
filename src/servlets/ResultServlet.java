package servlets;

import com.oracle.javafx.jmx.json.JSONException;
import entities.ConcreteTour;
import entities.Tour;
import entities.TourHotel;
import entities.User;
import helpers.ConfigHelper;
import services.ConcreteTourService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("current_user");

        Map<String, Object> root = new HashMap<>();


        ConcreteTourService concreteTourService = new ConcreteTourService();
        String fromCity = request.getParameter("from_city");
        String toCity = request.getParameter("to_city");
        Calendar fromDate = Calendar.getInstance();
        fromDate.setTimeInMillis(Long.parseLong(request.getParameter("from_date")));
        Calendar toDate = Calendar.getInstance();
        toDate.setTimeInMillis(Long.parseLong(request.getParameter("to_date")));
        int fromPrice = Integer.parseInt(request.getParameter("from_price"));
        int toPrice = Integer.parseInt(request.getParameter("to_price"));
        Map<TourHotel,List<ConcreteTour>> mapTourAndItsConcTours = concreteTourService.getTourAndItsConcreteTours(fromCity, toCity, fromDate, toDate, fromPrice, toPrice);

        root.put("toursAndConcTours", mapTourAndItsConcTours);





        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ConfigHelper.render(request,response,"results.ftl",(HashMap) root);
    }
}
