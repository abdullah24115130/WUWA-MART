package com.abdullah.wuwamartfx;
//(Launcher Class)ai class chalu korly JavaFx class chalu hoby and login.fxml load hoby. In Sha Allah
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application{
    
    public void start(Stage stage)throws Exception {
        //fxml file lord korci
        Parent root=FXMLLoader.load(getClass().getResource("login.fxml"));
        
        //Scene make korci and Title diccihi
        Scene scene=new Scene(root);
        stage.setTitle("WuwaMart - Login");
        
        //Stage a scene bosiya GUI dekaccihi
        stage.setScene(scene);
        stage.show();
    }
    
    
    //javafx Application suru korsi.
    public static void main(String[]args){
        launch(args);
    }
}
