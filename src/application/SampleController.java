package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML private TextField usernameTextField;

	public void loginButtonClicked() {
		
		System.out.println("User Login Attempt: "+ usernameTextField.getText());
	}
	
}
