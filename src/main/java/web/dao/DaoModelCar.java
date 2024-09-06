package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoModelCar implements DaoModel {
    private static int CARCOUNT;
    List<Car> cars = new ArrayList<>();

    public DaoModelCar() {
        cars.add(new Car(++CARCOUNT, "W8", "BMW", "red"));
        cars.add(new Car(++CARCOUNT, "X5", "BMW", "blue"));
        cars.add(new Car(++CARCOUNT, "X6", "BMW", "green"));
        cars.add(new Car(++CARCOUNT, "X7", "BMW", "black"));
        cars.add(new Car(++CARCOUNT, "X8", "BMW", "white"));
    }


    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getIndexCars(int count) {
        return getCars().stream().limit(count).toList();
    }
}
