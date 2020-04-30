

package JavaFXhw;

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

    @FXML // fx:id="clickButton"
    private Button clickButton; // Value injected by FXMLLoader

    @FXML
    void clickAction(ActionEvent event) {
        if(clickButton.isSelected())
        {
            clickButton.setSelected(false);
        }
        else
        {
            clickButton.setSelected(true);
        }
    }

}
