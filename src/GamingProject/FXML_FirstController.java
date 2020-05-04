

package GamingProject;

/**
 * Sample Skeleton for 'FXML_First.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXML_FirstController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="clickButtonIntel"
    private Button clickButtonIntel; // Value injected by FXMLLoader

    @FXML // fx:id="clickButtonAMD"
    private Button clickButtonAMD; // Value injected by FXMLLoader

    @FXML
    void clickActionAMD(ActionEvent event) {

    }

    @FXML
    void clickActionIntel(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert clickButtonIntel != null : "fx:id=\"clickButtonIntel\" was not injected: check your FXML file 'FXML_First.fxml'.";
        assert clickButtonAMD != null : "fx:id=\"clickButtonAMD\" was not injected: check your FXML file 'FXML_First.fxml'.";
    }
}
    
    


