package master_details;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    // creates a stage for the app elements to be processed
    @Override
    public void start(Stage stage) throws IOException {
        DataHelper.preload_data();
    
        // load the primary page first
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // method to set the destination of the next page
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    // method to load a different fxml file (window)
    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // main function
    public static void main(String[] args) {
        launch();
    }
    
    // method to manipulate error window via its title
    public static void create_submission_error(String input) {
        Stage newStage = new Stage();
        newStage.setTitle(input);
        try{
            newStage.setScene(new Scene(App.loadFXML("error"), 450,450));
            newStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}