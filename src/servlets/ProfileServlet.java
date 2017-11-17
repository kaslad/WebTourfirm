package servlets;

import entities.User;
import helpers.BDChanger;
import helpers.ConfigHelper;
import helpers.Hash;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ProfileServlet")
public class ProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        for(Map.Entry<String, String[]> s: request.getParameterMap().entrySet()){
            System.out.print(s.getKey() +" ");
            for(String i: s.getValue()){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println(request.getParameterMap().entrySet().size());
        String name = request.getParameter("name");
        String login = request.getParameter("login").toLowerCase();
        String email = request.getParameter("email");

        String lastName = request.getParameter("last_name");
        String fatherName = request.getParameter("father_name");
        String imgUrl = request.getParameter("img_url");
        String passportSeries = request.getParameter("passport_series");
        String passportNumber = request.getParameter("passport_number");
        String passportWhoGave = request.getParameter("passport_who_gave");
        String sex = request.getParameter("sex");
        String phoneNumber = request.getParameter("phone_number");

        int id = Integer.parseInt(request.getParameter("id"));


        BDChanger.update("\"user\"", "name", id, "'" + name + "'");
        BDChanger.update("\"user\"", "login", id, "'" + login + "'");
        BDChanger.update("\"user\"", "email", id, "'" + email + "'");
        BDChanger.update("\"user\"", "last_name", id, "'" + lastName + "'");
        BDChanger.update("\"user\"", "father_name", id, "'" + fatherName + "'");
        BDChanger.update("\"user\"", "last_name", id, "'" + lastName + "'");
        BDChanger.update("\"user\"", "passport_series", id, "'" + passportSeries + "'");
        BDChanger.update("\"user\"", "passport_number", id, "'" + passportNumber + "'");
        BDChanger.update("\"user\"", "passport_who_gave", id, "'" + passportWhoGave + "'");
        BDChanger.update("\"user\"", "phone_number", id, "'" + phoneNumber + "'");

        String password = request.getParameter("password");

        password = Hash.getMd5Apache(password);
        BDChanger.update("\"user\"", "passport_who_gave", id, "'" + passportWhoGave + "'");
        request.getSession().setAttribute("current_user", new User(login, id, password,"", name,lastName, fatherName, imgUrl, sex, passportSeries, passportNumber, passportWhoGave, phoneNumber, email));

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        response.sendRedirect("/profile");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("current_user");

        Map<String, Object> root = new HashMap<>();


        root.put("login", user.getLogin());
        root.put("name", user.getName());
        root.put("last_name", user.getLastName());
        root.put("father_name", user.getFatherName());
        root.put("img_url", user.getImgUrl());
        root.put("passport_series", user.getPassportSeries());
        root.put("passport_number", user.getPassportNumber());
        root.put("passport_who_gave", user.getPassportWhoGave());
        root.put("sex", user.getSex());
        root.put("phone_number", user.getPhoneNumber());
        root.put("email", user.getEmail());
        root.put("id", user.getId());
        System.out.println(user);


        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ConfigHelper.render(request,response,"profile.ftl",(HashMap) root);
    }
}
