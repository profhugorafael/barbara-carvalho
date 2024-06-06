package service.interfaces;

public interface IPlayerService {

    void save();
    void findAll();
    void findById(int id);
    void update(int id);
    void deleteById(int id);

}
