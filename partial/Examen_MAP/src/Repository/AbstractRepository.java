package Repository;

import Domain.Building;

import java.util.ArrayList;

public abstract class AbstractRepository<T extends Building> implements IRepository<T>{

    protected ArrayList<T> entityList = new ArrayList<>();
}
