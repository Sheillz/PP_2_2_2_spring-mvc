package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import web.dao.DaoModelCar;
import web.model.Car;

import java.util.List;

@Component
public class CarServicelmpl implements CarService {
    private final DaoModelCar daoModel;
    @Autowired
    public CarServicelmpl(DaoModelCar daoModel) {
        this.daoModel = daoModel;
    }

    @Override
    public List<Car> getCars() {
        return daoModel.getCars();
    }

    @Override
    public List<Car> getIndexCars(int count) {
        return daoModel.getIndexCars(count);
    }
}
