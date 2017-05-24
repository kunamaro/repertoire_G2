/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import com.opensymphony.xwork2.ActionSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nidham
 */
public class ValidationContact extends ActionSupport {

    public ValidationContact() {
    }
    static Pattern pattern = null;
    static Matcher matcher = null;

    

    public static String validationNom(String nom) {
        String patternvalidation = "[A-Z][a-z]+)";//Ce modèle Valide comme "khelifi " Premier Lettre est en majuscule
        matcher = pattern.matcher(nom);
        if (matcher.matches()) {
            return ("Pattern is Matched" + nom);
        } else {
            return ("Pattern is Not Matched" + nom);
        }

    }

    public static String validationPrenom(String prenom) {
        String patternvalidation = "[A-Z][a-z]+)";//Ce modèle Valide comme "Nidham " Premier Lettre est en majuscule
        matcher = pattern.matcher(prenom);
        if (matcher.matches()) {
            return ("Pattern is Matched" + prenom);
        } else {
            return ("Pattern is Not Matched" + prenom);
        }

    }

    public static String validationEmail(String email) {
        String patternvalidation = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(patternvalidation);
        matcher = pattern.matcher("nsdbnbdfndb@gmail.com");
        if (matcher.matches()) {
            return ("Pattern is Matched" + email);
        } else {
            return ("Pattern is Not Matched" + email);
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
