
package action;

import bean.Contact;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stag
 */
public class testRemplissageContact extends ActionSupport{

    @Override
    public String execute() throws Exception {
        return "success";
    }
    
    public List<Contact> fonctionTest () {
        List<Contact> liste = new ArrayList();
        Contact C1 = new Contact();
        C1.setNom("lionel");
                Contact C2 = new Contact();
        C2.setNom("John");
                Contact C3 = new Contact();
        C3.setNom("Nidham");
                Contact C4 = new Contact();
        C4.setNom("John");
        liste.add(C1);
        liste.add(C2);
        liste.add(C3);
        liste.add(C4);
        return liste;
    }
}
