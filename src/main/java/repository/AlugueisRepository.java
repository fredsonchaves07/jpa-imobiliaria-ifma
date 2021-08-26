package repository;

import models.Aluguel;
import models.Cliente;

import java.util.List;

import javax.persistence.EntityManager;


public class AlugueisRepository {
    private final EntityManager manager;
    private final DAOGeneric<Aluguel> daoGeneric;

    public AlugueisRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGeneric = new DAOGeneric<Aluguel>(manager);
    }
    public Aluguel createUpdate(Aluguel aluguel) {
        return daoGeneric.createUpdate(aluguel);
    }

    public List<Aluguel> listAlugueis() {
        return manager
                .createQuery("from Aluguel a ", Aluguel.class)
                .getResultList();
    }

    public Aluguel getId(Integer id){
        return daoGeneric.getId(Aluguel.class, id);
    }

    public Aluguel remove(Integer id) {
        Aluguel d = getId(id);
        daoGeneric.remove(d);
        return d;
    }
    public List<Aluguel> aluguelPorInquilino(Cliente inquilino){
        return manager
                .createQuery("from Aluguel a where a.locacao.inquilino.id = :id ", Aluguel.class)
                .setParameter("id", inquilino.getId())
                .getResultList();
    }
}
