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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Controller1 {
    Timer timer = new Timer();
    private Stage stage;
    private Scene scene;
    private Parent root;
    boolean clicked = false;
    boolean gameStarted = false;
    Color playerColor = Color.BLACK;
    boolean botLost = false;
    private Utility utility = new Utility();
    private AI ai = new AI(utility);
    private Map<String, Piece> redPieces = new HashMap<>();
    private Map<String, Piece> whitePieces = new HashMap<>();
    private int[][] boardTable = new int[8][8];
    SaveLoad saveLoad = new SaveLoad();
    private String previousPlace = "";
    private String nextPlace = "";
    private boolean turn = true;
    private boolean jumpleMove = false;
    private List<String[]> jumpMovesToRemove;
    @FXML
    private Circle c8B,c8D,c8F,c8H,c7A,c7C,c7E,c7G,c6B,c6D,c6F,c6H,c5A,c5C,c5E,c5G,c4B,c4D,c4F,c4H,c3A,c3C,c3E,c3G, c2B,c2D,c2F,c2H,c1A,c1C,c1E,c1G;
    @FXML
    private Circle c8Bm,c8Dm,c8Fm,c8Hm,c7Am,c7Cm,c7Em,c7Gm,c6Bm,c6Dm,c6Fm,c6Hm,c5Am,c5Cm,c5Em,c5Gm,c4Bm,c4Dm,c4Fm,c4Hm,c3Am,c3Cm,c3Em,c3Gm,c2Bm,c2Dm,c2Fm,c2Hm,c1Am,c1Cm,c1Em,c1Gm;
    @FXML
    private AnchorPane scenePane1;
    @FXML
    private AnchorPane scenePane2;

    public void setRedPieces(Map<String, Piece> redPieces) {
        this.redPieces = redPieces;
    }
    public void setWhitePieces(Map<String, Piece> whitePieces) {
        this.whitePieces = whitePieces;
    }
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
    public void startWithWhite(ActionEvent event){
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
        c7A.setVisible(true);
        c7C.setFill(Color.RED);
        c7C.setVisible(true);
        c7E.setFill(Color.RED);
        c7E.setVisible(true);
        c7G.setFill(Color.RED);
        c7G.setVisible(true);
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
        System.out.println("hmm somthing is wrong");
        gameStarted = true;
        playerColor = Color.WHITE;
        setBoard();
        showPlayerMovements();

    }
    public void setBoard(){
        for (int y = boardTable.length - 1; y >= 0; y--){
            for (int x = 0; x < boardTable[y].length; x++) {
                if ((x % 2 == 1 && y % 2 == 1) || (x % 2 == 0 && y % 2 == 0)) {
                    if (y < 3) {
                        whitePieces.put(String.valueOf(x) + ":" + String.valueOf(y), new Piece());
                    }
                    if (y > 4) {
                        redPieces.put(String.valueOf(x) + ":" + String.valueOf(y), new Piece());
                    }
                }
            }
        }
    }

    // 8
    public void button8B(ActionEvent event){
        if(!clicked && c8B.getFill().equals(Color.YELLOW)){
            int[] field = {1,7};
            showMovementPlaces(field);
            if(whitePieces.get("1:7").isKing()){
                previousPlace = "1:7k";
            }else{
                previousPlace = "1:7";
            }

            clicked = true;

        }else if(clicked && c8Bm.isVisible()){
            hideDots();
            nextPlace = "1:7";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c8B.getFill().equals(Color.YELLOW) && c8B.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }


    }
    public void button8D(ActionEvent event){
        if(!clicked && c8D.getFill().equals(Color.YELLOW)){
            int[] field = {3,7};
            showMovementPlaces(field);
            clicked = true;
            if(whitePieces.get("3:7").isKing()){
                previousPlace = "3:7k";
            }else{
                previousPlace = "3:7";
            }
        }else if(clicked && c8Dm.isVisible()){
            hideDots();
            nextPlace = "3:7";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c8D.getFill().equals(Color.YELLOW) && c8D.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button8F(ActionEvent event){
        if(!clicked && c8F.getFill().equals(Color.YELLOW)){
            int[] field = {5,7};
            if(whitePieces.get("5:7").isKing()){
                previousPlace = "5:7k";
            }else{
                previousPlace = "5:7";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c8Fm.isVisible()){
            hideDots();
            nextPlace = "5:7";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c8F.getFill().equals(Color.YELLOW) && c8F.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button8H(ActionEvent event){
        if(!clicked && c8H.getFill().equals(Color.YELLOW)){
            int[] field = {7,7};
            if(whitePieces.get("7:7").isKing()){
                previousPlace = "7:7k";
            }else{
                previousPlace = "7:7";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c8Hm.isVisible()){
            hideDots();
            nextPlace = "7:7";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c8H.getFill().equals(Color.YELLOW) && c8H.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }

    public void button7A(ActionEvent event){
        if(!clicked && c7A.getFill().equals(Color.YELLOW)){
            int[] field = {0,6};
            if(whitePieces.get("0:6").isKing()){
                previousPlace = "0:6k";
            }else{
                previousPlace = "0:6";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c7Am.isVisible()){
            hideDots();
            nextPlace = "0:6";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c7A.getFill().equals(Color.YELLOW) && c7A.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button7C(ActionEvent event){
        if(!clicked && c7C.getFill().equals(Color.YELLOW)){
            int[] field = {2,6};
            if(whitePieces.get("2:6").isKing()){
                previousPlace = "2:6k";
            }else{
                previousPlace = "2:6";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c7Cm.isVisible()){
            hideDots();
            nextPlace = "2:6";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c7C.getFill().equals(Color.YELLOW) && c7C.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button7E(ActionEvent event){
        if(!clicked && c7E.getFill().equals(Color.YELLOW)){
            int[] field = {4,6};
            if(whitePieces.get("4:6").isKing()){
                previousPlace = "4:6k";
            }else{
                previousPlace = "4:6";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c7Em.isVisible()){
            hideDots();
            nextPlace = "4:6";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c7E.getFill().equals(Color.YELLOW) && c7E.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button7G(ActionEvent event){
        if(!clicked && c7G.getFill().equals(Color.YELLOW)){
            int[] field = {6,6};
            if(whitePieces.get("6:6").isKing()){
                previousPlace = "6:6k";
            }else{
                previousPlace = "6:6";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c7Gm.isVisible()){
            hideDots();
            nextPlace = "6:6";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c7G.getFill().equals(Color.YELLOW) && c7G.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    // 6
    public void button6B(ActionEvent event){
        if(!clicked && c6B.getFill().equals(Color.YELLOW)){
            int[] field = {1,5};
            if(whitePieces.get("1:5").isKing()){
                previousPlace = "1:5k";
            }else{
                previousPlace = "1:5";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c6Bm.isVisible()){
            hideDots();
            nextPlace = "1:5";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c6B.getFill().equals(Color.YELLOW) && c6B.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button6D(ActionEvent event){
        if(!clicked && c6D.getFill().equals(Color.YELLOW)){
            int[] field = {3,5};
            if(whitePieces.get("3:5").isKing()){
                previousPlace = "3:5k";
            }else{
                previousPlace = "3:5";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c6Dm.isVisible()){
            hideDots();
            nextPlace = "3:5";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c6D.getFill().equals(Color.YELLOW) && c6D.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button6F(ActionEvent event){
        if(!clicked && c6F.getFill().equals(Color.YELLOW)){
            int[] field = {5,5};
            if(whitePieces.get("5:5").isKing()){
                previousPlace = "5:5k";
            }else{
                previousPlace = "5:5";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c6Fm.isVisible()){
            hideDots();
            nextPlace = "5:5";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c6F.getFill().equals(Color.YELLOW) && c6F.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button6H(ActionEvent event){
        if(!clicked && c6H.getFill().equals(Color.YELLOW)){
            int[] field = {7,5};
            if(whitePieces.get("7:5").isKing()){
                previousPlace = "7:5k";
            }else{
                previousPlace = "7:5";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c6Hm.isVisible()){
            hideDots();
            nextPlace = "7:5";
            playerMove(previousPlace ,nextPlace);
            if(turn == false) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c6H.getFill().equals(Color.YELLOW) && c6H.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    // 5
    public void button5A(ActionEvent event){
        if(!clicked && c5A.getFill().equals(Color.YELLOW)){
            int[] field = {0,4};
            if(whitePieces.get("0:4").isKing()){
                previousPlace = "0:4k";
            }else{
                previousPlace = "0:4";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c5Am.isVisible()){
            hideDots();
            nextPlace = "0:4";
            playerMove(previousPlace ,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c5A.getFill().equals(Color.YELLOW) && c5A.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button5C(ActionEvent event){
        if(!clicked && c5C.getFill().equals(Color.YELLOW)){
            int[] field = {2,4};
            if(whitePieces.get("2:4").isKing()){
                previousPlace = "2:4k";
            }else{
                previousPlace = "2:4";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c5Cm.isVisible()){
            hideDots();
            nextPlace = "2:4";
            playerMove(previousPlace ,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c5C.getFill().equals(Color.YELLOW) && c5C.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button5E(ActionEvent event){
        if(!clicked && c5E.getFill().equals(Color.YELLOW)){
            int[] field = {4,4};
            if(whitePieces.get("4:4").isKing()){
                previousPlace = "4:4k";
            }else{
                previousPlace = "4:4";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c5Em.isVisible()){
            hideDots();
            nextPlace = "4:4";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c5E.getFill().equals(Color.YELLOW) && c5E.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button5G(ActionEvent event){
        if(!clicked && c5G.getFill().equals(Color.YELLOW)){
            int[] field = {6,4};
            if(whitePieces.get("6:4").isKing()){
                previousPlace = "6:4k";
            }else{
                previousPlace = "6:4";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c5Gm.isVisible()){
            hideDots();
            nextPlace = "6:4";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c5G.getFill().equals(Color.YELLOW) && c5G.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    // 4
    public void button4B(ActionEvent event){
        if(!clicked && c4B.getFill().equals(Color.YELLOW)){
            int[] field = {1,3};
            if(whitePieces.get("1:3").isKing()){
                previousPlace = "1:3k";
            }else{
                previousPlace = "1:3";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c4Bm.isVisible()){
            hideDots();
            nextPlace = "1:3";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }

        }else if(clicked && c4B.getFill().equals(Color.YELLOW) && c4B.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

        }
    public void button4D(ActionEvent event){
        if(!clicked && c4D.getFill().equals(Color.YELLOW)){
            int[] field = {3,3};
            if(whitePieces.get("3:3").isKing()){
                previousPlace = "3:3k";
            }else{
                previousPlace = "3:3";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c4Dm.isVisible()){
            hideDots();
            nextPlace = "3:3";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c4D.getFill().equals(Color.YELLOW) && c4D.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button4F(ActionEvent event){
        if(!clicked && c4F.getFill().equals(Color.YELLOW)){
            int[] field = {5,3};
            if(whitePieces.get("5:3").isKing()){
                previousPlace = "5:3k";
            }else{
                previousPlace = "5:3";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c4Fm.isVisible()){
            hideDots();
            nextPlace = "5:3";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c4F.getFill().equals(Color.YELLOW) && c4F.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button4H(ActionEvent event){
        if(!clicked && c4H.getFill().equals(Color.YELLOW)){
            int[] field = {7,3};
            if(whitePieces.get("7:3").isKing()){
                previousPlace = "7:3k";
            }else{
                previousPlace = "7:3";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c4Hm.isVisible()){
            hideDots();
            nextPlace = "7:3";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c4H.getFill().equals(Color.YELLOW) && c4H.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    // 3
    public void button3A(ActionEvent event){
        if(!clicked && c3A.getFill().equals(Color.YELLOW)){
            int[] field = {0,2};
            if(whitePieces.get("0:2").isKing()){
                previousPlace = "0:2k";
            }else{
                previousPlace = "0:2";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c3Am.isVisible()){
            hideDots();
            nextPlace = "0:2";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c3A.getFill().equals(Color.YELLOW) && c3A.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button3C(ActionEvent event){
        if(!clicked && c3C.getFill().equals(Color.YELLOW)){
            int[] field = {2,2};
            if(whitePieces.get("2:2").isKing()){
                previousPlace = "2:2k";
            }else{
                previousPlace = "2:2";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c3Cm.isVisible()){
            hideDots();
            nextPlace = "2:2";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c3C.getFill().equals(Color.YELLOW) && c3C.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button3E(ActionEvent event){
        if(!clicked && c3E.getFill().equals(Color.YELLOW)){
            int[] field = {4,2};
            if(whitePieces.get("4:2").isKing()){
                previousPlace = "4:2k";
            }else{
                previousPlace = "4:2";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c3Em.isVisible()){
            hideDots();
            nextPlace = "4:2";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c3E.getFill().equals(Color.YELLOW) && c3E.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }

    }
    public void button3G(ActionEvent event){
        if(!clicked && c3G.getFill().equals(Color.YELLOW)){
            int[] field = {6,2};
            if(whitePieces.get("6:2").isKing()){
                previousPlace = "6:2k";
            }else{
                previousPlace = "6:2";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c3Gm.isVisible()){
            hideDots();
            nextPlace = "6:2";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c3G.getFill().equals(Color.YELLOW) && c3G.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    // 2
    public void button2B(ActionEvent event){
        if(!clicked && c2B.getFill().equals(Color.YELLOW)){
            int[] field = {1,1};
            if(whitePieces.get("1:1").isKing()){
                previousPlace = "1:1k";
            }else{
                previousPlace = "1:1";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c2Bm.isVisible()){
            hideDots();
            nextPlace = "1:1";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c2B.getFill().equals(Color.YELLOW) && c2B.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button2D(ActionEvent event){
        if(!clicked && c2D.getFill().equals(Color.YELLOW)){
            int[] field = {3,1};
            if(whitePieces.get("3:1").isKing()){
                previousPlace = "3:1k";
            }else{
                previousPlace = "3:1";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c2Dm.isVisible()){
            hideDots();
            nextPlace = "3:1";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c2D.getFill().equals(Color.YELLOW) && c2D.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button2F(ActionEvent event){
        if(!clicked && c2F.getFill().equals(Color.YELLOW)){
            int[] field = {5,1};
            if(whitePieces.get("5:1").isKing()){
                previousPlace = "5:1k";
            }else{
                previousPlace = "5:1";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c2Fm.isVisible()){
            hideDots();
            nextPlace = "5:1";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c2F.getFill().equals(Color.YELLOW) && c2F.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button2H(ActionEvent event){
        if(!clicked && c2H.getFill().equals(Color.YELLOW)){
            int[] field = {7,1};
            if(whitePieces.get("7:1").isKing()){
                previousPlace = "7:1k";
            }else{
                previousPlace = "7:1";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c2Hm.isVisible()){
            hideDots();
            nextPlace = "7:1";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c2H.getFill().equals(Color.YELLOW) && c2H.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }

    public void button1A(ActionEvent event){
        if(!clicked && c1A.getFill().equals(Color.YELLOW)){
            int[] field = {0,0};
            if(whitePieces.get("0:0").isKing()){
                previousPlace = "0:0k";
            }else{
                previousPlace = "0:0";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c1Am.isVisible()){
            hideDots();
            nextPlace = "0:0";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c1A.getFill().equals(Color.YELLOW) && c1A.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button1C(ActionEvent event){
        if(!clicked && c1C.getFill().equals(Color.YELLOW)){
            int[] field = {2,0};
            if(whitePieces.get("2:0").isKing()){
                previousPlace = "2:0k";
            }else{
                previousPlace = "2:0";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c1Cm.isVisible()){
            hideDots();
            nextPlace = "2:0";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c1C.getFill().equals(Color.YELLOW) && c1C.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button1E(ActionEvent event){
        if(!clicked && c1E.getFill().equals(Color.YELLOW)){
            int[] field = {4,0};
            if(whitePieces.get("4:0").isKing()){
                previousPlace = "4:0k";
            }else{
                previousPlace = "4:0";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c1Em.isVisible()){
            hideDots();
            nextPlace = "4:0";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c1E.getFill().equals(Color.YELLOW) && c1E.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }
    public void button1G(ActionEvent event){
        if(!clicked && c1G.getFill().equals(Color.YELLOW)){
            int[] field = {6,0};
            if(whitePieces.get("6:0").isKing()){
                previousPlace = "6:0k";
            }else{
                previousPlace = "6:0";
            }
            showMovementPlaces(field);
            clicked = true;

        }else if(clicked && c1Gm.isVisible()){
            hideDots();
            nextPlace = "6:0";
            playerMove(previousPlace,nextPlace);
            if(!turn) {
                aiMove();
                showPlayerMovements();
                clicked = false;
            }
        }else if(clicked && c1G.getFill().equals(Color.YELLOW) && c1G.isVisible()){
            hideDots();
            showPlayerMovements();
            clicked = false;
        }
    }

    public void hideDots(){
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


    public void aiMove(){

        ai.moveAI(whitePieces,redPieces);
        redPieces = ai.getFinalRedPieces();
        whitePieces = ai.getFinalWhitePieces();
        ai.finalRefresh();
        hideAllPieces();
        setBoardAfterLoad();
        turn = true;
    }



    public void playerMove(String prev,String next){

        if(jumpleMove){
            whitePieces.remove(prev);
            removeAfterJump(prev, next);
            if(prev.length() == 4){
                whitePieces.put(next.substring(0, 3), new Piece(true));
            }else{
                whitePieces.put(next, new Piece());
            }
            hideAllPieces();
            setBoardAfterLoad();
            List<String[]> nextJumps = checkMultiMove(next);
            if(!nextJumps.isEmpty()){
                setRingsMovementsJump(nextJumps, utility.getXY(next));
            }else{
                turn = false;
            }
        }else{
            whitePieces.remove(prev);
            if(prev.length() == 4){
                whitePieces.put(next.substring(0, 3), new Piece(true));
            }else{
                whitePieces.put(next, new Piece());
            }
            hideAllPieces();
            setBoardAfterLoad();
            jumpleMove = false;
            turn = false;
        }
    }
    public void showMovementPlaces(int[] field){

        List<String[]> simpleMoves = utility.getSimpleMoves();
        List<String[]> jumpMoves = utility.getJumpMoves();

        if(!jumpMoves.isEmpty()){
            setRingsMovementsJump(jumpMoves,field);

        }else{
            setRingsMovementsSimple(simpleMoves,field);
        }
    }
    public void showPlayerMovements(){

        utility.clearMoves();

        for (String moveKey : getWhitePieces().keySet()) {
            utility.successor(moveKey, getWhitePieces(), getRedPieces(), true);
        }
        List<String[]> simpleMoves = utility.getSimpleMoves();
        List<String[]> jumpMoves = utility.getJumpMoves();

        if (!jumpMoves.isEmpty()) {
            setPossibleMovements(jumpMoves);

        } else {
            setPossibleMovements(simpleMoves);
        }
        if (whitePieces.size() == 0) {
            System.out.println("Game Over!");
        }
        if (simpleMoves.isEmpty() && jumpMoves.isEmpty()) {
            System.out.println("Game Over!");
        }
        System.out.println("test");
    }
    private void setPossibleMovements(List<String[]> moves) {

       // clearBoard();

        for (String[] move : moves) {
            String key = move[1];
            int[] xy = utility.getXY(key);
            boolean king = whitePieces.get(key).isKing();


                if (xy[0] == 1 && xy[1] == 7) c8B.setFill(Color.YELLOW);
                if (xy[0] == 3 && xy[1] == 7) c8D.setFill(Color.YELLOW);
                if (xy[0] == 5 && xy[1] == 7) c8F.setFill(Color.YELLOW);
                if (xy[0] == 7 && xy[1] == 7) c8H.setFill(Color.YELLOW);

                if (xy[0] == 0 && xy[1] == 6) c7A.setFill(Color.YELLOW);
                if (xy[0] == 2 && xy[1] == 6) c7C.setFill(Color.YELLOW);
                if (xy[0] == 4 && xy[1] == 6) c7E.setFill(Color.YELLOW);
                if (xy[0] == 6 && xy[1] == 6) c7G.setFill(Color.YELLOW);

                if (xy[0] == 1 && xy[1] == 5) c6B.setFill(Color.YELLOW);
                if (xy[0] == 3 && xy[1] == 5) c6D.setFill(Color.YELLOW);
                if (xy[0] == 5 && xy[1] == 5) c6F.setFill(Color.YELLOW);
                if (xy[0] == 7 && xy[1] == 5) c6H.setFill(Color.YELLOW);

                if (xy[0] == 0 && xy[1] == 4) c5A.setFill(Color.YELLOW);
                if (xy[0] == 2 && xy[1] == 4) c5C.setFill(Color.YELLOW);
                if (xy[0] == 4 && xy[1] == 4) c5E.setFill(Color.YELLOW);
                if (xy[0] == 6 && xy[1] == 4) c5G.setFill(Color.YELLOW);

                if (xy[0] == 1 && xy[1] == 3) c4B.setFill(Color.YELLOW);
                if (xy[0] == 3 && xy[1] == 3) c4D.setFill(Color.YELLOW);
                if (xy[0] == 5 && xy[1] == 3) c4F.setFill(Color.YELLOW);
                if (xy[0] == 7 && xy[1] == 3) c4H.setFill(Color.YELLOW);

                if (xy[0] == 0 && xy[1] == 2) c3A.setFill(Color.YELLOW);
                if (xy[0] == 2 && xy[1] == 2) c3C.setFill(Color.YELLOW);
                if (xy[0] == 4 && xy[1] == 2) c3E.setFill(Color.YELLOW);
                if (xy[0] == 6 && xy[1] == 2) c3G.setFill(Color.YELLOW);

                if (xy[0] == 1 && xy[1] == 1) c2B.setFill(Color.YELLOW);
                if (xy[0] == 3 && xy[1] == 1) c2D.setFill(Color.YELLOW);
                if (xy[0] == 5 && xy[1] == 1) c2F.setFill(Color.YELLOW);
                if (xy[0] == 7 && xy[1] == 1) c2H.setFill(Color.YELLOW);

                if (xy[0] == 0 && xy[1] == 0) c1A.setFill(Color.YELLOW);
                if (xy[0] == 2 && xy[1] == 0) c1C.setFill(Color.YELLOW);
                if (xy[0] == 4 && xy[1] == 0) c1E.setFill(Color.YELLOW);
                if (xy[0] == 6 && xy[1] == 0) c1G.setFill(Color.YELLOW);
        }


    }
    private void setRingsMovementsSimple(List<String[]> moves , int[] xyField) {

        // clearBoard();
        int[] xyRes = xyField;
        for (String[] move : moves) {
            String key = move[1];
            String key1 = move[0];

            int[] xy = utility.getXY(key1);
            int[] xy1 = utility.getXY(key);
            boolean king = whitePieces.get(key).isKing();

            if (xy[0] == 1 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Gm.setVisible(true);

            if (xy[0] == 1 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Gm.setVisible(true);

            if (xy[0] == 1 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Gm.setVisible(true);

            if (xy[0] == 1 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Gm.setVisible(true);
        }


    }
    private void setRingsMovementsJump(List<String[]> moves , int[] xyField) {
        jumpMovesToRemove = moves;
        jumpleMove = true;
        int[] xyRes = xyField;
        for (String[] move : moves) {
            String key = move[1];
            String key1 = move[0];


            int[] xy = utility.getXY(key1);
            int[] xy1 = utility.getXY(key);
           // boolean king = whitePieces.get(key).isKing();

            if (xy[0] == 1 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 7 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c8Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 6 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c7Gm.setVisible(true);

            if (xy[0] == 1 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 5 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c6Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 4 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c5Gm.setVisible(true);

            if (xy[0] == 1 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 3 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c4Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 2 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c3Gm.setVisible(true);

            if (xy[0] == 1 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Bm.setVisible(true);
            if (xy[0] == 3 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Dm.setVisible(true);
            if (xy[0] == 5 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Fm.setVisible(true);
            if (xy[0] == 7 && xy[1] == 1 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c2Hm.setVisible(true);

            if (xy[0] == 0 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Am.setVisible(true);
            if (xy[0] == 2 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Cm.setVisible(true);
            if (xy[0] == 4 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Em.setVisible(true);
            if (xy[0] == 6 && xy[1] == 0 && xyRes[0] == xy1[0] && xyRes[1] == xy1[1]) c1Gm.setVisible(true);
        }


    }
    public Map<String, Piece> getRedPieces() {
        return redPieces;
    }
    public Map<String, Piece> getWhitePieces(){
        return whitePieces;
    }

    public void save(ActionEvent event)throws FileNotFoundException {
        boolean sureDo = false;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Save game");
        alert.setHeaderText("You are saving the game you will lost your last save");
        alert.setContentText("Are you sure you want to save?");
        if(alert.showAndWait().get() == ButtonType.OK){
          sureDo = true;
            }
        if(sureDo == true) {
            try {

                saveLoad.save(whitePieces, redPieces);
            } catch (FileNotFoundException e) {
                Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                alert1.setTitle("Error");
                alert1.setHeaderText("File missing");
                alert1.setContentText("There is problem with a file check if file save.txt is in resources");
                if (alert1.showAndWait().get() == ButtonType.OK) {
                }
            }

        }
    }
    public void laod(ActionEvent event)throws FileNotFoundException {
        boolean sureDo = false;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Load game");
        alert.setHeaderText("You are loading last game you will lost this one");
        alert.setContentText("Are you sure you want to save?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            sureDo = true;
        }
        if(sureDo == true) {
            try {
                saveLoad.laod();
                setWhitePieces(saveLoad.getWhiteMap());
                setRedPieces(saveLoad.getRedMap());
                setBoardAfterLoad();
                clicked = false;
                gameStarted = true;
                hideDots();
            } catch (FileNotFoundException e) {
                Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                alert1.setTitle("Error");
                alert1.setHeaderText("File missing");
                alert1.setContentText("There is problem with a file check if file save.txt is in resources");
                if (alert1.showAndWait().get() == ButtonType.OK) {
                }
            }
        }
    }

    public void setBoardAfterLoad(){
        for (Map.Entry<String, Piece> entry :whitePieces.entrySet()) {
        if(entry.getKey().equals("1:7")){
            c8B.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c8B.setFill(Color.GRAY);
            c8B.setVisible(true);
        }
        if(entry.getKey().equals("3:7")){
            c8D.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c8D.setFill(Color.GRAY);
            c8D.setVisible(true);
            }
        if(entry.getKey().equals("5:7")){
            c8F.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c8F.setFill(Color.GRAY);
            c8F.setVisible(true);
            }
        if(entry.getKey().equals("7:7")){
            c8H.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c8H.setFill(Color.GRAY);
            c8H.setVisible(true);
            }
        if(entry.getKey().equals("0:6")){
            c7A.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c7A.setFill(Color.GRAY);
            c7A.setVisible(true);
            }
        if(entry.getKey().equals("2:6")){
            c7C.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c7C.setFill(Color.GRAY);
            c7C.setVisible(true);
            }
        if(entry.getKey().equals("4:6")){
            c7E.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c7E.setFill(Color.GRAY);
            c7E.setVisible(true);
            }
        if(entry.getKey().equals("6:6")){
            c7G.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c7G.setFill(Color.GRAY);
            c7G.setVisible(true);
            }
        if(entry.getKey().equals("1:5")){
            c6B.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c6B.setFill(Color.GRAY);
            c6B.setVisible(true);
            }
        if(entry.getKey().equals("3:5")){
            c6D.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c6D.setFill(Color.GRAY);
            c6D.setVisible(true);
            }
        if(entry.getKey().equals("5:5")){
            c6F.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c6F.setFill(Color.GRAY);
            c6F.setVisible(true);
            }
        if(entry.getKey().equals("7:5")){
            c6H.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c6H.setFill(Color.GRAY);
            c6H.setVisible(true);
            }
        if(entry.getKey().equals("0:4")){
            c5A.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c5A.setFill(Color.GRAY);
            c5A.setVisible(true);
            }
        if(entry.getKey().equals("2:4")){
            c5C.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c5C.setFill(Color.GRAY);
            c5C.setVisible(true);
            }
        if(entry.getKey().equals("4:4")){
            c5E.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c5E.setFill(Color.GRAY);
            c5E.setVisible(true);
            }
        if(entry.getKey().equals("6:4")){
            c5G.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c5G.setFill(Color.GRAY);
            c5G.setVisible(true);
            }
        if(entry.getKey().equals("1:3")){
                c4B.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c4B.setFill(Color.GRAY);
                c4B.setVisible(true);
            }
        if(entry.getKey().equals("3:3")){
                c4D.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c4D.setFill(Color.GRAY);
                c4D.setVisible(true);
            }
        if(entry.getKey().equals("5:3")){
                c4F.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c4F.setFill(Color.GRAY);
                c4F.setVisible(true);
            }
        if(entry.getKey().equals("7:3")){
                c4H.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c4H.setFill(Color.GRAY);
                c4H.setVisible(true);
            }
        if(entry.getKey().equals("0:2")){
                c3A.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c3A.setFill(Color.GRAY);
                c3A.setVisible(true);
            }
        if(entry.getKey().equals("2:2")){
                c3C.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c3C.setFill(Color.GRAY);
                c3C.setVisible(true);
            }
        if(entry.getKey().equals("4:2")){
                c3E.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c3E.setFill(Color.GRAY);
                c3E.setVisible(true);
            }
        if(entry.getKey().equals("6:2")){
                c3G.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c3G.setFill(Color.GRAY);
                c3G.setVisible(true);
            }
        if(entry.getKey().equals("1:1")){
                c2B.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c2B.setFill(Color.GRAY);
                c2B.setVisible(true);
            }
        if(entry.getKey().equals("3:1")){
                c2D.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c2D.setFill(Color.GRAY);
                c2D.setVisible(true);
            }
        if(entry.getKey().equals("5:1")){
                c2F.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c2F.setFill(Color.GRAY);
                c2F.setVisible(true);
            }
        if(entry.getKey().equals("7:1")){
                c2H.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c2H.setFill(Color.GRAY);
                c2H.setVisible(true);
            }
        if(entry.getKey().equals("0:0")){
                c1A.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c1A.setFill(Color.GRAY);
                c1A.setVisible(true);
            }
        if(entry.getKey().equals("2:0")){
                c1C.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c1C.setFill(Color.GRAY);
                c1C.setVisible(true);
            }
        if(entry.getKey().equals("4:0")){
                c1E.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c1E.setFill(Color.GRAY);
                c1E.setVisible(true);
            }
        if(entry.getKey().equals("6:0")){
                c1G.setFill(Color.WHITE);
            if(entry.getValue().isKing() == true)c1G.setFill(Color.GRAY);
                c1G.setVisible(true);
            }


        }
        for (Map.Entry<String, Piece> entry :redPieces.entrySet()) {
            if(entry.getKey().equals("1:7")){
                c8B.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c8B.setFill(Color.PINK);
                c8B.setVisible(true);
            }
            if(entry.getKey().equals("3:7")){
                c8D.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c8D.setFill(Color.PINK);
                c8D.setVisible(true);
            }
            if(entry.getKey().equals("5:7")){
                c8F.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c8F.setFill(Color.PINK);
                c8F.setVisible(true);
            }
            if(entry.getKey().equals("7:7")){
                c8H.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c8H.setFill(Color.PINK);
                c8H.setVisible(true);
            }
            if(entry.getKey().equals("0:6")){
                c7A.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c7A.setFill(Color.PINK);
                c7A.setVisible(true);
            }
            if(entry.getKey().equals("2:6")){
                c7C.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c7C.setFill(Color.PINK);
                c7C.setVisible(true);
            }
            if(entry.getKey().equals("4:6")){
                c7E.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c7E.setFill(Color.PINK);
                c7E.setVisible(true);
            }
            if(entry.getKey().equals("6:6")){
                c7G.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c7G.setFill(Color.PINK);
                c7G.setVisible(true);
            }
            if(entry.getKey().equals("1:5")){
                c6B.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c6B.setFill(Color.PINK);
                c6B.setVisible(true);
            }
            if(entry.getKey().equals("3:5")){
                c6D.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c6D.setFill(Color.PINK);
                c6D.setVisible(true);
            }
            if(entry.getKey().equals("5:5")){
                c6F.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c6F.setFill(Color.PINK);
                c6F.setVisible(true);
            }
            if(entry.getKey().equals("7:5")){
                c6H.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c6H.setFill(Color.PINK);
                c6H.setVisible(true);
            }
            if(entry.getKey().equals("0:4")){
                c5A.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c5A.setFill(Color.PINK);
                c5A.setVisible(true);
            }
            if(entry.getKey().equals("2:4")){
                c5C.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c5C.setFill(Color.PINK);
                c5C.setVisible(true);
            }
            if(entry.getKey().equals("4:4")){
                c5E.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c5E.setFill(Color.PINK);
                c5E.setVisible(true);
            }
            if(entry.getKey().equals("6:4")){
                c5G.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c5G.setFill(Color.PINK);
                c5G.setVisible(true);
            }
            if(entry.getKey().equals("1:3")){
                c4B.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c4B.setFill(Color.PINK);
                c4B.setVisible(true);
            }
            if(entry.getKey().equals("3:3")){
                c4D.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c4D.setFill(Color.PINK);
                c4D.setVisible(true);
            }
            if(entry.getKey().equals("5:3")){
                c4F.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c4F.setFill(Color.PINK);
                c4F.setVisible(true);
            }
            if(entry.getKey().equals("7:3")){
                c4H.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c4H.setFill(Color.PINK);
                c4H.setVisible(true);
            }
            if(entry.getKey().equals("0:2")){
                c3A.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c3A.setFill(Color.PINK);
                c3A.setVisible(true);
            }
            if(entry.getKey().equals("2:2")){
                c3C.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c3C.setFill(Color.PINK);
                c3C.setVisible(true);
            }
            if(entry.getKey().equals("4:2")){
                c3E.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c3E.setFill(Color.PINK);
                c3E.setVisible(true);
            }
            if(entry.getKey().equals("6:2")){
                c3G.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c3G.setFill(Color.PINK);
                c3G.setVisible(true);
            }
            if(entry.getKey().equals("1:1")){
                c2B.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c2B.setFill(Color.PINK);
                c2B.setVisible(true);
            }
            if(entry.getKey().equals("3:1")){
                c2D.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c2D.setFill(Color.PINK);
                c2D.setVisible(true);
            }
            if(entry.getKey().equals("5:1")){
                c2F.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c2F.setFill(Color.PINK);
                c2F.setVisible(true);
            }
            if(entry.getKey().equals("7:1")){
                c2H.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c2H.setFill(Color.PINK);
                c2H.setVisible(true);
            }
            if(entry.getKey().equals("0:0")){
                c1A.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c1A.setFill(Color.PINK);
                c1A.setVisible(true);
            }
            if(entry.getKey().equals("2:0")){
                c1C.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c1C.setFill(Color.PINK);
                c1C.setVisible(true);
            }
            if(entry.getKey().equals("4:0")){
                c1E.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c1E.setFill(Color.PINK);
                c1E.setVisible(true);
            }
            if(entry.getKey().equals("6:0")){
                c1G.setFill(Color.RED);
                if(entry.getValue().isKing() == true)c1G.setFill(Color.PINK);
                c1G.setVisible(true);
            }
        }
    }
    public void hideAllPieces(){

        c8B.setVisible(false);
        c8D.setVisible(false);
        c8F.setVisible(false);
        c8H.setVisible(false);

        c7A.setVisible(false);
        c7C.setVisible(false);
        c7E.setVisible(false);
        c7G.setVisible(false);

        c6B.setVisible(false);
        c6D.setVisible(false);
        c6F.setVisible(false);
        c6H.setVisible(false);

        c5A.setVisible(false);
        c5C.setVisible(false);
        c5E.setVisible(false);
        c5G.setVisible(false);

        c4B.setVisible(false);
        c4D.setVisible(false);
        c4F.setVisible(false);
        c4H.setVisible(false);

        c3A.setVisible(false);
        c3C.setVisible(false);
        c3E.setVisible(false);
        c3G.setVisible(false);

        c2B.setVisible(false);
        c2D.setVisible(false);
        c2F.setVisible(false);
        c2H.setVisible(false);

        c1A.setVisible(false);
        c1C.setVisible(false);
        c1E.setVisible(false);
        c1G.setVisible(false);

    }
    public List<String[]> checkMultiMove(String position){

         List<String[]> jumpMoves = new ArrayList<>();

            String[] xy = position.split(":");
            int x = Integer.valueOf(xy[0]);
            int y = Integer.valueOf(xy[1]);

        int maxY = y + 1;
        int minY = y - 1;
        int minX = x - 1;
        int maxX = x + 1;


        int jumpMaxY = y + 2;
        int jumpMinY = y - 2;
        int jumpMaxX = x + 2;
        int jumpMinX = x - 2;

        String simpleMoveKey1 = utility.createKey(maxX, minY);
        String simpleMoveKey2 = utility.createKey(minX, minY);
        String simpleMoveKey3 = utility.createKey(maxX, maxY);
        String simpleMoveKey4 = utility.createKey(minX, maxY);

        String jumpKey1 = utility.createKey(jumpMaxX, jumpMinY);
        String jumpKey2 = utility.createKey(jumpMinX, jumpMinY);
        String jumpKey3 = utility.createKey(jumpMaxX, jumpMaxY);
        String jumpKey4 = utility.createKey(jumpMinX, jumpMaxY);



            if (!whitePieces.containsKey(jumpKey1) && !redPieces.containsKey(jumpKey1)) {
                if (redPieces.containsKey(simpleMoveKey1)) {
                    if (jumpMaxX <= 7 && jumpMinY >= 0) {
                        String[] jumpMoveKeys = {jumpKey1, position.substring(0,3), simpleMoveKey1};
                        jumpMoves.add((jumpMoveKeys));
                    }
                }
            }
            if (!whitePieces.containsKey(jumpKey2) && !redPieces.containsKey(jumpKey2)) {
                if (redPieces.containsKey(simpleMoveKey2)) {
                    if (jumpMinX >= 0 && jumpMinY >= 0 ) {
                        String[] jumpMoveKeys = {jumpKey2, position.substring(0,3), simpleMoveKey2};
                        jumpMoves.add(jumpMoveKeys);
                    }
                }
            }

            if (!whitePieces.containsKey(jumpKey3) && !redPieces.containsKey(jumpKey3)) {
                if (redPieces.containsKey(simpleMoveKey3)) {
                    if (jumpMaxX <= 7 && jumpMaxY <= 0) {
                        String[] jumpMoveKeys = {jumpKey3, position.substring(0,3), simpleMoveKey3};
                        jumpMoves.add((jumpMoveKeys));
                    }
                }
            }
            if (!whitePieces.containsKey(jumpKey4) && !redPieces.containsKey(jumpKey4)) {
                if (redPieces.containsKey(simpleMoveKey4)) {
                    if (jumpMinX >= 0 && jumpMaxY <= 7) {
                        String[] jumpMoveKeys = {jumpKey4, position.substring(0,3), simpleMoveKey4};
                        jumpMoves.add(jumpMoveKeys);
                    }
                }
            }
       return jumpMoves;
    }
    public void removeAfterJump(String prev, String next){
        for (String[] move : jumpMovesToRemove) {
         if(move[0].equals(next) && move[1].equals(prev)) {
             redPieces.remove(move[2]);
         }
        }
        jumpMovesToRemove = new ArrayList<>();
    }

    public void checkAndSetForKing(){


    }
    public void botStepMovement(){

    }
}

