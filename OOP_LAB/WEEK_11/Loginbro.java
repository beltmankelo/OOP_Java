import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
public class Loginbro extends Application{
		public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Login bros");
		Label un=new Label("Enter UserName:");
		Label ps=new Label("Enter Password");
		Label gm=new Label("");
		GridPane gp =new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		TextField tf=new TextField();
		PasswordField pf=new PasswordField();
		Button sub=new Button("Submit");
		sub.setOnAction(new EventHandler<ActionEvent> (){
			public void handle(ActionEvent a){
			gm.setText("Welcome " + tf.getText());
		}
		});
		gp.setAlignment(Pos.CENTER);
		gp.addRow(0,un,tf);
		gp.addRow(1,ps,pf);
		gp.addRow(2,sub);
		gp.addRow(3,gm);
		Scene ms=new Scene(gp,500,200);
		primaryStage.setScene(ms);
		primaryStage.show();
		} 
		public static void main(String[] args) {
			launch(args);
		}
}