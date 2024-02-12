package Service;

import Domain.Building;
import Repository.AbstractRepository;

import java.util.ArrayList;

public class Service {
    AbstractRepository<Building> abstractRepository;

    public Service(AbstractRepository<Building> abstractRepository) {
        this.abstractRepository = abstractRepository;
    }

    public void add(Building entity) {
        abstractRepository.add(entity);
    }

    public ArrayList<Building> mustBeRestored(){
        ArrayList<Building> list = new ArrayList<>();

        for(Building building:abstractRepository.getAll()){
            if(building.mustBeRestored()){
                list.add(building);
            }
        }
        return list;
    }

    public ArrayList<Building> getAll() {
        return new ArrayList<>(abstractRepository.getAll());
    }
}
