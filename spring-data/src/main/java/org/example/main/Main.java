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
       p.setName("Champagne");
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();

//        Product p1= new Product();
//        p1.setName("Hot");
//
//
//        var em1 = emf.createEntityManager();
//
//        em1.getTransaction().begin();
//
//        em1.persist(p1); // adding the instance in the context
//
//        em1.getTransaction().commit();
//        em1.close();
    }
}