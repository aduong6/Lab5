package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

public class FXDriver extends Application{
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args){
		launch(args);  
		}
	@Override
	public void start(Stage stage) throws IOException{
		FXMainPane fp=new FXMainPane();
		fp.start(stage);
		stage.setTitle("Hello World GUI");
		stage.show();
		}
	}