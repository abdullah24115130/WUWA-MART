
package com.abdullah.wuwamartfx;
//(Launcher Class)ai class chalu korly JavaFx class chalu hoby and login.fxml load hoby. In Sha Allah
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage )throws Exception{
  Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
 Scene scene=new Scene(root);
 stage.setTitle("WuwaMart - Login");
    }
    
    
    
}
