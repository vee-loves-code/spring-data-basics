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
       p.setId(5);
       p.setName("Champagne");
       p.setPrice(202 );
       p.setExpiration_date(LocalDate.now());
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();

        Product p1= new Product();
        p1.setId(6);
        p1.setName("Hot");
        p1.setPrice(104);
        p1.setExpiration_date(LocalDate.now());

        var em1 = emf.createEntityManager();

        em1.getTransaction().begin();

        em1.persist(p1); // adding the instance in the context

        em1.getTransaction().commit();
        em1.close();
    }
}