package repository;

import models.Imovel;

import java.util.List;

import javax.persistence.EntityManager;

public class ImoveisRepository {
    private final EntityManager manager;
    private final DAOGeneric<Imovel> daoGeneric;

    public ImoveisRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGeneric = new DAOGeneric<Imovel>(manager);
    }

    public Imovel createUpdate(Imovel aluguel) {
        return daoGeneric.createUpdate(aluguel);
    }

    public List<Imovel> getImoveis() {
        return manager
                .createQuery("from Imovel a ", Imovel.class)
                .getResultList();
    }

    public Imovel getId(Integer id){
        return daoGeneric.getId(Imovel.class, id);
    }

    public Imovel remove(Integer id) {
        Imovel d = getId(id);
        daoGeneric.remove(d);
        return d;
    }
}
