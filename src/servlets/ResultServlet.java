package servlets;

import entities.User;
import helpers.ConfigHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("current_user");

        Map<String, Object> root = new HashMap<>();









        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ConfigHelper.render(request,response,"results.ftl",(HashMap) root);
    }
}
