package application.control;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * 
 * @author Cristina
 * @version 1.0.0
 * @see Main
 */

public class ControlFX {
	
	@FXML
	ImageView cara ;

	public void showSendProfile() {
		try {
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/GetMe.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("formulario");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();
		}
		 catch (IOException e) {
				e.printStackTrace();
		 }
			}
	
		public void initialize() {
			FadeTransition fadeTransition = new FadeTransition(
					Duration.seconds(3), cara);
			fadeTransition.setFromValue(0);
			fadeTransition.setToValue(1);
			fadeTransition.play();
		}

		
		@FXML
		private void handleSend() {
			showSendProfile();
			// sendStage.close();
		}

		/**
		 * Closes the application when clicked on Exit in the secondary stage
		 */
		@FXML
		private void handleClose() {

			System.exit(0);
		}
	


}


