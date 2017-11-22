package servlets;

import entities.User;
import helpers.ConfigHelper;
import helpers.RegularExp;
import helpers.Token;
import services.TokenService;
import services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
        String login = request.getParameter("login");
        String password = request.getParameter("password");


        if(password_again != null){
            System.out.println(login);
            if(!RegularExp.IsLoginRight(login)){
                response.sendRedirect("/login?login_pattern=false");
                return;
            }
            if(!RegularExp.IsPasswordRight(password)){
                response.sendRedirect("/login?password_pattern=false");
                return;
            }
            if (!password_again.equals(password)){
                response.sendRedirect("/login?password_match=false");
                return;
            }
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
            if(request.getParameter("check") != null){
                String token = Token.getToken();
                Cookie cookie = new Cookie("current_user", token);
                cookie.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(cookie);
                TokenService ts = new TokenService();
                ts.addToken(user.getId(), token);
            }
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
        String login_pattern = null;
        if(request.getParameter("login_pattern") != null){
            login_pattern = request.getParameter("login_pattern");
        }
        String password_pattern = null;
        if(request.getParameter("password_pattern") != null){
            password_pattern = request.getParameter("password_pattern");
        }
        String password_match = null;
        if(request.getParameter("password_match") != null){
            password_match = request.getParameter("password_match");
        }

        Map<String, Object> root = new HashMap<>();
        root.put("err", err);
        root.put("login", login);
        root.put("login_pattern", login_pattern);
        root.put("password_pattern", password_pattern);
        root.put("password_match", password_match);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ConfigHelper.render(request, response, "login.ftl", (HashMap)root);

    }
}