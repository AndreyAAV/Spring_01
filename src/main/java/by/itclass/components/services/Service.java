package by.itclass.components.services;

import by.itclass.components.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {
    //методы Service
    //@Autowired не самый лучший вариант использовать над полем!
    private DAO dao;

    public Service() {
    }

    @Autowired
    public Service(@Qualifier("DAO") DAO dao) {
        this.dao = dao;
    }

    //@Autowired или так
    public void setDao(DAO dao) {
        this.dao = dao;
    }

    @Override
    public String toString() {
        return "service=" + super.toString() +
                "\ndao=" + dao;
    }
}
