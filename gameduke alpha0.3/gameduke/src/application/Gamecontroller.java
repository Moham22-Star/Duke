package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Gamecontroller extends Main {
	
	@FXML 
	private Button newgame;

	@FXML 
	private Button exit;

	@FXML 
	private Button load;
	
	@FXML
	private Button credit;
	
	
	
	
public void clickednew()throws Exception{

	try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("DNMGW.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 952, 636);
        Stage mystage = new Stage();
        mystage.setTitle("alpha ver0.2");
        mystage.setScene(scene);
        mystage.show();
    } catch (IOException e) {
    	e.printStackTrace();
    }
    
	
}



public void clickedload(){
	try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("UCAV.fxml"));
        
        Scene scene = new Scene(fxmlLoader.load(), 365, 358);
        Stage onestage = new Stage();
        onestage.setTitle("alpha ver0.2");
        onestage.setScene(scene);
        onestage.show();
    } catch (IOException e) {
    	e.printStackTrace();
    }
}



public void clickedexit(){
	Platform.exit();	
}

public void clickedcredit() {
	
}



public void handle(ActionEvent event) {
	// TODO Auto-generated method stub
	
}



}
