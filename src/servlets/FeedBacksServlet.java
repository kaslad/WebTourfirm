package servlets;

import entities.Feedback;
import entities.User;
import helpers.ConfigHelper;
import services.FeedbackService;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "FeedBackServlet")
public class FeedBacksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("current_user");

        FeedbackService feedbackService = new FeedbackService();
        if(request.getParameter("text") != null && request.getParameter("rate") != null){
            String text = request.getParameter("text");
            int rate = Integer.parseInt(request.getParameter("rate"));
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy//MM/dd HH:mm:ss.SS");
            String strDate = sdf.format(cal.getTime());
            feedbackService.addFeedBack(text, rate, strDate, user.getId());

        }

        Map<String, Object> root = new HashMap<>();
        UserService userService = new UserService();
        List<Feedback> feedbackList = feedbackService.getAllFeedbacks();
        List<User> userList = new ArrayList<>();
        for(Feedback feedback : feedbackList){
            System.out.println(feedback.getUserId());
            userList.add(userService.getUserById(feedback.getUserId()));
        }
        if(user != null) {
            System.out.println("userrrrrr" + user.getName() + " last " + user.getLastName() );
            root.put("user_name", user.getName());
            root.put("login", user.getLogin());
            root.put("user_last_name", user.getLastName());
        }

        root.put("feedbackList", feedbackList);
        root.put("userList", userList);
        ConfigHelper.render(request,response,"feedbacks.ftl",(HashMap) root);

    }
}
