package service.impl;

import model.Filme;
import service.interfaces.CrudService;

import java.util.List;

public class FilmeService implements CrudService<Filme> {
    @Override
    public void create(Filme data) {

    }

    @Override
    public List<Filme> findAll() {
        return List.of();
    }

    @Override
    public Filme findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
