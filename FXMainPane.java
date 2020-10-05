package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMainPane extends VBox{
	public void start(Stage stage){
		HBox hb1=new HBox();
		HBox hb2=new HBox();
		DataManager Dobject=new DataManager();
		TextField textFields = new TextField();     
		Label labelVal = new Label("FeedBack:");
		Button bb1 = new Button("Hello");
		bb1.setOnAction(new EventHandler<ActionEvent>(){
			@Override 
			public void handle(ActionEvent e){
				textFields.setText(Dobject.getHello());
				}
			});
		Button bb2 = new Button("Howdy");
		bb2.setOnAction(new EventHandler<ActionEvent>(){
			@Override 
			public void handle(ActionEvent e){        
				textFields.setText(Dobject.getHowdy());
				}
			});
		Button bb3 = new Button("Chinese");
		bb3.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				textFields.setText(Dobject.getChineese());
				}
			});   
		Button bb4 = new Button("Clear");
		bb4.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				textFields.setText(" ");
				}
			});  
		Button bb5 = new Button("Exit");
		bb5.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				System.exit(0);
				}
			});
		VBox vBox =new VBox(50);
		vBox.setAlignment(Pos.CENTER);
		new Insets(20, 20, 20, 20);
		vBox.setSpacing(10);
		VBox.setMargin(textFields, new Insets(20, 20, 20, 20));
		VBox.setMargin(bb1, new Insets(20, 20, 20, 20));
		VBox.setMargin(bb2, new Insets(20, 20, 20, 20));
		VBox.setMargin(bb3, new Insets(20, 20, 20, 20));
		VBox.setMargin(bb4, new Insets(20, 20, 20, 20));
		VBox.setMargin(bb5, new Insets(20, 20, 20, 20));
		hb1.setAlignment(Pos.CENTER);
		hb1.getChildren().addAll(labelVal,textFields,hb2);
		ObservableList<Node> listVal = vBox.getChildren();
				listVal.addAll(textFields, bb1,bb2,bb3,bb4,bb5,hb1);
				Scene scenes = new Scene(vBox);
				stage.setScene(scenes);
				stage.show();
				}
	}  
