package servlets;

import helpers.ConfigHelper;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainPageServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String err = request.getParameter("err");
        String login = request.getParameter("login");
        Map<String, Object> root = new HashMap<>();
        root.put("err", err);
        root.put("login", login);
        ConfigHelper.render(request, response, "login.ftl", (HashMap)root);
        ConfigHelper.render(request, response, "main_page", (HashMap)root);
    }
}
