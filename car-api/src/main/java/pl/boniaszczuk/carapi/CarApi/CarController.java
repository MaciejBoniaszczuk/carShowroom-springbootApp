package pl.boniaszczuk.carapi.CarApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.boniaszczuk.carapi.dao.CarDaoImpl;
import pl.boniaszczuk.carapi.model.Car;


import java.util.List;

@RestController
@RequestMapping("/cars")
@CrossOrigin
public class CarController {

    CarDaoImpl carDao;

    @Autowired
    public CarController(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @GetMapping
    public List<Car> getCars(){
        return carDao.findAll();
    }

    @PostMapping
    public void addCar(@RequestBody Car car){
        carDao.addCar(car.getCarId(),car.getBrand(),car.getModel(),car.getColor(),car.getProductionDate());
    }

    @RequestMapping(value = "/byDate", method = RequestMethod.GET)
    public List<Car> getCarsByDate(@RequestParam long date1, @RequestParam long date2){
        return carDao.getByDate(date1, date2);
    }
}
