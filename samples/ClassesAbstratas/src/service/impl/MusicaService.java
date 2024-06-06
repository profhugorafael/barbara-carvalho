package service.impl;

import model.Musica;
import service.interfaces.CrudService;

import java.util.List;

public class MusicaService implements CrudService<Musica> {

    @Override
    public void create(Musica data) {

    }

    @Override
    public List<Musica> findAll() {
        return List.of();
    }

    @Override
    public Musica findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
