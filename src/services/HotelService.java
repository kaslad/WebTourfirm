package services;

import dao.HotelDao;
import entities.Hotel;
import helpers.MyError;

import java.util.List;

public class HotelService implements HotelServiceInterface{
    private HotelDao hotelDao;
    MyError err = null;
    public HotelService(){
        this.hotelDao = new HotelDao();
    }



    @Override
    public Hotel getHotelByName(String name) {
        Hotel hotel = hotelDao.getHotelByName(name);
        err = null;
        if(hotel == null){
            err = new MyError("", "hotel_not_found");
            return null;
        }
        else{
            return hotel;
        }
    }

    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> allHotels = hotelDao.getAllHotels();
        err = null;

        if(allHotels == null){
            err = new MyError("", "no hotels");
            return null;
        }
        return allHotels;
    }

    @Override
    public Hotel getHotelById(int id) {
        Hotel hotel = hotelDao.getHotelById(id);
        err = null;
        if(hotel == null){
            err = new MyError("", "htel_not_found");
            return null;
        }
        else{
            return hotel;
        }
    }
}
