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
        String password_again = request.getParameter("password_again");
        String login = request.getParameter("login").toLowerCase();
        String password = request.getParameter("password");
        if(password_again != null){
            System.out.println(login);
            User user = userService.add(login,password,password_again);
            if(user != null){
                System.out.println("user  not exists");
                userService.add(login,password,password_again);
                request.getSession().setAttribute("current_user", user);
                response.sendRedirect("/profile");
                return;
            }
            else{
                response.sendRedirect("/login");
                return;
            }
        }
        User user = userService.check(login,password);
        if (user != null) {

            request.getSession().setAttribute("current_user", user);
            response.sendRedirect("/profile");
            return;
        }
        else{
            response.sendRedirect("/login?err=Wrong Username&username=" + password);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String err = request.getParameter("err");
        String login = request.getParameter("login");
        Map<String, Object> root = new HashMap<>();
        root.put("err", err);
        root.put("login", login);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ConfigHelper.render(request, response, "login.ftl", (HashMap)root);

    }
}