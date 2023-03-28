package org.example.main;

import org.example.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

       EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA Basics");
       EntityManager em = emf.createEntityManager();
       Product p = new Product();
       p.setId(2);
       p.setName("wine");
       p.setPrice(200 );
       p.setExpiration_date(LocalDate.now());
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }
}