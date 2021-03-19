package master_details;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author natwatchrarod
 */
public class EditController {

    @FXML
    private Button edit_exit;

    @FXML
    private Button edit_edit;

    @FXML
    private TextField edit_name;

    @FXML
    private TextField edit_dob;

    @FXML
    private ChoiceBox edit_personal;

    @FXML
    private ChoiceBox edit_business;

    @FXML
    private TextField edit_time;

    @FXML
    private TextArea edit_notes;
    
    // unfinished initialization for accessing contact details to edit
    /*
    @FXML
    public void initialize(){
        if (DataHelper.new_contacts.size() > 0) {
            for (contact_person x : DataHelper.new_contacts) {
                contact_list.getItems().add(x);
            }
        }
        
        contact_person edit_person = contact_list.getSelectionModel().getSelectedItem();
        contact_name.setText(edit_person.getName());
        contact_dob.setText(edit_person.getDob());
        contact_personal.setText(edit_person.getPersonal());
        contact_business.setText(edit_person.getBusiness());
        
        
        edit_personal.getItems().addAll("Yes", "No");
        edit_business.getItems().addAll("Yes", "No");
        edit_personal.getSelectionModel().select();
        
        
    }
     */
    
    // method to go back to primary window
    @FXML
    private void switch_to_primary() throws IOException {
        App.setRoot("primary");
    }

    /* unfinished method to submit contact detail data and utilise data helper
    * to access new edited from another class ie. primary
    * also note, if text box are empty, pop out error window
    */
    
    @FXML
    private void edit_submitted() throws IOException {
        /*
        if !(edit_name.getText().isEmpty()) {
            editted_contact
        } ||
            edit_dob.getText().isEmpty() ||
            edit_personal.getSelectionModel().isEmpty() ||
            edit_business.getSelectionModel().isEmpty()) {
            App.create_submittion_error();
        } else {
            
            contact_person edit_contact = new contact_person(
                edit_name.getText(), 
                edit_dob.getText(), 
                (String) edit_personal.getSelectionModel().getSelectedItem(), 
                (String) edit_business.getSelectionModel().getSelectedItem()
            );
            DataHelper.new_contacts.add(edit_contact);

            App.setRoot("primary");
        }*/

    }
}
