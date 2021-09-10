/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Cliente;
import models.Locacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author JoelJR
 */
public class LocacaoRepositoryTest {
    private EntityManager manager;
    private static EntityManagerFactory factory;
    private LocacaoRepository locacaoRepository;
    
    public LocacaoRepositoryTest() {
    }
    
    @BeforeClass
    public static void ini() {
        factory = Persistence.createEntityManagerFactory("sitema-imob");
    }

    @Before
    public void befor() {
        manager = factory.createEntityManager();
        locacaoRepository = new LocacaoRepository(manager);
        manager.getTransaction().begin();
    }

    @After
    public void after() {
        manager.getTransaction().rollback();
    }

    @AfterClass
    public static void end() {
        factory.close();
    }

    @Test
    public void testCreateUpdate() {
        Locacao locacao = new Locacao();
        locacaoRepository.createUpdate(locacao);
    }

    @Test
    public void testLocacoes() {
        List<Locacao> locacoes = locacaoRepository.locacoes();
    }

    @Test
    public void testGetId() {
        Locacao locacao = new Locacao();
        locacaoRepository.getId(locacao.getId());
    }

    @Test
    public void testDeletePorId() {
        Locacao locacao = new Locacao();
         locacaoRepository.deletePorId(locacao.getId());
    }

    @Test
    public void testLocacaoPorInquilino() {
        Cliente cliente = new Cliente();
        List<Locacao> locacoes = locacaoRepository.locacaoPorInquilino(cliente);
    }
    
}
