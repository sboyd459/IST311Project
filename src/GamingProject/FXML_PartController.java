/**
 * Sample Skeleton for 'PartsPages - 311 (1).fxml' Controller Class
 */

package GamingProject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class FXML_PartController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="clickButtonPartCompletion"
    private Button clickButtonPartCompletion; // Value injected by FXMLLoader

    @FXML // fx:id="selectCheckBoxP2"
    private CheckBox selectCheckBoxP2; // Value injected by FXMLLoader

    @FXML // fx:id="selectCheckBoxP1"
    private CheckBox selectCheckBoxP1; // Value injected by FXMLLoader

    @FXML // fx:id="clickButtonPartSelection"
    private Button clickButtonPartSelection; // Value injected by FXMLLoader

    @FXML
    void changeP1Selection(ActionEvent event) {

    }

    @FXML
    void changeP2Selection(ActionEvent event) {

    }

    @FXML
    void changeScenePartCompletion(ActionEvent event) {

    }

    @FXML
    void clickAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert clickButtonPartCompletion != null : "fx:id=\"clickButtonPartCompletion\" was not injected: check your FXML file 'PartsPages - 311 (1).fxml'.";
        assert selectCheckBoxP2 != null : "fx:id=\"selectCheckBoxP2\" was not injected: check your FXML file 'PartsPages - 311 (1).fxml'.";
        assert selectCheckBoxP1 != null : "fx:id=\"selectCheckBoxP1\" was not injected: check your FXML file 'PartsPages - 311 (1).fxml'.";
        assert clickButtonPartSelection != null : "fx:id=\"clickButtonPartSelection\" was not injected: check your FXML file 'PartsPages - 311 (1).fxml'.";

    }
}

