import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
public class Appbro extends Application{
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("This is the first JavaFX Application");
		Label lb=new Label();
		lb.setText("Welcome to JavaFX programming");
		lb.setTextFill(Color.MAGENTA);
		FlowPane root=new FlowPane();
		root.setHgap(10);
		root.setVgap(8);
		root.getChildren().add(lb);
		Scene ms=new Scene(root,500,200);
		primaryStage.setScene(ms);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}