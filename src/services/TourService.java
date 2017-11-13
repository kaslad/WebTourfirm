package services;

import dao.TourDao;
import dao.UserDao;
import entities.Tour;
import helpers.MyError;

import java.util.List;

public class TourService implements TourServiceInterface{
    private TourDao tourDao;
    MyError err = null;
    public TourService(){
        this.tourDao = new TourDao();
    }
    @Override

    public boolean addTour(int id, String name, int hotelId, boolean specialMark, String description) {
        return false;
    }



    @Override
    public void deleteTour(int id) {

    }

    @Override
    public List<Tour> getAllTours() {
        List<Tour> allTours = tourDao.getAllTours();
        err = null;

        if(allTours == null){
            err = new MyError("", "no tours");
            return null;
        }
        return allTours;
    }

    @Override
    public Tour getTourById(int id) {
        Tour tour = tourDao.getTourById(id);
        err = null;
        if(tour == null){
            err = new MyError("", "tour_not_found");
            return null;
        }
        else{
            return tour;
        }
    }
}
