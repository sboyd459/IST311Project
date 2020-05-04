/**
 * Sample Skeleton for 'PaymentView.fxml' Controller Class
 */

package GamingProject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXML_PaymentController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="clickButtonCheckout"
    private Button clickButtonCheckout; // Value injected by FXMLLoader

    @FXML // fx:id="partTotalLabel"
    private TextField partTotalLabel; // Value injected by FXMLLoader

    @FXML // fx:id="taxLabel"
    private TextField taxLabel; // Value injected by FXMLLoader

    @FXML // fx:id="totalPriceLabel"
    private TextField totalPriceLabel; // Value injected by FXMLLoader

    @FXML // fx:id="checkOutLabel"
    private TextArea checkOutLabel; // Value injected by FXMLLoader

    @FXML
    void clickActionCheckout(ActionEvent event) {
        checkOutLabel.setText("Congratulations, Your order is complete!");
        
        
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert clickButtonCheckout != null : "fx:id=\"clickButtonCheckout\" was not injected: check your FXML file 'PaymentView.fxml'.";
        assert partTotalLabel != null : "fx:id=\"partTotalLabel\" was not injected: check your FXML file 'PaymentView.fxml'.";
        assert taxLabel != null : "fx:id=\"taxLabel\" was not injected: check your FXML file 'PaymentView.fxml'.";
        assert totalPriceLabel != null : "fx:id=\"totalPriceLabel\" was not injected: check your FXML file 'PaymentView.fxml'.";
        assert checkOutLabel != null : "fx:id=\"checkOutLabel\" was not injected: check your FXML file 'PaymentView.fxml'.";

    }
}



    