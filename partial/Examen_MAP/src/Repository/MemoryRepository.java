package Repository;

import Domain.Building;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MemoryRepository<T extends Building> extends AbstractRepository<T> {

    protected void sort() {
        Collections.sort(entityList, new Comparator<Building>() {
            @Override
            public int compare(Building entity1, Building entity2) {
                return entity1.getConstructionYear().compareTo(entity2.getConstructionYear());
            }
        });
    }

    @Override
    public void add(T entity) {
        if (findById(entity.getConstructionYear()).equals(-1)) {
            entityList.add(entity);
        }
        sort();
    }

    @Override
    public void delete(Integer id) {
        if (!findById(id).equals(-1)) {
            entityList.remove((int) findById(id));
        }
        sort();
    }

    @Override
    public void update(Integer id, T entity) {
        if (!findById(id).equals(-1) && findById(entity.getConstructionYear()).equals(-1)) {
            delete(id);
            add(entity);
        }
        sort();
    }

    @Override
    public Integer findById(Integer id) {
        for (Integer i = 0; i < entityList.size(); i++) {
            if (entityList.get(i).getConstructionYear().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<T> getAll() {
        return new ArrayList<>(entityList);
    }
}
