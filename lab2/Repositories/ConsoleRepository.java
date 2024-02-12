package Repositories;

import Domain.Entity;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class ConsoleRepository<T extends Entity> implements IRepository<T> {

    private ArrayList<T> entity_list = new ArrayList<>();

    public ConsoleRepository() {

    }


    public void add(T entity) {

        if (!(entity_list.contains(entity))) {
            entity_list.add(entity);
        } else {
            //todo: add exception when object already exists
            // in repository
        }
    }

    public void update(Integer id, T new_entity) {

        delete(id);

        entity_list.add(new_entity);
    }

    public void delete(Integer id) {
        //TODO: see if the bs commented below could work
        //entity_list.contains(id);

        entity_list.removeIf(entity -> entity.equals(id));
    }

    public ArrayList<T> getAll() {

        return entity_list;
    }

}


