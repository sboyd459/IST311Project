package GamingProject;

import GamingProject.Customer;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.application.Application;
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

public class SigninController implements Initializable{
    
    private Customer c1; 
    

    @FXML private Button clickButton;
    @FXML private PasswordField enterFirstName;
    @FXML private TextField enterLastName;
    @FXML private TextField enterUsername;
    @FXML private TextField enterPassword;
    @FXML private URL url; 
    @FXML private ResourceBundle rb; 
    JButton jb1; 

    /*
    Connection conn = DriverManager.getConnection(url,"", ""); 
    Statement statement = conn.createStatement(); */
    

    @FXML
    void clickContinue(ActionEvent event) {
        
    }

    public PasswordField getEnterFirstName() {
        return enterFirstName;
    }

    public void setEnterFirstName(TextField enterFirstName) {
        Scanner scnr = new Scanner(System.in);  //takes in information from user
        String firstname = scnr.next(); 
        c1.setFirstName(firstname);
    }

    public TextField getEnterLastName() {
        return enterLastName;
    }

    public void setEnterLastName(TextField enterLastName) {
        Scanner scnr = new Scanner(System.in);  //takes in information from user
        String lastname = scnr.next(); 
        c1.setFirstName(lastname);
    }

    public TextField getEnterUsername() {
        return enterUsername;
    }

    public void setEnterUsername(TextField enterUsername) {
        Scanner scnr = new Scanner(System.in);  //takes in information from user
        String username = scnr.next(); 
        c1.setFirstName(username);
    }

    public TextField getEnterPassword() {
        return enterPassword;
    }

    public void setEnterPassword(TextField enterPassword) {
        Scanner scnr = new Scanner(System.in);  //takes in information from user
        String password = scnr.next(); 
        c1.setFirstName(password);
    }
    
     private void loadData() {
        Query query = manager.createNameQuery();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        assert clickButton != null; 
        enterFirstName.setText("");
        enterLastName.setText("");
        enterUsername.setText("");
        enterPassword.setText("");
        
        loadData();
    }   
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SigninController other = (SigninController) obj;
        if (!Objects.equals(this.clickButton, other.clickButton)) {
            return false;
        }
        if (!Objects.equals(this.enterFirstName, other.enterFirstName)) {
            return false;
        }
        if (!Objects.equals(this.enterLastName, other.enterLastName)) {
            return false;
        }
        if (!Objects.equals(this.enterUsername, other.enterUsername)) {
            return false;
        }
        if (!Objects.equals(this.enterPassword, other.enterPassword)) {
            return false;
        }
        return true;
    }

    
*/

   

}
 