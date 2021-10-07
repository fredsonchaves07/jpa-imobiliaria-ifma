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
import models.Aluguel;
import models.Cliente;
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
public class AlugueisRepositoryTest {

    private EntityManager manager;
    private static EntityManagerFactory factory;
    private AlugueisRepository alugueisRepository;

    public AlugueisRepositoryTest() {
    }

    @BeforeClass
    public static void ini() {
        factory = Persistence.createEntityManagerFactory("corretora");
    }

    @Before
    public void befor() {
        manager = factory.createEntityManager();
        alugueisRepository = new AlugueisRepository(manager);
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
        Aluguel aluguel = new Aluguel();
        alugueisRepository.createUpdate(aluguel);
    }

    @Test
    public void testListAlugueis() {
        List<Aluguel> alugueis = alugueisRepository.listAlugueis();
    }

    @Test
    public void testGetId() {
        Cliente inquilino = new Cliente();
        List<Aluguel> aluguel = alugueisRepository.aluguelPorInquilino(inquilino);
    }

    @Test
    public void testRemove() {
        Aluguel aluguel = new Aluguel();

        alugueisRepository.remove(aluguel.getId());
    }

    @Test
    public void testAluguelPorInquilino() {
        Cliente cliente = new Cliente();
        List<Aluguel> aluguel = alugueisRepository.aluguelPorInquilino(cliente);
    }

}
