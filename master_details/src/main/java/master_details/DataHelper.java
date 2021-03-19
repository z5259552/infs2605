/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master_details;

import java.util.ArrayList;

/**
 *
 * @author natwatchrarod
 * helper class to create array list for contacts
 */
public class DataHelper {
    public static ArrayList<contact_person> new_contacts = new ArrayList<>();
   
    // preload data
    // can be used to create extra contact data
    public static void preload_data() {
        contact_person nat = new contact_person("Nat Watch", "13/03/2000", 
                "Yes", "No", "13/03/2021 18:10",
                "Jess and I had a great catch up today. Jess paid for \n" + 
                "coffee so I owe her one.Jess is starting her new job \n" + 
                "next Monday so be sure to ask her about it next time \n" +
                "you catch up.”");
        
        DataHelper.new_contacts.add(nat);
    }
    
    // new array list to create a placeholder for contact to be edited
    public static ArrayList<contact_person> edited_contact = new ArrayList<>();
}
 