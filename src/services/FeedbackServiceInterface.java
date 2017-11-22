package services;

import entities.Feedback;

import java.util.List;

public interface FeedbackServiceInterface {
    Feedback getFeedBackById(int id);
    List<Feedback> getAllFeedbacks();
    List<Feedback> getAllFeedBacksByUserId(int id);
    boolean addFeedBack(String text, int count, String date, int user_id);
}
