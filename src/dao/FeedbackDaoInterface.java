package dao;

import entities.Feedback;

import java.util.List;

public interface FeedbackDaoInterface {
    Feedback getFeedBackById(int id);
    List getAllFeedbacks();
    List getAllFeedBacksByUserId(int id);


    boolean addFeedBack(String text, int count, String date, int user_id);
}
