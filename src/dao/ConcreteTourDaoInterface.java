package dao;

import entities.ConcreteTour;
import entities.Tour;

import java.util.List;

public interface ConcreteTourDaoInterface {
    List getAllConcreteTours();
    ConcreteTour getConcreteTourById(int id);
    List getAllConcreteToursByTourId(int id);


}
