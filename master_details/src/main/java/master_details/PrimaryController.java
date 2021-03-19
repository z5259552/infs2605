package master_details;

// import all scenebuilder elements
// import array list features for further use
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

// controller class for Master-Detail screen
public class PrimaryController {

    // initialize arraylist of contacts represented by the left hand list view
    @FXML
    public ListView<contact_person> contact_list;

    // import all text fields that shows the contact details results
    @FXML
    private TextField contact_name;

    @FXML
    private TextField contact_dob;

    @FXML
    private TextField contact_personal;

    @FXML
    private TextField contact_business;

    // initialize button for new contact
    @FXML
    private Button new_contact;

    // initialize button to edit contact
    @FXML
    private Button edit_contact;

    // initialize text field for case notes and time posted
    @FXML
    private TextField case_time;

    @FXML
    private TextArea case_notes;

    // gain contact data from external data source located in DataHelper
    @FXML
    public void initialize() {
        if (DataHelper.new_contacts.size() > 0) {
            for (contact_person x : DataHelper.new_contacts) {
                contact_list.getItems().add(x);
            }
        }
    }

    // grab contact details from the contact list above
    // display results in text fields
    @FXML
    public void contact_details_released() {
        contact_person details_person = contact_list.getSelectionModel().getSelectedItem();
        contact_name.setText(details_person.getName());
        contact_dob.setText(details_person.getDob());
        contact_personal.setText(details_person.getPersonal());
        contact_business.setText(details_person.getBusiness());
        case_time.setText(details_person.getTime());
        case_notes.setText(details_person.getNotes());
    }

    // method to go to the create page
    @FXML
    private void switch_to_create() throws IOException {
        App.setRoot("create");
    }

    // method to go the edit page
    // checks whether contact has been clicked or if not, error message pops out
    @FXML
    private void edit_current_contact() throws IOException {
        if (contact_name.getText().isEmpty()
                && contact_dob.getText().isEmpty()
                && contact_personal.getText().isEmpty()
                && contact_business.getText().isEmpty()) {
            App.create_submission_error("Have not selected a Contact");
        }
        App.setRoot("edit");  
    }

            
}
    

