/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatemavenjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.hibernatemavenjpa.Pessoa;

/**
 *
 * @author Diego
 */



public class App {

        public static void main(String[] args) {
        
            
            Pessoa p1 = new Pessoa(null,"Abrahan","87878585");
            Pessoa p2 = new Pessoa(null,"Obama","77454848");
            Pessoa p3 = new Pessoa(null,"George","669988554");
            
            
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("salvador");
            EntityManager em = emf.createEntityManager();
           
            //Gravando
            /*
            em.getTransaction().begin();
            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.getTransaction().commit();
            System.out.println("Gravado com Sucesso");
            */
            //Consultado
            Pessoa p = em.find(Pessoa.class,2);
            System.out.println(p); //Retornei e tá na memo
            //Removendo - Temos que primeiro retornar um objeto (em um construtor vazio)
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            System.out.println("Removido o objeto 2");
            //Fechando
            em.close();
            emf.close();
            
            
            
            
            
    }
        
}
