package entities;

import helpers.Hash;

public class TourHotel {
    private Tour tour;
    private Hotel hotel;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TourHotel){
            TourHotel tourHotel = (TourHotel) obj;
            return tourHotel.getHotel().getId() == hotel.getId() && tourHotel.getTour().getId() == tour.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (tour.getId() + "#" + hotel.getId()).hashCode();
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public TourHotel(Tour tour, Hotel hotel) {
        this.tour = tour;
        this.hotel = hotel;
    }
}
