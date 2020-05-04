/**
 * Sample Skeleton for 'PartsView.FXML.fxml' Controller Class
 */

package GamingProject;

import ist311project.SampleModel;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FXML_PartSelectionController {

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

    @FXML // fx:id="comboBox"
    private ComboBox<String> comboBox; // Value injected by FXMLLoader

    @FXML // fx:id="clickButtonPartSelection"
    private Button clickButtonPartSelection; // Value injected by FXMLLoader

    @FXML // fx:id="CaseLabel"
    private Label CaseLabel; // Value injected by FXMLLoader

    @FXML // fx:id="ProcessorLabel"
    private Label ProcessorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="MotherboardLabel"
    private Label MotherboardLabel; // Value injected by FXMLLoader

    @FXML // fx:id="PowerSupplyLable"
    private Label PowerSupplyLable; // Value injected by FXMLLoader

    @FXML // fx:id="GraphicsCardLable"
    private Label GraphicsCardLable; // Value injected by FXMLLoader

    @FXML // fx:id="partDescription1"
    private TableView<Parts> partDescription1; // Value injected by FXMLLoader

    @FXML // fx:id="Option_1"
    private TableColumn<Parts, String> Option_1; // Value injected by FXMLLoader

    @FXML // fx:id="Option_2"
    private TableColumn<Parts, String> Option_2; // Value injected by FXMLLoader

    @FXML // fx:id="Option_3"
    private TableColumn<Parts, Double> Option_3; // Value injected by FXMLLoader


    @FXML
    void changeScenePartCompletion(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentView.fxml"));
        
        // load the ui elements
        Parent firstModelView = loader.load();
        // load the scene
        Scene tableViewScene = new Scene(firstModelView);

        //access the controller and call a method
        FXML_PaymentController controller = loader.getController();
        Stage stage = new Stage();
        stage.setScene(tableViewScene);
        stage.show();
    }

    @FXML
    void clickActionPartSelection(ActionEvent event) {
        Parts part = partDescription1.getSelectionModel().getSelectedItem();
        String type = part.getPartType();
        if(type.startsWith("Processor"))
        {
            ProcessorLabel.setText(part.getPartName() + part.getPartDescription() + part.getPrice());
        }
        else if(type.startsWith("Computer Case"))
        {
            CaseLabel.setText(part.getPartName() + part.getPartDescription()  + part.getPrice());
        }
        else if(type.startsWith("Motherboard"))
        {
            MotherboardLabel.setText(part.getPartName() + part.getPartDescription()  + part.getPrice());
        }
        else if(type.startsWith("Power Supply"))
        {
            PowerSupplyLable.setText(part.getPartName() + part.getPartDescription()  + part.getPrice());
        }
        else if(type.startsWith("Graphic Card"))
        {
            GraphicsCardLable.setText(part.getPartName() + part.getPartDescription()  + part.getPrice());
       }
    }

    @FXML
    void comboBoxWasUpdated(ActionEvent event) {
        System.out.println(comboBox.getValue());
        loadData(comboBox.getValue());
    }

    EntityManager manager;
    
    private void loadData(String partType) {
        Query query = manager.createNamedQuery("Parts.findByPartType");
        query.setParameter("partType", partType);
        List<Parts> data = query.getResultList();

        
        ObservableList<Parts> odata = FXCollections.observableArrayList();
        for (Parts p : data) {
            //...   
            System.out.println(p.getPartType());
            odata.add(p);
        }

        partDescription1.setItems(odata);

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert clickButtonPartCompletion != null : "fx:id=\"clickButtonPartCompletion\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert clickButtonPartSelection != null : "fx:id=\"clickButtonPartSelection\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert CaseLabel != null : "fx:id=\"CaseLabel\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert ProcessorLabel != null : "fx:id=\"ProcessorLabel\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert MotherboardLabel != null : "fx:id=\"MotherboardLabel\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert PowerSupplyLable != null : "fx:id=\"PowerSupplyLable\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert GraphicsCardLable != null : "fx:id=\"GraphicsCardLable\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert partDescription1 != null : "fx:id=\"partDescription1\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert Option_1 != null : "fx:id=\"Option_1\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert Option_2 != null : "fx:id=\"Option_2\" was not injected: check your FXML file 'PartsView.FXML.fxml'.";
        assert Option_3 != null : "fx:id=\"Option_3\" was not injected: check your FXML file 'PartsView.fxml'.";
        
        ObservableList<String> odata = FXCollections.observableArrayList();
        comboBox.setItems(odata);
        comboBox.getItems().add("Processor");
        comboBox.getItems().addAll("Graphic Card","Power Supply","Motherboard","Computer Case");
        comboBox.setVisibleRowCount(3);
        comboBox.setEditable(true);
        comboBox.setPromptText("Choose Course");
        
        Option_1.setCellValueFactory(new PropertyValueFactory<>("PartName")); //should match with attribute Id (e.g., getId/setId methods) in SimpleModel
        Option_2.setCellValueFactory(new PropertyValueFactory<>("PartDescription")); //should match with attribute Value (e.g., getValue/setValue methods) in SimpleModel
        Option_3.setCellValueFactory(new PropertyValueFactory<>("Price"));

        manager = (EntityManager) Persistence.createEntityManagerFactory("IST311ProjectPU").createEntityManager();
    }
}

