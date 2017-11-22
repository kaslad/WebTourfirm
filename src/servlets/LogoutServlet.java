package servlets;


import services.TokenService;
import services.TokenServiceInterface;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {

    TokenService tokenService = new TokenService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        for (Cookie cookie: cookies
                ) {
            if (cookie.getName().equals("current_user")) {
                String current_token = cookie.getValue();
                cookie.setValue("");
                cookie.setMaxAge(0);
                TokenServiceInterface tokenService = new TokenService();
                if (tokenService.findToken(current_token)!= -1) {
                    tokenService.deleteToken(current_token);
                }
                response.addCookie(cookie);
            }
        }
        request.getSession().invalidate();
        response.sendRedirect("/login");

    }

}
