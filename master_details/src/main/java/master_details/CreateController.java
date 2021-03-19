package master_details;

// import all scenebuilder elements
// import array list features for further use
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natwatchrarod
 */
public class CreateController{
    
    @FXML
    private Button create_exit;
    
    @FXML
    private Button create_save;
    
    @FXML
    private TextField create_name;
    
    @FXML
    private TextField create_dob;
    
    @FXML
    private ChoiceBox create_personal;
    
    @FXML
    private ChoiceBox create_business;
    
    @FXML
    private TextField create_time;
    
    @FXML
    private TextArea create_notes;
    
    // initialize choice box options: yes or no
    @FXML
    public void initialize(){
        create_personal.getItems().addAll("Yes", "No");
        create_business.getItems().addAll("Yes", "No");
    }
    
    // method to go to the primary page
    @FXML
    private void switch_to_primary() throws IOException {
        App.setRoot("primary");
    }
    
    /* method to submit the new contact details 
    * however if contact details are left blank, error occurs
    * uses contact person class to create new contact
    * utilise DataHelper to save contact details across seperate classes
    * if submitted goes back to primary page
    */
    
    @FXML
    private void create_submitted() throws IOException{

        if (create_name.getText().isEmpty() ||
            create_dob.getText().isEmpty() ||
            create_personal.getSelectionModel().isEmpty() ||
            create_business.getSelectionModel().isEmpty()) {
            App.create_submission_error("Empty Submission Error");
        } else {
            
            contact_person created_contact = new contact_person(
                create_name.getText(), 
                create_dob.getText(), 
                (String) create_personal.getSelectionModel().getSelectedItem(), 
                (String) create_business.getSelectionModel().getSelectedItem(),
                create_time.getText(),
                create_notes.getText()
            );
            DataHelper.new_contacts.add(created_contact);

            App.setRoot("primary");
        }
        
    }
}
