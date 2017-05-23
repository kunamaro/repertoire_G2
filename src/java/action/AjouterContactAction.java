/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author nidham
 */
public class AjouterContactAction extends ActionSupport {

    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    @Override
    public String execute() throws Exception {

        return "success";
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
    public String getemail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setemail(String email) {
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

    public void validateNom() {
        if (nom.length() < 5 || nom.length() > 50) {
            addFieldError("nom", "le nom doit faire maximum 50 lettres et minimum 5");
        }
    }
    public void validatePrenom() {
        if (prenom.length() < 5 || prenom.length() > 50) {
            addFieldError("prenom", "le prenom doit faire maximum 50 lettres et minimum 5");
        }
    }
    
    public void validateemail() {
        if (email.length() < 20 || email.length() > 50) {
            addFieldError("email", "l'adresse mail doit faire maximum 50 lettres et minimum 20");
        }
    }
    public void validatetelephone() {
        if (telephone.length() =! 10 ) {
            addFieldError("telephone", "le telephone doit faire 10 chiffres");
        }
    }
    
}
