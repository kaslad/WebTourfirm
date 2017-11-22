package helpers;

import entities.User;
import services.TokenService;
import services.TokenServiceInterface;
import services.UserService;
import services.UserServiceInterface;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieToSession {
    public static User add(ServletRequest req){
        Cookie[] cookies = ((HttpServletRequest) req).getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("current_user")) {

                    TokenServiceInterface tokenService = new TokenService();
                    int id = tokenService.findToken(cookie.getValue());
                    UserServiceInterface userService = new UserService();
                    return userService.getUserById(id);

                }
            }
        }
        return null;
    }

}