package service;

import java.util.ArrayList;
import java.util.List;

public class MessageService<T> {

    private List<T> cache = new ArrayList<>();

    public void print() {
        for(T msg: cache) {
            System.out.println(msg);
        }

        cache.clear();
    }

    public void addToQueue(T msg) {
        cache.add(msg);
    }
}
