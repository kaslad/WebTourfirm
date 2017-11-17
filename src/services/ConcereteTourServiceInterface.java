package services;

import entities.ConcreteTour;
import entities.Tour;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConcereteTourServiceInterface {
    List getAllConcreteTours();
    ConcreteTour getConcreteTourById(int id);
    List getAllConcreteToursByTourId(int id);
    Map<Tour, List<ConcreteTour>> getTourAndItsConcreteTours(String fromCity, String toCity, String fromDate,
                                                             String toDate, String fromPrice, String toPrice );

}
