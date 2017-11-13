package services;

import entities.Tour;

import java.util.List;

public interface TourServiceInterface {


    boolean addTour(int id, String name, int hotelId, boolean specialMark, String description);

    void deleteTour(int id) ;

    List getAllTours();
    Tour getTourById(int id);
}
