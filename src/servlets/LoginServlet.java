package servlets;

import entities.User;
import helpers.ConfigHelper;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends HttpServlet {
   // HashMap<String, String> users = new HashMap<>();
    UserService userService;

    @Override
    public void init() throws ServletException {
        super.init();
        userService = new UserService();


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login").toLowerCase();
        String password = request.getParameter("password");

        if (userService.check(login,password)) {
                request.getSession().setAttribute("current_user", login);
                response.sendRedirect("/login");
                response.sendRedirect("/main");
        }
        else {
            response.sendRedirect("/login?err=Wrong Username&username=" + login);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String err = request.getParameter("err");
        String login = request.getParameter("login");
        Map<String, Object> root = new HashMap<>();
        root.put("err", err);
        root.put("login", login);
        ConfigHelper.render(request, response, "login.ftl", (HashMap)root);

    }
}