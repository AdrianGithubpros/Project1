package com.kodilla.warcaby;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller1 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private GameInfo gameInfo = new GameInfo();
    boolean clicked = false;
    boolean gameStarted = false;
    Color playerColor = Color.BLACK;
    private FieldInfo playerField = new FieldInfo(0,"","","",false);
    private FieldInfo removeField = new FieldInfo(0,"","","",false);

    @FXML
    private Circle c8B,c8D,c8F,c8H,c7A,c7C,c7E,c7G,c6B,c6D,c6F,c6H,c5A,c5C,c5E,c5G,c4B,c4D,c4F,c4H,c3A,c3C,c3E,c3G, c2B,c2D,c2F,c2H,c1A,c1C,c1E,c1G;
    @FXML
    private Circle c8Bm,c8Dm,c8Fm,c8Hm,c7Am,c7Cm,c7Em,c7Gm,c6Bm,c6Dm,c6Fm,c6Hm,c5Am,c5Cm,c5Em,c5Gm,c4Bm,c4Dm,c4Fm,c4Hm,c3Am,c3Cm,c3Em,c3Gm,c2Bm,c2Dm,c2Fm,c2Hm,c1Am,c1Cm,c1Em,c1Gm;
    @FXML
    private Button quitButtonMenu;
    @FXML
    private Button quitButtonGame;
    @FXML
    private AnchorPane scenePane1;
    @FXML
    private AnchorPane scenePane2;
    @FXML
    private Button button8B;
    @FXML
    private Label checkLabel;



    public void switchToScene2(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getClassLoader().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void quitToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getClassLoader().getResource("Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void quitMenuToDesktop(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("You are quiting the application");
        alert.setContentText("Are you sure you want to quit?");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)scenePane1.getScene().getWindow();
            stage.close();}
    }
    public void quitGameToDesktop(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("You are quiting the application");
        alert.setContentText("Are you sure you want to quit?");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)scenePane2.getScene().getWindow();
            stage.close();}
    }

    public void startWithWhite(){
        //8
        c8B.setFill(Color.RED);
        c8B.setVisible(true);
        c8D.setFill(Color.RED);
        c8D.setVisible(true);
        c8F.setFill(Color.RED);
        c8F.setVisible(true);
        c8H.setFill(Color.RED);
        c8H.setVisible(true);
        // 7
        c7A.setFill(Color.RED);
        c7A.setVisible(false);
        c7C.setFill(Color.RED);
        c7C.setVisible(false);
        c7E.setFill(Color.RED);
        c7E.setVisible(false);
        c7G.setFill(Color.RED);
        c7G.setVisible(false);
        // 6
        c6B.setFill(Color.RED);
        c6B.setVisible(true);
        c6D.setFill(Color.RED);
        c6D.setVisible(true);
        c6F.setFill(Color.RED);
        c6F.setVisible(true);
        c6H.setFill(Color.RED);
        c6H.setVisible(true);
        // 5 mid
        c5A.setVisible(false);
        c5C.setVisible(false);
        c5E.setVisible(false);
        c5G.setVisible(false);
        // 4 mid
        c4B.setVisible(false);
        c4D.setVisible(false);
        c4F.setVisible(false);
        c4H.setVisible(false);
        // 3
        c3A.setFill(Color.WHITE);
        c3C.setFill(Color.WHITE);
        c3E.setFill(Color.WHITE);
        c3G.setFill(Color.WHITE);
        c3A.setVisible(true);
        c3C.setVisible(true);
        c3E.setVisible(true);
        c3G.setVisible(true);
        // 2
        c2B.setFill(Color.WHITE);
        c2D.setFill(Color.WHITE);
        c2F.setFill(Color.WHITE);
        c2H.setFill(Color.WHITE);
        c2B.setVisible(true);
        c2D.setVisible(true);
        c2F.setVisible(true);
        c2H.setVisible(true);
        // 1
        c1A.setFill(Color.WHITE);
        c1C.setFill(Color.WHITE);
        c1E.setFill(Color.WHITE);
        c1G.setFill(Color.WHITE);
        c1A.setVisible(true);
        c1C.setVisible(true);
        c1E.setVisible(true);
        c1G.setVisible(true);

        gameStarted = true;
        playerColor = Color.WHITE;



    }

    public void startWithRed(){
        //8
        c8B.setFill(Color.WHITE);
        c8B.setVisible(true);
        c8D.setFill(Color.WHITE);
        c8D.setVisible(true);
        c8F.setFill(Color.WHITE);
        c8F.setVisible(true);
        c8H.setFill(Color.WHITE);
        c8H.setVisible(true);
        // 7
        c7A.setFill(Color.WHITE);
        c7A.setVisible(true);
        c7C.setFill(Color.WHITE);
        c7C.setVisible(true);
        c7E.setFill(Color.WHITE);
        c7E.setVisible(true);
        c7G.setFill(Color.WHITE);
        c7G.setVisible(true);
        // 6
        c6B.setFill(Color.WHITE);
        c6B.setVisible(true);
        c6D.setFill(Color.WHITE);
        c6D.setVisible(true);
        c6F.setFill(Color.WHITE);
        c6F.setVisible(true);
        c6H.setFill(Color.WHITE);
        c6H.setVisible(true);
        // 5 mid
        c5A.setVisible(false);
        c5C.setVisible(false);
        c5E.setVisible(false);
        c5G.setVisible(false);
        // 4 mid
        c4B.setVisible(false);
        c4D.setVisible(false);
        c4F.setVisible(false);
        c4H.setVisible(false);
        // 3
        c3A.setFill(Color.RED);
        c3C.setFill(Color.RED);
        c3E.setFill(Color.RED);
        c3G.setFill(Color.RED);
        c3A.setVisible(true);
        c3C.setVisible(true);
        c3E.setVisible(true);
        c3G.setVisible(true);
        // 2
        c2B.setFill(Color.RED);
        c2D.setFill(Color.RED);
        c2F.setFill(Color.RED);
        c2H.setFill(Color.RED);
        c2B.setVisible(true);
        c2D.setVisible(true);
        c2F.setVisible(true);
        c2H.setVisible(true);
        // 1
        c1A.setFill(Color.RED);
        c1C.setFill(Color.RED);
        c1E.setFill(Color.RED);
        c1G.setFill(Color.RED);
        c1A.setVisible(true);
        c1C.setVisible(true);
        c1E.setVisible(true);
        c1G.setVisible(true);

        gameStarted = true;
        playerColor = Color.RED;

    }
    // 8
    public void button8B(ActionEvent event){
        if ( gameStarted == true){
            if (clicked == false){
                for (FieldInfo field : gameInfo.gameList) {
                    System.out.println("number: " + field.getNumber());
                    System.out.println("Letter: " + field.getLetter());
                    System.out.println("Occupation: " + field.isOccupation());
                    System.out.println("Status: " + field.getStatus());
                    System.out.println("membership: " + field.getMembership());
                    System.out.println("NEXT");
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4){
                                        c4Bm.setVisible(true);
                                        c3Am.setVisible(true);
                                        c3Am.setFill(Color.YELLOW);
                                        c3A.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("A");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        gameInfo.gameList.remove(playerField);
                                    }
                                }


                            } else {


                            }

                        }
                    }
                }
            } else {
                if(c3Am.isVisible() && c3Am.getFill() == Color.YELLOW){
                    gameInfo.gameList.add(playerField);
                    c3A.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c3Am.isVisible()){
                    playerField.setLetter("A");
                    playerField.setNumber(3);
                    playerField.setMembership("player");
                    playerField.setOccupation(true);
                    playerField.setStatus("pawn");
                    gameInfo.gameList.add(playerField);
                    c4B.setVisible(true);
                    c4B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                }
            }
        }

    }
    public void button8D(ActionEvent event){
        if ( gameStarted == true){
            if (clicked == false){
                for (FieldInfo field : gameInfo.gameList) {
                    System.out.println("number: " + field.getNumber());
                    System.out.println("Letter: " + field.getLetter());
                    System.out.println("Occupation: " + field.isOccupation());
                    System.out.println("Status: " + field.getStatus());
                    System.out.println("membership: " + field.getMembership());
                    System.out.println("NEXT");
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4){
                                        c4Bm.setVisible(true);
                                        c3Am.setVisible(true);
                                        c3Am.setFill(Color.YELLOW);
                                        c3A.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("A");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        gameInfo.gameList.remove(playerField);
                                    }
                                }


                            } else {


                            }

                        }
                    }
                }
            } else {
                if(c3Am.isVisible() && c3Am.getFill() == Color.YELLOW){
                    gameInfo.gameList.add(playerField);
                    c3A.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c3Am.isVisible()){
                    playerField.setLetter("A");
                    playerField.setNumber(3);
                    playerField.setMembership("player");
                    playerField.setOccupation(true);
                    playerField.setStatus("pawn");
                    gameInfo.gameList.add(playerField);
                    c4B.setVisible(true);
                    c4B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                }
            }
        }

    }
    public void button8F(ActionEvent event){
        if ( gameStarted == true){
            if (clicked == false){
                for (FieldInfo field : gameInfo.gameList) {
                    System.out.println("number: " + field.getNumber());
                    System.out.println("Letter: " + field.getLetter());
                    System.out.println("Occupation: " + field.isOccupation());
                    System.out.println("Status: " + field.getStatus());
                    System.out.println("membership: " + field.getMembership());
                    System.out.println("NEXT");
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4){
                                        c4Bm.setVisible(true);
                                        c3Am.setVisible(true);
                                        c3Am.setFill(Color.YELLOW);
                                        c3A.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("A");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        gameInfo.gameList.remove(playerField);
                                    }
                                }


                            } else {


                            }

                        }
                    }
                }
            } else {
                if(c3Am.isVisible() && c3Am.getFill() == Color.YELLOW){
                    gameInfo.gameList.add(playerField);
                    c3A.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c3Am.isVisible()){
                    playerField.setLetter("A");
                    playerField.setNumber(3);
                    playerField.setMembership("player");
                    playerField.setOccupation(true);
                    playerField.setStatus("pawn");
                    gameInfo.gameList.add(playerField);
                    c4B.setVisible(true);
                    c4B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                }
            }
        }

    }
    public void button8H(ActionEvent event){
        if ( gameStarted == true){
            if (clicked == false){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4){
                                        c4Bm.setVisible(true);
                                        c3Am.setVisible(true);
                                        c3Am.setFill(Color.YELLOW);
                                        c3A.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("A");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        gameInfo.gameList.remove(playerField);
                                    }
                                }


                            } else {


                            }

                        }
                    }
                }
            } else {
                if(c3Am.isVisible() && c3Am.getFill() == Color.YELLOW){
                    gameInfo.gameList.add(playerField);
                    c3A.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c3Am.isVisible()){
                    playerField.setLetter("A");
                    playerField.setNumber(3);
                    playerField.setMembership("player");
                    playerField.setOccupation(true);
                    playerField.setStatus("pawn");
                    gameInfo.gameList.add(playerField);
                    c4B.setVisible(true);
                    c4B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                }
            }
        }
    // 7
    }
    public void button7A(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 7){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 8){
                                        c8Bm.setVisible(true);
                                        c7Am.setVisible(true);
                                        c7Am.setFill(Color.YELLOW);
                                        c7A.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }
                            }
                        }
                    }

                }

            } else {
                if(c7Am.isVisible() && c7Am.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7A.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c7Am.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7A.setVisible(true);
                    c7A.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }


    }
    public void button7C(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 7){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 8){
                                        c8Dm.setVisible(true);
                                        c7Cm.setVisible(true);
                                        c7Cm.setFill(Color.YELLOW);
                                        c7C.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 8){
                                        c8Bm.setVisible(true);
                                        c7Cm.setVisible(true);
                                        c7Cm.setFill(Color.YELLOW);
                                        c7C.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                            }
                        }
                    }

                }

            } else {
                if(c7Cm.isVisible() && c7Cm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7C.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c7Cm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7C.setVisible(true);
                    c7C.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }


    }
    public void button7E(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 7){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 8){
                                        c8Dm.setVisible(true);
                                        c7Em.setVisible(true);
                                        c7Em.setFill(Color.YELLOW);
                                        c7E.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 8){
                                        c8Fm.setVisible(true);
                                        c7Em.setVisible(true);
                                        c7Em.setFill(Color.YELLOW);
                                        c7E.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                            }
                        }
                    }

                }

            } else {
                if(c7Em.isVisible() && c7Em.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7E.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c7Em.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7E.setVisible(true);
                    c7E.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }

    }
    public void button7G(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 7){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("H") && field1.getNumber() == 8){
                                        c8Hm.setVisible(true);
                                        c7Gm.setVisible(true);
                                        c7Gm.setFill(Color.YELLOW);
                                        c7G.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 8){
                                        c8Fm.setVisible(true);
                                        c7Gm.setVisible(true);
                                        c7Gm.setFill(Color.YELLOW);
                                        c7G.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                            }
                        }
                    }

                }

            } else {
                if(c7Gm.isVisible() && c7Gm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7G.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c7Gm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 7){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c7G.setVisible(true);
                    c7G.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }

    }
    // 6
    public void button6B(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 6){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7){
                                        c7Cm.setVisible(true);
                                        c6Bm.setVisible(true);
                                        c6Bm.setFill(Color.YELLOW);
                                        c6B.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 7){
                                        c7Am.setVisible(true);
                                        c6Bm.setVisible(true);
                                        c6Bm.setFill(Color.YELLOW);
                                        c6B.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 7 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("D") && field4.getNumber() == 8) {
                                                c8Dm.setVisible(true);
                                                c6Bm.setVisible(true);
                                                c6Bm.setFill(Color.YELLOW);
                                                c6B.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("C");
                                                removeField.setNumber(7);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }


                                }}}}}
            } else {
                if(c6Bm.isVisible() && c6Bm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6B.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c6Bm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6B.setVisible(true);
                    c6B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }

    }
    public void button6D(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 6){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7){
                                        c7Cm.setVisible(true);
                                        c6Dm.setVisible(true);
                                        c6Dm.setFill(Color.YELLOW);
                                        c6D.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 7){
                                        c7Em.setVisible(true);
                                        c6Dm.setVisible(true);
                                        c6Dm.setFill(Color.YELLOW);
                                        c6D.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 7 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("B") && field4.getNumber() == 8) {
                                                c8Bm.setVisible(true);
                                                c6Dm.setVisible(true);
                                                c6Dm.setFill(Color.YELLOW);
                                                c6D.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("C");
                                                removeField.setNumber(7);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("E") && field3.getNumber() == 7 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("F") && field4.getNumber() == 8) {
                                                c8Fm.setVisible(true);
                                                c6Dm.setVisible(true);
                                                c6Dm.setFill(Color.YELLOW);
                                                c6D.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("E");
                                                removeField.setNumber(7);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }



                            }
                        }
                    }

                }

            } else {
                if(c6Dm.isVisible() && c6Dm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6D.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c6Dm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6D.setVisible(true);
                    c6D.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }

    }
    public void button6F(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 6){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7){
                                        c7Gm.setVisible(true);
                                        c6Fm.setVisible(true);
                                        c6Fm.setFill(Color.YELLOW);
                                        c6F.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 7){
                                        c7Em.setVisible(true);
                                        c6Fm.setVisible(true);
                                        c6Fm.setFill(Color.YELLOW);
                                        c6F.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("E") && field3.getNumber() == 7 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("D") && field4.getNumber() == 8) {
                                                c8Dm.setVisible(true);
                                                c6Fm.setVisible(true);
                                                c6Fm.setFill(Color.YELLOW);
                                                c6F.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("E");
                                                removeField.setNumber(7);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("G") && field3.getNumber() == 7 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("H") && field4.getNumber() == 8) {
                                                c8Hm.setVisible(true);
                                                c6Fm.setVisible(true);
                                                c6Fm.setFill(Color.YELLOW);
                                                c6F.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("G");
                                                removeField.setNumber(7);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            } else {

                if(c6Fm.isVisible() && c6Fm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6F.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c6Fm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6F.setVisible(true);
                    c6F.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }

    }
    public void button6H(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 6){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7){
                                        c7Gm.setVisible(true);
                                        c6Hm.setVisible(true);
                                        c6Hm.setFill(Color.YELLOW);
                                        c6H.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("G") && field3.getNumber() == 7 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("F") && field4.getNumber() == 8) {
                                                c8Fm.setVisible(true);
                                                c6Hm.setVisible(true);
                                                c6Hm.setFill(Color.YELLOW);
                                                c6H.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("G");
                                                removeField.setNumber(7);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }

                }

            } else {

                if(c6Hm.isVisible() && c6Hm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }

                    c6H.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c6Hm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 6){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c6H.setVisible(true);
                    c6H.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }
    }
    // 5
    public void button5A(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 5){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                   // System.out.println("tutaj 0");
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6){
                                        c6Bm.setVisible(true);
                                        c5Am.setVisible(true);
                                        c5Am.setFill(Color.YELLOW);
                                        c5A.setVisible(false);
                                        clicked = true;
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6 && field1.getMembership().equals("bot")){
                                        for (FieldInfo field3 : gameInfo.gameList) {
                                            if (!field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 7){
                                                c7Cm.setVisible(true);
                                                c5Am.setVisible(true);
                                                c5Am.setFill(Color.YELLOW);
                                                c5A.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("B");
                                                removeField.setNumber(6);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {

                if(c5Am.isVisible() && c5Am.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }

                    c5A.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c5Am.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c5A.setVisible(true);
                    c5A.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }
    }
    public void button5C(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 5){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6){
                                        c6Bm.setVisible(true);
                                        c5Cm.setVisible(true);
                                        c5Cm.setFill(Color.YELLOW);
                                        c5C.setVisible(false);
                                        clicked = true;

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 6){
                                        c6Dm.setVisible(true);
                                        c5Cm.setVisible(true);
                                        c5Cm.setFill(Color.YELLOW);
                                        c5C.setVisible(false);
                                        clicked = true;

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }

                                for (FieldInfo field4 : gameInfo.gameList) {
                                    if (field4.isOccupation() && field4.getLetter().equals("B") && field4.getNumber() == 6 && field4.getMembership().equals("bot")) {
                                        for (FieldInfo field5 : gameInfo.gameList) {
                                            if (!field5.isOccupation() && field5.getLetter().equals("A") && field5.getNumber() == 7) {
                                                c7Am.setVisible(true);
                                                c5Cm.setVisible(true);
                                                c5Cm.setFill(Color.YELLOW);
                                                c5C.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("B");
                                                removeField.setNumber(6);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("D") && field3.getNumber() == 6 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("E") && field4.getNumber() == 7) {
                                                c7Em.setVisible(true);
                                                c5Cm.setVisible(true);
                                                c5Cm.setFill(Color.YELLOW);
                                                c5C.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");

                                                removeField.setLetter("D");
                                                removeField.setNumber(6);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            } else {

                if(c5Cm.isVisible() && c5Cm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }

                    c5C.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c5Cm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c5C.setVisible(true);
                    c5C.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }
    }
    public void button5E(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 5){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6){
                                        c6Fm.setVisible(true);
                                        c5Em.setVisible(true);
                                        c5Em.setFill(Color.YELLOW);
                                        c5E.setVisible(false);
                                        clicked = true;

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 6){
                                        c6Dm.setVisible(true);
                                        c5Em.setVisible(true);
                                        c5Em.setFill(Color.YELLOW);
                                        c5E.setVisible(false);
                                        clicked = true;

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("D") && field3.getNumber() == 6 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("C") && field4.getNumber() == 7) {
                                                c7Cm.setVisible(true);
                                                c5Em.setVisible(true);
                                                c5Em.setFill(Color.YELLOW);
                                                c5E.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("D");
                                                removeField.setNumber(6);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("F") && field3.getNumber() == 6 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("G") && field4.getNumber() == 7) {
                                                c7Gm.setVisible(true);
                                                c5Em.setVisible(true);
                                                c5Em.setFill(Color.YELLOW);
                                                c5E.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("F");
                                                removeField.setNumber(6);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            } else {

                if(c5Em.isVisible() && c5Em.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }

                    c5E.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c5Em.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c5E.setVisible(true);
                    c5E.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }
    }
    public void button5G(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 5){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6){
                                        c6Fm.setVisible(true);
                                        c5Gm.setVisible(true);
                                        c5Gm.setFill(Color.YELLOW);
                                        c5G.setVisible(false);
                                        clicked = true;

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 6){
                                        c6Hm.setVisible(true);
                                        c5Gm.setVisible(true);
                                        c5Gm.setFill(Color.YELLOW);
                                        c5G.setVisible(false);
                                        clicked = true;

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("F") && field3.getNumber() == 6 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("E") && field4.getNumber() == 7) {
                                                c7Em.setVisible(true);
                                                c5Gm.setVisible(true);
                                                c5Gm.setFill(Color.YELLOW);
                                                c5G.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("F");
                                                removeField.setNumber(6);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }

                }

            } else {

                if(c5Gm.isVisible() && c5Gm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }

                    c5G.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c5Gm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 5){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c5G.setVisible(true);
                    c5G.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
        }
    }
    // 4
    public void button4B(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 4){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5){
                                        c5Cm.setVisible(true);
                                        c4Bm.setVisible(true);
                                        c4Bm.setFill(Color.YELLOW);
                                        c4B.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("B");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 5){
                                        c5Am.setVisible(true);
                                        c4Bm.setVisible(true);
                                        c4Bm.setFill(Color.YELLOW);
                                        c4B.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("B");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");}


                                    }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 5 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("D") && field4.getNumber() == 6) {
                                                c6Dm.setVisible(true);
                                                c4Bm.setVisible(true);
                                                c4Bm.setFill(Color.YELLOW);
                                                c4B.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("C");
                                                removeField.setNumber(5);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                }
                            }
                        }

                    }





            } else {
                if(c4Bm.isVisible() && c4Bm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4B.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c4Bm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4B.setVisible(true);
                    c4B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
            }
        }

    public void button4D(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 4){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5){
                                        c5Cm.setVisible(true);
                                        c4Dm.setVisible(true);
                                        c4Dm.setFill(Color.YELLOW);
                                        c4D.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("D");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 5){
                                        c5Em.setVisible(true);
                                        c4Dm.setVisible(true);
                                        c4Dm.setFill(Color.YELLOW);
                                        c4D.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("D");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }

                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 5 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("B") && field4.getNumber() == 6) {
                                                c6Bm.setVisible(true);
                                                c4Dm.setVisible(true);
                                                c4Dm.setFill(Color.YELLOW);
                                                c4D.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("C");
                                                removeField.setNumber(5);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("E") && field3.getNumber() == 5 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("F") && field4.getNumber() == 6) {
                                                c6Fm.setVisible(true);
                                                c4Dm.setVisible(true);
                                                c4Dm.setFill(Color.YELLOW);
                                                c4D.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("E");
                                                removeField.setNumber(5);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c4Dm.isVisible() && c4Dm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4D.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c4Dm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4D.setVisible(true);
                    c4D.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    public void button4F(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 4){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5){
                                        c5Gm.setVisible(true);
                                        c4Fm.setVisible(true);
                                        c4Fm.setFill(Color.YELLOW);
                                        c4F.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("F");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 5){
                                        c5Em.setVisible(true);
                                        c4Fm.setVisible(true);
                                        c4Fm.setFill(Color.YELLOW);
                                        c4F.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("F");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("E") && field3.getNumber() == 5 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("D") && field4.getNumber() == 6) {
                                                c6Dm.setVisible(true);
                                                c4Fm.setVisible(true);
                                                c4Fm.setFill(Color.YELLOW);
                                                c4F.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("E");
                                                removeField.setNumber(5);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("G") && field3.getNumber() == 5 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("H") && field4.getNumber() == 6) {
                                                c6Hm.setVisible(true);
                                                c4Fm.setVisible(true);
                                                c4Fm.setFill(Color.YELLOW);
                                                c4F.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("G");
                                                removeField.setNumber(5);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c4Fm.isVisible() && c4Fm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4F.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c4Fm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4F.setVisible(true);
                    c4F.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    public void button4H(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 4){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5){
                                        c5Gm.setVisible(true);
                                        c4Hm.setVisible(true);
                                        c4Hm.setFill(Color.YELLOW);
                                        c4H.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("H");
                                        playerField.setNumber(4);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("G") && field3.getNumber() == 5 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("F") && field4.getNumber() == 6) {
                                                c6Fm.setVisible(true);
                                                c4Hm.setVisible(true);
                                                c4Hm.setFill(Color.YELLOW);
                                                c4H.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("G");
                                                removeField.setNumber(5);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c4Hm.isVisible() && c4Hm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4H.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c4Hm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 4){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c4H.setVisible(true);
                    c4H.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    // 3
    public void button3A(ActionEvent event){

        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4){
                                        c4Bm.setVisible(true);
                                        c3Am.setVisible(true);
                                        c3Am.setFill(Color.YELLOW);
                                        c3A.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("A");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("B") && field3.getNumber() == 4 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("C") && field4.getNumber() == 5) {
                                                c5Cm.setVisible(true);
                                                c3Am.setVisible(true);
                                                c3Am.setFill(Color.YELLOW);
                                                c3A.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("B");
                                                removeField.setNumber(4);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                }
            } else {
                if(c3Am.isVisible() && c3Am.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c3A.setVisible(true);
                    hideDots();
                    clicked = false;
            }else if(c3Am.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c3A.setVisible(true);
                    c3A.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    public void button3C(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4){
                                        c4Dm.setVisible(true);
                                        c3Cm.setVisible(true);
                                        c3Cm.setFill(Color.YELLOW);
                                        c3C.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("C");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");

                                    }
                                }

                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 4){
                                        c4Bm.setVisible(true);
                                        c3Cm.setVisible(true);
                                        c3Cm.setFill(Color.YELLOW);
                                        c3C.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("C");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                       }


                                    }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("B") && field3.getNumber() == 4 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("A") && field4.getNumber() == 5) {
                                                c5Am.setVisible(true);
                                                c3Cm.setVisible(true);
                                                c3Cm.setFill(Color.YELLOW);
                                                c3C.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("B");
                                                removeField.setNumber(4);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("D") && field3.getNumber() == 4 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("E") && field4.getNumber() == 5) {
                                                c5Em.setVisible(true);
                                                c3Cm.setVisible(true);
                                                c3Cm.setFill(Color.YELLOW);
                                                c3C.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("D");
                                                removeField.setNumber(4);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                }
                            }
                        }

                    }





            } else {

                if(c3Cm.isVisible() && c3Cm.getFill().equals(Color.YELLOW)){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }

                    c3C.setVisible(true);
                    hideDots();
                    clicked = false;
                }if(c3Cm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c3C.setVisible(true);
                    c3C.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }}
            }
        }

    public void button3E(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4){
                                        c4Dm.setVisible(true);
                                        c3Em.setVisible(true);
                                        c3Em.setFill(Color.YELLOW);
                                        c3E.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("E");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 4){
                                        c4Fm.setVisible(true);
                                        c3Em.setVisible(true);
                                        c3Em.setFill(Color.YELLOW);
                                        c3E.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("E");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("D") && field3.getNumber() == 4 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("C") && field4.getNumber() == 5) {
                                                c5Cm.setVisible(true);
                                                c3Em.setVisible(true);
                                                c3Em.setFill(Color.YELLOW);
                                                c3E.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("D");
                                                removeField.setNumber(4);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("F") && field3.getNumber() == 4 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("G") && field4.getNumber() == 5) {
                                                c5Gm.setVisible(true);
                                                c3Em.setVisible(true);
                                                c3Em.setFill(Color.YELLOW);
                                                c3E.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("F");
                                                removeField.setNumber(4);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c3Em.isVisible() && c3Em.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c3E.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c3Em.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }}
                    c3E.setVisible(true);
                    c3E.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }

    }
    public void button3G(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 3){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("H") && field1.getNumber() == 4){
                                        c4Hm.setVisible(true);
                                        c3Gm.setVisible(true);
                                        c3Gm.setFill(Color.YELLOW);
                                        c3G.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("G");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 4){
                                        c4Fm.setVisible(true);
                                        c3Gm.setVisible(true);
                                        c3Gm.setFill(Color.YELLOW);
                                        c3G.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("G");
                                        playerField.setNumber(3);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }

                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("F") && field3.getNumber() == 4 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("E") && field4.getNumber() == 5) {
                                                c5Em.setVisible(true);
                                                c3Gm.setVisible(true);
                                                c3Gm.setFill(Color.YELLOW);
                                                c3G.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("F");
                                                removeField.setNumber(4);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }


                            }
                        }

                    }
                }




            } else {
                if(c3Gm.isVisible() && c3Gm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c3G.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c3Gm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 3){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c3G.setVisible(true);
                    c3G.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }

    }
    // 2
    public void button2B(ActionEvent event){
        if ( gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 2){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3){
                                        c3Cm.setVisible(true);
                                        c2Bm.setVisible(true);
                                        c2Bm.setFill(Color.YELLOW);
                                        c2B.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("B");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 3){
                                        c3Am.setVisible(true);
                                        c2Bm.setVisible(true);
                                        c2Bm.setFill(Color.YELLOW);
                                        c2B.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("B");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }

                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 3 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("D") && field4.getNumber() == 4) {
                                                c4Dm.setVisible(true);
                                                c2Bm.setVisible(true);
                                                c2Bm.setFill(Color.YELLOW);
                                                c2B.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("C");
                                                removeField.setNumber(3);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c2Bm.isVisible() && c2Bm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2B.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c2Bm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2B.setVisible(true);
                    c2B.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    public void button2D(ActionEvent event){
        if ( gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 2){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3){
                                        c3Cm.setVisible(true);
                                        c2Dm.setVisible(true);
                                        c2Dm.setFill(Color.YELLOW);
                                        c2D.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("D");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 3){
                                        c3Em.setVisible(true);
                                        c2Dm.setVisible(true);
                                        c2Dm.setFill(Color.YELLOW);
                                        c2D.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("D");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");

                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("C") && field3.getNumber() == 3 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("B") && field4.getNumber() == 4) {
                                                c4Bm.setVisible(true);
                                                c2Dm.setVisible(true);
                                                c2Dm.setFill(Color.YELLOW);
                                                c2D.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("C");
                                                removeField.setNumber(3);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("E") && field3.getNumber() == 3 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("F") && field4.getNumber() == 4) {
                                                c4Fm.setVisible(true);
                                                c2Dm.setVisible(true);
                                                c2Dm.setFill(Color.YELLOW);
                                                c2D.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("E");
                                                removeField.setNumber(3);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c2Dm.isVisible() && c2Dm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2D.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c2Dm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2D.setVisible(true);
                    c2D.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }

    }
    public void button2F(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 2){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3){
                                        c3Gm.setVisible(true);
                                        c2Fm.setVisible(true);
                                        c2Fm.setFill(Color.YELLOW);
                                        c2F.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("F");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 3){
                                        c3Em.setVisible(true);
                                        c2Fm.setVisible(true);
                                        c2Fm.setFill(Color.YELLOW);
                                        c2F.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("F");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }

                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("E") && field3.getNumber() == 3 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("D") && field4.getNumber() == 4) {
                                                c4Dm.setVisible(true);
                                                c2Fm.setVisible(true);
                                                c2Fm.setFill(Color.YELLOW);
                                                c2F.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("E");
                                                removeField.setNumber(3);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }

                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("G") && field3.getNumber() == 3 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("H") && field4.getNumber() == 4) {
                                                c4Hm.setVisible(true);
                                                c2Fm.setVisible(true);
                                                c2Fm.setFill(Color.YELLOW);
                                                c2F.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("G");
                                                removeField.setNumber(3);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c2Fm.isVisible() && c2Fm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2F.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c2Fm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2F.setVisible(true);
                    c2F.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }

    }
    public void button2H(ActionEvent event){
        if ( gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 2){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3){
                                        c3Gm.setVisible(true);
                                        c2Hm.setVisible(true);
                                        c2Hm.setFill(Color.YELLOW);
                                        c2H.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("H");
                                        playerField.setNumber(2);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("G") && field3.getNumber() == 3 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("F") && field4.getNumber() == 4) {
                                                c4Fm.setVisible(true);
                                                c2Hm.setVisible(true);
                                                c2Hm.setFill(Color.YELLOW);
                                                c2H.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("G");
                                                removeField.setNumber(3);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c2Hm.isVisible() && c2Hm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2H.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c2Hm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 2){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c2H.setVisible(true);
                    c2H.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    // 1
    public void button1A(ActionEvent event){
        if (gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 1){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2){
                                        c2Bm.setVisible(true);
                                        c1Am.setVisible(true);
                                        c1Am.setFill(Color.YELLOW);
                                        c1A.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("A");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("B") && field3.getNumber() == 2 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("C") && field4.getNumber() == 3) {
                                                c3Cm.setVisible(true);
                                                c1Am.setVisible(true);
                                                c1Am.setFill(Color.YELLOW);
                                                c1A.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("B");
                                                removeField.setNumber(2);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }


                            }
                        }

                    }
                }




            } else {
                if(c1Am.isVisible() && c1Am.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1A.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c1Am.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1A.setVisible(true);
                    c1A.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    public void button1C(ActionEvent event){
        if ( gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 1){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2){
                                        c2Bm.setVisible(true);
                                        c1Cm.setVisible(true);
                                        c1Cm.setFill(Color.YELLOW);
                                        c1C.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("C");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 2){
                                        c2Dm.setVisible(true);
                                        c1Cm.setVisible(true);
                                        c1Cm.setFill(Color.YELLOW);
                                        c1C.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("C");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }

                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("B") && field3.getNumber() == 2 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("A") && field4.getNumber() == 3) {
                                                c3Am.setVisible(true);
                                                c1Cm.setVisible(true);
                                                c1Cm.setFill(Color.YELLOW);
                                                c1C.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("B");
                                                removeField.setNumber(2);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("D") && field3.getNumber() == 2 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("E") && field4.getNumber() == 3) {
                                                c3Em.setVisible(true);
                                                c1Cm.setVisible(true);
                                                c1Cm.setFill(Color.YELLOW);
                                                c1C.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("D");
                                                removeField.setNumber(2);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c1Cm.isVisible() && c1Cm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1C.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c1Cm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1C.setVisible(true);
                    c1C.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }
    public void button1E(ActionEvent event){
        if ( gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 1){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2){
                                        c2Fm.setVisible(true);
                                        c1Em.setVisible(true);
                                        c1Em.setFill(Color.YELLOW);
                                        c1E.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("E");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                    }
                                }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 2){
                                        c2Dm.setVisible(true);
                                        c1Em.setVisible(true);
                                        c1Em.setFill(Color.YELLOW);
                                        c1E.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("E");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("D") && field3.getNumber() == 2 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("C") && field4.getNumber() == 3) {
                                                c3Cm.setVisible(true);
                                                c1Em.setVisible(true);
                                                c1Em.setFill(Color.YELLOW);
                                                c1E.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("D");
                                                removeField.setNumber(2);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("F") && field3.getNumber() == 2 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("G") && field4.getNumber() == 3) {
                                                c3Gm.setVisible(true);
                                                c1Em.setVisible(true);
                                                c1Em.setFill(Color.YELLOW);
                                                c1E.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("F");
                                                removeField.setNumber(2);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }




            } else {
                if(c1Em.isVisible() && c1Em.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1E.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c1Em.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1E.setVisible(true);
                    c1E.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }

    }
    public void button1G(ActionEvent event){
        if ( gameStarted){
            if (!clicked){
                for (FieldInfo field : gameInfo.gameList) {
                    if (field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 1){
                        if (field.getStatus().equals("pawn")){
                            if(field.getMembership().equals("player")){
                                for (FieldInfo field1 : gameInfo.gameList) {
                                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2){
                                        c2Fm.setVisible(true);
                                        c1Gm.setVisible(true);
                                        c1Gm.setFill(Color.YELLOW);
                                        c1G.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("G");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");
                                        }
                                    }
                                for (FieldInfo field2 : gameInfo.gameList) {
                                    if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 2){
                                        c2Hm.setVisible(true);
                                        c1Gm.setVisible(true);
                                        c1Gm.setFill(Color.YELLOW);
                                        c1G.setVisible(false);
                                        clicked = true;

                                        playerField.setLetter("G");
                                        playerField.setNumber(1);
                                        playerField.setMembership("player");
                                        playerField.setOccupation(true);
                                        playerField.setStatus("pawn");
                                        field.setStatus("");
                                        field.setOccupation(false);
                                        field.setMembership("none");


                                    }

                                }
                                for (FieldInfo field3 : gameInfo.gameList) {
                                    if (field3.isOccupation() && field3.getLetter().equals("F") && field3.getNumber() == 2 && field3.getMembership().equals("bot")) {
                                        for (FieldInfo field4 : gameInfo.gameList) {
                                            if (!field4.isOccupation() && field4.getLetter().equals("E") && field4.getNumber() == 3) {
                                                c3Em.setVisible(true);
                                                c1Gm.setVisible(true);
                                                c1Gm.setFill(Color.YELLOW);
                                                c1G.setVisible(false);
                                                clicked = true;
                                                field.setStatus("");
                                                field.setOccupation(false);
                                                field.setMembership("none");
                                                removeField.setLetter("F");
                                                removeField.setNumber(2);
                                                removeField.setOccupation(true);
                                                removeField.setStatus("pawn");
                                                removeField.setMembership("bot");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

            } else {
                if(c1Gm.isVisible() && c1Gm.getFill() == Color.YELLOW){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1G.setVisible(true);
                    hideDots();
                    clicked = false;
                }else if(c1Gm.isVisible()){
                    for (FieldInfo field : gameInfo.gameList) {
                        if(!field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 1){
                            field.setStatus("pawn");
                            field.setOccupation(true);
                            field.setMembership("player");
                        }
                    }
                    c1G.setVisible(true);
                    c1G.setFill(playerColor);
                    hideDots();
                    clicked = false;
                    removeFigures(removeField);
                    removeVisible();
                }
            }
        }
    }

    public void hideDots(){
        c4Bm.setVisible(false);
        c8Bm.setVisible(false);
        c8Dm.setVisible(false);
        c8Fm.setVisible(false);
        c8Hm.setVisible(false);
        c7Am.setVisible(false);
        c7Cm.setVisible(false);
        c7Em.setVisible(false);
        c7Gm.setVisible(false);
        c6Bm.setVisible(false);
        c6Dm.setVisible(false);
        c6Fm.setVisible(false);
        c6Hm.setVisible(false);
        c5Am.setVisible(false);
        c5Cm.setVisible(false);
        c5Em.setVisible(false);
        c5Gm.setVisible(false);
        c4Bm.setVisible(false);
        c4Dm.setVisible(false);
        c4Fm.setVisible(false);
        c4Hm.setVisible(false);
        c3Am.setVisible(false);
        c3Cm.setVisible(false);
        c3Em.setVisible(false);
        c3Gm.setVisible(false);
        c2Bm.setVisible(false);
        c2Dm.setVisible(false);
        c2Fm.setVisible(false);
        c2Hm.setVisible(false);
        c1Am.setVisible(false);
        c1Cm.setVisible(false);
        c1Em.setVisible(false);
        c1Gm.setVisible(false);


        c4Bm.setFill(Color.BLUE);
        c8Bm.setFill(Color.BLUE);
        c8Dm.setFill(Color.BLUE);
        c8Fm.setFill(Color.BLUE);
        c8Hm.setFill(Color.BLUE);
        c7Am.setFill(Color.BLUE);
        c7Cm.setFill(Color.BLUE);
        c7Em.setFill(Color.BLUE);
        c7Gm.setFill(Color.BLUE);
        c6Bm.setFill(Color.BLUE);
        c6Dm.setFill(Color.BLUE);
        c6Fm.setFill(Color.BLUE);
        c6Hm.setFill(Color.BLUE);
        c5Am.setFill(Color.BLUE);
        c5Cm.setFill(Color.BLUE);
        c5Em.setFill(Color.BLUE);
        c5Gm.setFill(Color.BLUE);
        c4Bm.setFill(Color.BLUE);
        c4Dm.setFill(Color.BLUE);
        c4Fm.setFill(Color.BLUE);
        c4Hm.setFill(Color.BLUE);
        c3Am.setFill(Color.BLUE);
        c3Cm.setFill(Color.BLUE);
        c3Em.setFill(Color.BLUE);
        c3Gm.setFill(Color.BLUE);
        c2Bm.setFill(Color.BLUE);
        c2Dm.setFill(Color.BLUE);
        c2Fm.setFill(Color.BLUE);
        c2Hm.setFill(Color.BLUE);
        c1Am.setFill(Color.BLUE);
        c1Cm.setFill(Color.BLUE);
        c1Em.setFill(Color.BLUE);
        c1Gm.setFill(Color.BLUE);

    }

    public void removeFigures(FieldInfo fieldToRemove){
        for (FieldInfo field : gameInfo.gameList) {
            if(field.isOccupation() == fieldToRemove.isOccupation() && field.getLetter().equals(fieldToRemove.getLetter()) && field.getNumber() == fieldToRemove.getNumber()){
                field.setStatus("");
                field.setOccupation(false);
                field.setMembership("none");
                removeField.setLetter("");
                removeField.setNumber(0);
                removeField.setMembership("");
                removeField.setOccupation(false);
                removeField.setStatus("");

            }
        }
    }
    public void removeVisible(){
        for (FieldInfo field : gameInfo.gameList) {
            if(c8B.isVisible() && !field.isOccupation() && field.getNumber() == 8 && field.getLetter().equals("B"))c8B.setVisible(false);
            if(c8D.isVisible() && !field.isOccupation() && field.getNumber() == 8 && field.getLetter().equals("D"))c8D.setVisible(false);
            if(c8F.isVisible() && !field.isOccupation() && field.getNumber() == 8 && field.getLetter().equals("F"))c8F.setVisible(false);
            if(c8H.isVisible() && !field.isOccupation() && field.getNumber() == 8 && field.getLetter().equals("H"))c8H.setVisible(false);

            if(c7A.isVisible() && !field.isOccupation() && field.getNumber() == 7 && field.getLetter().equals("A"))c7A.setVisible(false);
            if(c7C.isVisible() && !field.isOccupation() && field.getNumber() == 7 && field.getLetter().equals("C"))c7C.setVisible(false);
            if(c7E.isVisible() && !field.isOccupation() && field.getNumber() == 7 && field.getLetter().equals("E"))c7E.setVisible(false);
            if(c7G.isVisible() && !field.isOccupation() && field.getNumber() == 7 && field.getLetter().equals("G"))c7G.setVisible(false);

            if(c6B.isVisible() && !field.isOccupation() && field.getNumber() == 6 && field.getLetter().equals("B"))c6B.setVisible(false);
            if(c6D.isVisible() && !field.isOccupation() && field.getNumber() == 6 && field.getLetter().equals("D"))c6D.setVisible(false);
            if(c6F.isVisible() && !field.isOccupation() && field.getNumber() == 6 && field.getLetter().equals("F"))c6F.setVisible(false);
            if(c6H.isVisible() && !field.isOccupation() && field.getNumber() == 6 && field.getLetter().equals("H"))c6H.setVisible(false);

            if(c5A.isVisible() && !field.isOccupation() && field.getNumber() == 5 && field.getLetter().equals("A"))c5A.setVisible(false);
            if(c5C.isVisible() && !field.isOccupation() && field.getNumber() == 5 && field.getLetter().equals("C"))c5C.setVisible(false);
            if(c5E.isVisible() && !field.isOccupation() && field.getNumber() == 5 && field.getLetter().equals("E"))c5E.setVisible(false);
            if(c5G.isVisible() && !field.isOccupation() && field.getNumber() == 5 && field.getLetter().equals("G"))c5G.setVisible(false);

            if(c4B.isVisible() && !field.isOccupation() && field.getNumber() == 4 && field.getLetter().equals("B"))c4B.setVisible(false);
            if(c4D.isVisible() && !field.isOccupation() && field.getNumber() == 4 && field.getLetter().equals("D"))c4D.setVisible(false);
            if(c4F.isVisible() && !field.isOccupation() && field.getNumber() == 4 && field.getLetter().equals("F"))c4F.setVisible(false);
            if(c4H.isVisible() && !field.isOccupation() && field.getNumber() == 4 && field.getLetter().equals("H"))c4H.setVisible(false);

            if(c3A.isVisible() && !field.isOccupation() && field.getNumber() == 3 && field.getLetter().equals("A"))c3A.setVisible(false);
            if(c3C.isVisible() && !field.isOccupation() && field.getNumber() == 3 && field.getLetter().equals("D"))c3C.setVisible(false);
            if(c3E.isVisible() && !field.isOccupation() && field.getNumber() == 3 && field.getLetter().equals("E"))c3E.setVisible(false);
            if(c3G.isVisible() && !field.isOccupation() && field.getNumber() == 3 && field.getLetter().equals("G"))c3G.setVisible(false);

            if(c2B.isVisible() && !field.isOccupation() && field.getNumber() == 2 && field.getLetter().equals("B"))c2B.setVisible(false);
            if(c2D.isVisible() && !field.isOccupation() && field.getNumber() == 2 && field.getLetter().equals("D"))c2D.setVisible(false);
            if(c2F.isVisible() && !field.isOccupation() && field.getNumber() == 2 && field.getLetter().equals("F"))c2F.setVisible(false);
            if(c2H.isVisible() && !field.isOccupation() && field.getNumber() == 2 && field.getLetter().equals("H"))c2H.setVisible(false);

            if(c1A.isVisible() && !field.isOccupation() && field.getNumber() == 1 && field.getLetter().equals("A"))c1A.setVisible(false);
            if(c1C.isVisible() && !field.isOccupation() && field.getNumber() == 1 && field.getLetter().equals("C"))c1C.setVisible(false);
            if(c1E.isVisible() && !field.isOccupation() && field.getNumber() == 1 && field.getLetter().equals("E"))c1E.setVisible(false);
            if(c1G.isVisible() && !field.isOccupation() && field.getNumber() == 1 && field.getLetter().equals("G"))c1G.setVisible(false);

        }


    }


}

