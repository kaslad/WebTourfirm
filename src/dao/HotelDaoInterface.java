package dao;

import entities.Hotel;

import java.util.List;

public interface HotelDaoInterface {
    Hotel getHotelById(int id);
    List getAllHotels();
    Hotel getHotelByName(String name);



}
