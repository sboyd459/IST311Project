/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxhw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaApplication1 extends Application{
    
 public static void main(String[] args) {
   launch(args);
 }

@Override
public void start(Stage primaryStage) throws Exception 
{
//    Button btOK = new Button("OK");
//    Scene scene = new Scene(btOK, 200, 250);
//    primaryStage.setTitle("MyJavaFX"); // Set the stage title
//    primaryStage.setScene(scene); // Place the scene in the stage
//    primaryStage.show(); // Display the stage
    Parent root = FXMLLoader.load(getClass().getResource("FXML_First.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
    }
}