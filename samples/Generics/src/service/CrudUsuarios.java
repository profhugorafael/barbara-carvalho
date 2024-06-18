package service;

import model.User;

import java.util.List;

public class CrudUsuarios implements Crud<User> {
    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void save(User element) {

    }
}
