package GamingProject;

import GamingProject.Customer;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JButton;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SigninController {

    private Customer c1;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="clickButton"
    private Button clickButton; // Value injected by FXMLLoader

    @FXML // fx:id="enterLastName"
    private TextField enterLastName; // Value injected by FXMLLoader

    @FXML // fx:id="enterUsername"
    private TextField enterUsername; // Value injected by FXMLLoader

    @FXML // fx:id="enterPassword"
    private PasswordField enterPassword; // Value injected by FXMLLoader

    @FXML // fx:id="enterFirstName"
    private TextField enterFirstName; // Value injected by FXMLLoader

    //creates new customer when Continue button is pressed 
    @FXML
    void clickButtonAction(ActionEvent event) throws IOException {
        Customer newCustomer = new Customer(enterFirstName.getText(),
                enterLastName.getText(),
                enterUsername.getText(),
                enterPassword.getText());

        // add model to database
        //create(newCustomer);

        //move to next page
        // fxml loader
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_First.fxml"));

        // load the ui elements
        Parent firstModelView = loader.load();
        // load the scene
        Scene tableViewScene = new Scene(firstModelView);

        //access the controller and call a method
        FXML_FirstController controller = loader.getController();

        // pass currently selected model
        controller.setCustomer(newCustomer);

        // create a new state
        Stage stage = new Stage();
        stage.setScene(tableViewScene);
        stage.show();

    }
    //----- Database CRUD Operations------

    //creates the connection with the database
    //checks to make sure the username is unique - alert message
    public void create(Customer c1) {
        try {
            manager.getTransaction().begin();
            // if (c1.getCustomerID() != null) {
            // create model
            manager.persist(c1);
            manager.getTransaction().commit();
            //}
            enterFirstName.setText("");
            enterLastName.setText("");
            enterUsername.setText("");
            enterPassword.setText("");

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Look, an Information Dialog");
            alert.setContentText("I have a great message for you!");

            alert.showAndWait();
        } catch (Exception ex) {
            // delete confirmation dialog
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("User Creation Error");
            alert.setHeaderText("Username error");
            alert.setContentText("Username already exist. Please try another.");
            System.out.println(ex.getMessage());

            alert.showAndWait();
        }
    }

    //prints data in database to console 
    private void loadData() {
        Query query = manager.createNamedQuery("Customer.findAll");
        List<Customer> data = query.getResultList();

        ObservableList<Customer> odata = FXCollections.observableArrayList();

        for (Customer c : data) {
            //...   
            System.out.println(c.getFirstName() + c.getLastName());
            //odata.add(c);
        }

        //Customer.setItems(odata);
    }

    EntityManager manager;

    //resets the page
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert clickButton != null : "fx:id=\"clickButton\" was not injected: check your FXML file 'SigninView.fxml'.";
        assert enterLastName != null : "fx:id=\"enterLastName\" was not injected: check your FXML file 'SigninView.fxml'.";
        assert enterUsername != null : "fx:id=\"enterUsername\" was not injected: check your FXML file 'SigninView.fxml'.";
        assert enterPassword != null : "fx:id=\"enterPassword\" was not injected: check your FXML file 'SigninView.fxml'.";
        assert enterFirstName != null : "fx:id=\"enterFirstName\" was not injected: check your FXML file 'SigninView.fxml'.";

        enterFirstName.setText("");
        enterLastName.setText("");
        enterUsername.setText("");
        enterPassword.setText("");

        manager = (EntityManager) Persistence.createEntityManagerFactory("IST311ProjectPU").createEntityManager();

        loadData();
    }
}
