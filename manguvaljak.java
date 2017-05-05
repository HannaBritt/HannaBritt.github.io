
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class manguvaljak extends Application {
	public void Valikategooria(Stage lava){
		Canvas lõuend = new Canvas(800.0, 600.0);
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(30, 30, 30, 30));
		Text väljavalija=new Text("Teema valib mingi tegelane");
		väljavalija.setFont(Font.font ("Bold", 40));
		border.setTop(väljavalija);
		GridPane gridPane = new GridPane();
		for(int k=0;k<6; k++){
			Text teema=new Text("teema");
			teema.setFont(Font.font ("Bold", 30));
			gridPane.add(teema,k,0);	
			gridPane.setHalignment(teema, HPos.CENTER);
		}
		Button[][] nupud = new Button[6][5];
		for(int i=0; i<6; i++){
            for(int j=0; j<5;j++){
            	int rahasumma=(j+1)*100;
                nupud[i][j] = new Button(Integer.toString(rahasumma));
                nupud[i][j].setFont(Font.font ("Bold", 20));
                nupud[i][j].setPrefSize(130, 80);
                gridPane.add(nupud[i][j], i, j+1);  
                }
			};
		border.setAlignment(väljavalija,Pos.TOP_CENTER);
		border.setAlignment(gridPane,Pos.BOTTOM_CENTER);
		border.setBottom(gridPane);
		Scene stseen = new Scene(border,800,600);
		lava.setScene(stseen);
		lava.show();
		
	}
	@Override
	public void start(Stage lava) {
		lava.setTitle("Kuldvillak");
		mang(lava);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
