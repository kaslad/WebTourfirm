package servlets;

import entities.ConcreteTour;
import entities.Hotel;
import entities.Tour;
import helpers.ConfigHelper;
import services.ConcreteTourService;
import services.HotelService;
import services.TourService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TourItemServlet")
public class TourItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Object> root = new HashMap<>();
        int concTourId = Integer.parseInt(request.getParameter("conc_tour_id"));
        ConcreteTourService concreteTourService = new ConcreteTourService();
        ConcreteTour concreteTour = concreteTourService.getConcreteTourById(concTourId);
        TourService tourService = new TourService();
        HotelService hotelService = new HotelService();
        Tour tour = (tourService.getTourById(concreteTour.getTourId()));
        Hotel hotel = hotelService.getHotelById(tour.getHotelId());


        root.put("hotel", hotel);
        root.put("tour", tour);
        root.put("conc_tour", concreteTour);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ConfigHelper.render(request,response,"tour_item.ftl",(HashMap) root);
    }
}
