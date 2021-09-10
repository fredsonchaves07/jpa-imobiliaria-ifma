/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JoelJR
 */
public class Emf {
   private static final EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("sitema-imob");


    public EntityManager getEntityManager() {
        return factory.createEntityManager();

    }

    public void close() {
        factory.close();
    }
    
}
