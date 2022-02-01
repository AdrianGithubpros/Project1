package com.kodilla.warcaby;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Warcaby extends Application {


        public static void main(String[] args) {
            launch(args);
        }


        @Override
        public void start(Stage primaryStage) throws Exception {
            try{
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Scene1.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setTitle("War&Caby");
                primaryStage.setScene(scene);
                primaryStage.setResizable(false);
                primaryStage.show();
                primaryStage.setOnCloseRequest(event ->
                {   event.consume();
                    quit(primaryStage);
                });
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    public void quit(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("You are quiting the application");
        alert.setContentText("Are you sure you want to quit?");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage.close();}
    }
    }

