package pl.boniaszczuk.carapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.boniaszczuk.carapi.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CarDaoImpl implements CarDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CarDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addCar(long id, String brand, String model, String color, long productionDate) {
        Car car = new Car(id, brand, model, color, productionDate);
        String sql = "INSERT INTO cars VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, car.getCarId(), car.getBrand(), car.getModel(), car.getColor(), car.getProductionDate());
    }

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        String sql = "SELECT * FROM cars";
        return createCarList(carList, sql);
    }

    @Override
    public List<Car> getByDate(long date1, long date2) {
        List<Car> carList = new ArrayList<>();
        String sql = "SELECT * FROM cars WHERE cars.production_date BETWEEN "+date1+" AND "+date2;
        carList = createCarList(carList, sql);
        return  carList;

    }

    private List<Car> createCarList(List<Car> carList, String sql) {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.stream().forEach(element -> carList.add(new Car(
                Long.parseLong(String.valueOf(element.get("car_id"))),
                String.valueOf(element.get("brand")),
                String.valueOf(element.get("model")),
                String.valueOf(element.get("color")),
                Long.parseLong(String.valueOf(element.get("production_date")))
        )));
        return carList;
    }
}
