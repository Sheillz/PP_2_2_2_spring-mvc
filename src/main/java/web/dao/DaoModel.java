package web.dao;


import web.model.Car;

import java.util.List;

public interface DaoModel {
    public List<Car> getCars();

    public List<Car> getIndexCars(int count);


}
