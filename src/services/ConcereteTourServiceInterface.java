package services;

import entities.ConcreteTour;
import entities.Tour;
import entities.TourHotel;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConcereteTourServiceInterface {
    List getAllConcreteTours();
    ConcreteTour getConcreteTourById(int id);
    List getAllConcreteToursByTourId(int id);
    Map<TourHotel, List<ConcreteTour>> getTourAndItsConcreteTours(String fromCity, String toCity, Calendar fromDate,
                                                                  Calendar toDate, int fromPrice, int toPrice );

}
