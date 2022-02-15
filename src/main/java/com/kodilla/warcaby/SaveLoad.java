package com.kodilla.warcaby;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveLoad {
    Map<String, Piece> redMap = new HashMap<>();
    Map<String, Piece> whiteMap = new HashMap<>();

    public void save(Map<String, Piece> whitePieces , Map<String, Piece> redPieces)throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("save.txt");
        String whiteString = "";
        String redString = "";
        for (Map.Entry<String, Piece> entry :whitePieces.entrySet()) {
            if(entry.getValue().isKing() == true){
                whiteString = whiteString + entry.getKey() + "K/";
            }else {
                whiteString = whiteString + entry.getKey() + "/";
            }
        }

        for (Map.Entry<String, Piece> entry :redPieces.entrySet()) {
            if(entry.getValue().isKing() == true){
                redString = redString + entry.getKey() + "K/";
            }else {
                redString = redString + entry.getKey() + "/";
            }
        }

        zapis.println(whiteString);
        zapis.println(redString);
        zapis.close();

    }

    public Map<String, Piece> getRedMap() {
        return redMap;
    }

    public Map<String, Piece> getWhiteMap() {
        return whiteMap;
    }

    public void laod()throws FileNotFoundException{


        File file = new File("save.txt");
        Scanner in = new Scanner(file);

        String whiteString = in.nextLine();
        String redString = in.nextLine();
        String[] whiteTable = whiteString.split("/");
        String[] redTable = redString.split("/");
        Map<String, Piece> redMap = new HashMap<>();
        Map<String, Piece> whiteMap = new HashMap<>();
        for (int i = 0; i < whiteTable.length ;i++){
            if(whiteTable[i].length() == 4){
                String actualValue = whiteTable[i].substring(0, 3);
             whiteMap.put(actualValue, new Piece(true));
            }else{
                whiteMap.put(whiteTable[i], new Piece(false));
            }
        }

        for (int i = 0; i < redTable.length ;i++){
            if(redTable[i].length() == 4){
                String actualValue = redTable[i].substring(0, 3);
                redMap.put(actualValue, new Piece(true));
            }else{
                redMap.put(redTable[i], new Piece(false));
            }
        }





    }
}
