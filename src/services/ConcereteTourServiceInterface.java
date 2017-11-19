package services;

import entities.ConcreteTour;
import entities.TourHotel;

import java.util.List;
import java.util.Map;

public interface ConcereteTourServiceInterface {
    List getAllConcreteTours();
    ConcreteTour getConcreteTourById(int id);
    List getAllConcreteToursByTourId(int id);
    Map<TourHotel, List<ConcreteTour>> getTourAndItsConcreteTours(String fromCity, String toCity, String fromDate,
                                                                  String toDate, int fromPrice, int toPrice );

}
