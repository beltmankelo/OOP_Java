import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
public class Factbro extends Application{
		public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Factorial bros");
		Label un=new Label("Enter Number:");	
		Label gm=new Label("");	
		TilePane gp =new TilePane();
		gp.setHgap(10);
		gp.setVgap(10);
		TextField tf=new TextField();
		Button sub=new Button("Submit");
		sub.setOnAction(new EventHandler<ActionEvent> (){
			public void handle(ActionEvent a){
			int i=Integer.parseInt(tf.getText());
			int f=1;
			for(int k=1;k<=i;k++)
			{
				f*=k;
			}
			gm.setText("Factorial is " + f);
		}
		});
		gp.setAlignment(Pos.CENTER);
		gp.getChildren().addAll(un,tf,sub);
		gp.getChildren().add(gm);

		Scene ms=new Scene(gp,500,200);
		primaryStage.setScene(ms);
		primaryStage.show();
		} 
		public static void main(String[] args) {
			launch(args);
		}
}