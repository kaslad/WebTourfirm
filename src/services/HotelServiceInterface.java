package services;

import entities.Hotel;

import java.util.List;

public interface HotelServiceInterface {
    Hotel getHotelById(int id);
    List<Hotel> getAllHotels();
    Hotel getHotelByName(String name);

}
