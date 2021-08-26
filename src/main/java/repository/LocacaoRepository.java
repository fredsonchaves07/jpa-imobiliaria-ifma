package repository;
import models.Cliente;
import models.Locacao;

import java.util.List;

import javax.persistence.EntityManager;

public class LocacaoRepository {
    private final EntityManager manager;
    private final DAOGeneric<Locacao> daoGeneric;

    public LocacaoRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGeneric = new DAOGeneric<Locacao>(manager);
    }

    public Locacao createUpdate(Locacao aluguel) {
        return daoGeneric.createUpdate(aluguel);
    }

    public List<Locacao> locacoes() {
        return manager
                .createQuery("from Aluguel a ", Locacao.class)
                .getResultList();
    }

    public Locacao getId(Integer id){
        return daoGeneric.getId(Locacao.class, id);
    }

    public Locacao deletePorId(Integer id) {
        Locacao d = getId(id);
        daoGeneric.remove(d);
        return d;
    }
    public List<Locacao> locacaoPorInquilino(Cliente inquilino){
        return manager
                .createQuery("from Locacao l where l.inquilino.id = :id group by l.inquilino ", Locacao.class)
                .setParameter("id", inquilino.getId())
                .getResultList();

    }
}
