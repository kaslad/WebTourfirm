package servlets;


import entities.ConcreteTour;
import entities.TourHotel;
import freemarker.template.TemplateException;
import helpers.ConfigHelper;
import javafx.util.Pair;

import org.json.JSONObject;
import services.ConcreteTourService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "hotDealsAJaxServlet")
public class HotDealsAjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String from_city = request.getParameter("from_city").toLowerCase();
        String to_city = request.getParameter("to_city").toLowerCase();
        String res = "";
        //System.out.println("AJAX HERE I AM" + to_city);

        ConcreteTourService concreteTourService = new ConcreteTourService();
        Map<TourHotel, List<ConcreteTour>> mapTourAndItsConcTours = null;
        List<Pair<TourHotel, List<ConcreteTour>>> list = new ArrayList<>();
        Map<String, Object> root = new HashMap<>();


        // узнать у БД фамилии студентов, в которых есть q

        if (from_city != null && to_city != null) {

            mapTourAndItsConcTours = concreteTourService.getAllSpecialConcreteToursByCity(from_city, to_city);List<TourHotel> tourHotelSet = new ArrayList<>(mapTourAndItsConcTours.keySet());
            for (Map.Entry<TourHotel, List<ConcreteTour>> entry : mapTourAndItsConcTours.entrySet()) {
                list.add(new Pair(entry.getKey(), entry.getValue()));
            }
            root.put("list", list);
            res = ConfigHelper.render(request, "hot_deals_body.ftl", (HashMap) root);

        }
        JSONObject jsonObject = new JSONObject();
        try {

            jsonObject.put("list", res);
        } catch (Exception e) {
            e.printStackTrace();
        }
     System.out.println("res = " + res);
System.out.println("jsonObject = " + jsonObject);
        response.setContentType("text/json");
        response.getWriter().print(jsonObject.toString());
        response.getWriter().close();
    }
}
