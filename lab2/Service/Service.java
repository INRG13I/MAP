package Service;

import Domain.Car;
import Repositories.ConsoleRepository;

import java.util.ArrayList;
public class Service {

    private ConsoleRepository<Car> car_repo=new ConsoleRepository<>();

    private boolean find_car(Integer id){

        for (Car car:car_repo.getAll()) {
            if (car.getId()==id){
                return true;
            }
        }
        return false;
    }

    public void add(Car entity) {

        car_repo.add(entity);
    }

    public void delete_car(Integer id) {

        car_repo.delete(id);
    }

    public void update(Integer id,Car new_car) {

        car_repo.update(id,new_car);
    }

    public ArrayList<Car> getAllCars() {

        return car_repo.getAll();
    }

}
