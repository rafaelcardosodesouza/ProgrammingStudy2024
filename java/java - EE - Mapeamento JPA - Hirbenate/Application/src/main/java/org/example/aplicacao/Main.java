package org.example.aplicacao;

import org.example.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();


        Pessoa p = em.find(Pessoa.class, 4);

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        
        System.out.println(p);
        em.close();
        emf.close();



    }
}