/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import validation.ValidationContact;

/**
 *
 * @author nidham
 */
public class ModifierContactAction extends ActionSupport{
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    @Override
     public String execute() throws Exception {
         modifier();

        return "success";
    }
    public void modifier() {

        System.out.println(ValidationContact.validationNom(nom));
        System.out.println(ValidationContact.validationPrenom(prenom));
        System.out.println(ValidationContact.validationEmail(email));
        System.out.println(ValidationContact.validationTelephone(telephone));
    }


    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telephone
     */
    public String gettelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void settelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
