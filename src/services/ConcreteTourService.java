package services;

import dao.ConcreteTourDao;
import entities.ConcreteTour;
import entities.Tour;
import helpers.MyError;

import java.util.List;
import java.util.Map;

public class ConcreteTourService implements ConcereteTourServiceInterface {
    private ConcreteTourDao concreteTourDao;
    MyError err = null;
    ConcreteTourService(){
        ConcreteTourDao concreteTourDao = new ConcreteTourDao();
    }
    @Override
    public List<ConcreteTour> getAllConcreteTours() {
        return null;
    }

    @Override
    public ConcreteTour getConcreteTourById(int id) {
        return null;
    }

    @Override
    public List<ConcreteTour> getAllConcreteToursByTourId(int id) {

        List<ConcreteTour> list = concreteTourDao.getAllConcreteToursByTourId(id);
        err = null;

        if(list == null){
            err = new MyError("", "No concrete Tours by id = " + id);
            return null;
        }
        return list;
    }

    @Override
    public Map<Tour, List<ConcreteTour>> getTourAndItsConcreteTours(String fromCity, String toCity, String fromDate, String toDate, String fromPrice, String toPrice) {

        Map<Tour, List<ConcreteTour>> map = null;
        map = getTourAndItsConcreteTours(fromCity, toCity, fromDate, fromCity, fromPrice, toPrice);

        err = null;

        if(map == null){
            err = new MyError("", "No tours and its Concrete Tours by this request = " );
            return null;
        }
        return map;
    }

}
