package service;

import java.util.List;

public interface Crud<T> {

    List<T> getAll();
    T getById(int id);
    void save(T element);
}
