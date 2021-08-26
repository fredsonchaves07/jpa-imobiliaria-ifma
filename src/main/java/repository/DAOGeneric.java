package repository;
import models.BaseEntity;

import java.util.Objects;

import javax.persistence.EntityManager;

public class DAOGeneric <T extends BaseEntity> {

    private final EntityManager manager;

    DAOGeneric(EntityManager manager) {
        this.manager = manager;
    }

    T getId(Class<T> clazz, Integer id) {
        return manager.find(clazz, id);
    }

    T createUpdate(T t) {
        if (Objects.isNull(t.getId()))
            this.manager.persist(t);
        else
            t = this.manager.merge(t);
        return t;
    }

    void remove(T t) {
        manager.remove(t);
        manager.flush();
    }

}
