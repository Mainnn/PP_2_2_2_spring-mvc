package Hiber.Service;

import Hiber.DAO.CarDAO;
import Hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;
    @Transactional
    @Override
    public void add(Car car) {
        carDAO.add(car);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Car> getCountCar(int count) {
        return carDAO.getCountCar(count);
    }
}
