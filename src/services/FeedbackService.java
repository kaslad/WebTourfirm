package services;

import dao.FeedbackDao;
import entities.Feedback;
import helpers.MyError;

import java.util.List;

public class FeedbackService implements FeedbackServiceInterface {
    private FeedbackDao feedbackDao = null;
    private MyError err = null;
    public FeedbackService(){
        feedbackDao = new FeedbackDao();
    }
    @Override
    public Feedback getFeedBackById(int id) {
        return null;
    }

    @Override
    public List<Feedback> getAllFeedbacks() {
        List<Feedback> list = feedbackDao.getAllFeedbacks();
        err = null;

        if(list == null){
            err = new MyError("", "no feedback");
            return null;
        }
        return list;
    }

    @Override
    public List<Feedback> getAllFeedBacksByUserId(int id) {
        return null;
    }

    @Override
    public boolean addFeedBack(String text, int count, String date, int user_id) {
        return feedbackDao.addFeedBack(text, count, date, user_id);


    }

}
