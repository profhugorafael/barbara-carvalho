package service.interfaces;

import java.util.List;

public interface CrudService<T> {

    // create read update delete
    void create(T data);
    List<T> findAll();
    T findById(int id);
    void deleteById(int id);
}