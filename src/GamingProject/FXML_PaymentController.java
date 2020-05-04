/**
 * Sample Skeleton for 'PaymentView.fxml' Controller Class
 */

package GamingProject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXML_PaymentController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="clickButtonProcessOrder"
    private Button clickButtonProcessOrder; // Value injected by FXMLLoader

    @FXML // fx:id="EnterCreditCardNum"
    private TextField EnterCreditCardNum; // Value injected by FXMLLoader

    @FXML
    void clickActionProcessOrder(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert clickButtonProcessOrder != null : "fx:id=\"clickButtonProcessOrder\" was not injected: check your FXML file 'PaymentView.fxml'.";
        assert EnterCreditCardNum != null : "fx:id=\"EnterCreditCardNum\" was not injected: check your FXML file 'PaymentView.fxml'.";

    }
}

