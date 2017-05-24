/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author nidham
 */
public class ValidationContact extends ActionSupport {
public ValidationContact(){}

    public  void validationNom(String nom) {
        if (nom.length() < 5 || nom.length() > 50) {
            addFieldError("nom", "le nom doit faire maximum 50 lettres et minimum 5");
        }
    }

    public  void validationPrenom(String prenom) {
        if (prenom.length() < 5 || prenom.length() > 50) {
            addFieldError("prenom", "le prenom doit faire maximum 50 lettres et minimum 5");
        }
    }

    public  void validationEmail(String email) {
        if (email.length() < 20 || email.length() > 50) {
            addFieldError("email", "l'adresse mail doit faire maximum 50 lettres et minimum 20");
        }
    }

    public static boolean validationTelephone(String telephone) {
        //validate phone numbers of format "1234567890"
        if (telephone.matches("\\d{10}")) {
            return true;
        } //validating phone number with -, . or spaces
        else if (telephone.matches("\\d{2}[-\\.\\s]\\d{2}[-\\.\\s]\\d{2}[-\\.\\s]\\d{2}[-\\.\\s]\\d{2}[-\\.\\s]")) {
            return true;
        } else {
            return false;
        }
    }
}
