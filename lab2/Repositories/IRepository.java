package Repositories;

import java.util.ArrayList;

public interface IRepository<T> {

    void add(T entity);

    void delete(Integer id);

    void update(Integer id, T entity);

    ArrayList<T> getAll();


}
