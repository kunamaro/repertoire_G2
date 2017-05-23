/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanManager;

import bean.Contact;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author stag
 */
public class ContactManager {
    
    private EntityManagerFactory emf = null;

    public ContactManager(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<Contact> listeTousContacts() {
        List<Contact> Contacts = null;

        try {
            EntityManager em = emf.createEntityManager();

            Query query = em.createQuery("select p from Contact p");
            Contacts = query.getResultList();

            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Contacts;
    }

    public void ajouter(Contact c) {
        try {
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();

            // objet p rendu persistant par em.persist
            Contact p = new Contact();

            p.setNom(c.getNom());
            p.setPrenom(c.getPrenom());
            p.setEmail(c.getEmail());
            p.setTelephone(c.getTelephone());
            em.persist(p);

            // Fermeture importante, dans l'ordre de dépendance !
            // Transaction fermée par l'EntityManager
            // Commit excecute la transaction pour libéré la réservation
            // (si commit ou rollback non fait, aucune autre action possible)
            tx.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void modifier(Contact c) {
        try {
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();

            // objet p rendu persistant par em.persist
            Contact p = em.find(Contact.class, c.getId_contact());

            p.setNom(c.getNom());
            p.setPrenom(c.getPrenom());
            p.setEmail(c.getEmail());
            p.setTelephone(c.getTelephone());
            em.persist(p);

            // Fermeture importante, dans l'ordre de dépendance !
            // Transaction fermée par l'EntityManager
            // Commit excecute la transaction pour libéré la réservation
            // (si commit ou rollback non fait, aucune autre action possible)
            tx.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void supprimer(int id) {
        try {
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();

            Contact Contact = em.find(Contact.class, id);
            em.persist(Contact);
            em.remove(Contact);
            
            tx.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
