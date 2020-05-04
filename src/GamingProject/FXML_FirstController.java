/**
 * Sample Skeleton for 'FXML_First.fxml' Controller Class
 */

package GamingProject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

 

public class FXML_FirstController {
    
private Customer loginCustomer; 

public void setCustomer(Customer c){
    loginCustomer = c;
}

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="amdPicture"
    private ImageView amdPicture; // Value injected by FXMLLoader

    @FXML // fx:id="intelPicture"
    private ImageView intelPicture; // Value injected by FXMLLoader
    
     @FXML // fx:id="IntelButton"
    private Button IntelButton; // Value injected by FXMLLoader

    @FXML // fx:id="AMDButton"
    private Button AMDButton; // Value injected by FXMLLoader

    @FXML
    void AMDButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PartsView.fxml"));

        // load the ui elements
        Parent firstModelView = loader.load();
        // load the scene
        Scene tableViewScene = new Scene(firstModelView);

        //access the controller and call a method
        FXML_PartSelectionController controller = loader.getController();

        // pass currently selected model
        // controller.setCustomer(newCustomer);

        // create a new state
        Stage stage = new Stage();
        stage.setScene(tableViewScene);
        stage.show();
    }

    @FXML
    void IntelButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PartsView.fxml"));

        // load the ui elements
        Parent firstModelView = loader.load();
        // load the scene
        Scene tableViewScene = new Scene(firstModelView);

        //access the controller and call a method
        FXML_PartSelectionController controller = loader.getController();

        // pass currently selected model
        // controller.setCustomer(newCustomer);

        // create a new state
        Stage stage = new Stage();
        stage.setScene(tableViewScene);
        stage.show();
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
//        try {
//            Image amdPic = new Image(getClass().getResource("AMD.jpg"));
//            Image intelPic = new Image(getClass().getResource("intel.png"));   
//            amdPicture.setImage(amdPic);
//
//        } 
//        catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
