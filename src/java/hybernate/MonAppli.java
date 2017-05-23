/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybernate;

import bean.Contact;
import beanManager.ContactManager;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author stag
 */
public class MonAppli {
    private EntityManagerFactory emf = null;
    
    public MonAppli(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public void start() {
        ContactManager pm = new ContactManager(emf);
        
        List<Contact> personnes = pm.listeTousContacts();
        
//        for (Contact personne : personnes) {
//            System.out.println(personne.toString());
//        }
    }
}
