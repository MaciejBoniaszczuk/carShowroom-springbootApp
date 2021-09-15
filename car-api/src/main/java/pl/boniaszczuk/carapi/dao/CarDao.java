package pl.boniaszczuk.carapi.dao;

import pl.boniaszczuk.carapi.model.Car;


import java.util.List;

public interface CarDao {

    void addCar(long id, String brand, String model, String color, long productionDate);

    List<Car> findAll();

    List<Car> getByDate(long date1, long date2);
}
