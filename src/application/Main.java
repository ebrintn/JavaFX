package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<ActionEvent> {
	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			button = new Button();
			button.setText("Click Me");
			button.setOnAction(this);

			StackPane root = new StackPane();
			root.getChildren().add(button);

			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Title of the Window");
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == button) {
			System.out.println("Button was clicked");
		}
	}
}
