package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Constructioncontroller extends Main {

	@FXML 
	private Button back;
	
	public void clickedback(){
		 Stage stage = (Stage) back.getScene().getWindow();
		    stage.close();	
	}
}
