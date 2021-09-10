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
import models.Imovel;
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
public class ImoveisRepositoryTest {

    private EntityManager manager;
    private static EntityManagerFactory factory;
    private ImoveisRepository imoveisRepository;

    public ImoveisRepositoryTest() {
    }

    @BeforeClass
    public static void ini() {
        factory = Persistence.createEntityManagerFactory("sitema-imob");
    }

    @Before
    public void befor() {
        manager = factory.createEntityManager();
        imoveisRepository = new ImoveisRepository(manager);
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
        Imovel imovel = new Imovel();
        imoveisRepository.createUpdate(imovel);
    }

    @Test
    public void testGetImoveis() {
        List<Imovel> imoveis = imoveisRepository.getImoveis();
    }

    @Test
    public void testGetId() {
        Imovel imovel = new Imovel();
        imoveisRepository.getId(imovel.getId());
    }

    @Test
    public void testRemove() {
        Imovel imovel = new Imovel();
        imoveisRepository.remove(imovel.getId());
    }

}
