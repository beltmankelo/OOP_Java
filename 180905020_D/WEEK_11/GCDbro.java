import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
public class GCDbro extends Application{
		public void start(Stage primaryStage)
	{
		primaryStage.setTitle("GCD bros");
		Label un=new Label("Enter Number 1:");
		Label up=new Label("Enter Number 2:");	
		Label gm=new Label("");	
		GridPane gp =new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		TextField tf=new TextField();
		TextField tf2=new TextField();
		Button sub=new Button("Submit");
		sub.setOnAction(new EventHandler<ActionEvent> (){
			public void handle(ActionEvent a){
			int z=Integer.parseInt(tf.getText());
			int k=Integer.parseInt(tf2.getText());
			int f=0;
			int i=z>k?z:k;
			for(;i>=1;i--)
			{
				if(z%i==0&&k%i==0)
					{
					f=i;
					break;
					}
			}
			gm.setText("GCD is " + f);
		}
		});
		gp.setAlignment(Pos.CENTER);
		gp.addRow(0,un,tf);
		gp.addRow(1,up,tf2);
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