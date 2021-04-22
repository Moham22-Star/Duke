package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;



public class Gameplayhandler extends Gamecontroller {
	
	@FXML
	private TextArea textoutput;
	
	@FXML
	private MenuButton menudrop;
	
	@FXML
	private Button cone;
	
	@FXML
	private TextArea textone;
	
	@FXML
	private TextArea texttwo;
	
	@FXML
	private TextArea textthree;
	
	@FXML
	private Button ctwo;
	
	@FXML
	private Button cthree;
	
	@FXML
	private ProgressBar healthbar;
	
	@FXML
	private ProgressBar staminabar;
	
	
	public void clickedone() {
		handle(cone);
		textoutput.setText(Gamescript.getR1a());
	}
	
	public void clickedtwo() {
		handle(ctwo);
		textoutput.setText(Gamescript.getR1b());
	}
	
	public void clickedthree() {
		handle(cthree);
		textoutput.setText(Gamescript.getR1c());
	    healthbar.setProgress(Gamescript.getHealth());
	}


    @FXML
	public void handle(Button clicked) {
		if (clicked == cone) {
            textone.setText(Gamescript.getC2a());
            texttwo.setText(Gamescript.getC2b());
            textthree.clear();
            
        }
        if (clicked  == ctwo) {
        		textone.setText(Gamescript.getC1a());
                texttwo.setText(Gamescript.getC1c());
                textthree.clear();
        }
	    if (clicked == cthree) {
	    		textone.setText(Gamescript.getC3a());
                texttwo.setText(Gamescript.getC3b());
                textthree.setText(Gamescript.getC3c());
        }
	}


	
	
	 


}
