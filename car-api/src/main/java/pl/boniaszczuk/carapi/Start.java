package pl.boniaszczuk.carapi;


import org.springframework.stereotype.Component;
import pl.boniaszczuk.carapi.dao.CarDaoImpl;


@Component
public class Start {

    private CarDaoImpl carDao;

    public Start(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

}
