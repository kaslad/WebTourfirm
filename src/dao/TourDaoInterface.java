package dao;

import entities.Tour;

import java.util.List;

public interface TourDaoInterface {
    void addTour(Tour tour);
    void deleteTour(int id) ;

    List getAllTours();
    Tour getTourById(int id);
    //Tour getUserByLogin(String login);
}
