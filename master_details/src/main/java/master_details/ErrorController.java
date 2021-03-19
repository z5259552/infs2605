/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master_details;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author natwatchrarod
 * class for errors
 */
public class ErrorController {
    
    @FXML
    private Button error_ok;
    
    // method to close error window
    @FXML
    private void close_to_create() {
        Stage stage = (Stage) error_ok.getScene().getWindow();
        
        stage.close();
    }
}
