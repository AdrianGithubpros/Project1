package com.kodilla.warcaby;

import java.util.ArrayList;
import java.util.List;

public class GameInfo {
    List<FieldInfo> startList = new ArrayList<>();
    List<FieldInfo> gameList;

    public GameInfo(List<FieldInfo> loadList) {

        this.gameList = loadList;
    }
    public GameInfo() {
        // 8 line
        startList.add(new FieldInfo(8,"B","pawn","bot",true));
        startList.add(new FieldInfo(8,"D","pawn","bot",true));
        startList.add(new FieldInfo(8,"F","pawn","bot",true));
        startList.add(new FieldInfo(8,"H","pawn","bot",true));
        // 7 line
        startList.add(new FieldInfo(7,"A","pawn","bot",false));
        startList.add(new FieldInfo(7,"C","pawn","bot",false));
        startList.add(new FieldInfo(7,"E","pawn","bot",false));
        startList.add(new FieldInfo(7,"G","pawn","bot",false));
        // 6 line
        startList.add(new FieldInfo(6,"B","pawn","bot",true));
        startList.add(new FieldInfo(6,"D","pawn","bot",true));
        startList.add(new FieldInfo(6,"F","pawn","bot",true));
        startList.add(new FieldInfo(6,"H","pawn","bot",true));
        // 5 line
        startList.add(new FieldInfo(5,"A","","none",false));
        startList.add(new FieldInfo(5,"C","","none",false));
        startList.add(new FieldInfo(5,"E","","none",false));
        startList.add(new FieldInfo(5,"G","","none",false));
        // 4 line
        startList.add(new FieldInfo(4,"B","","none",false));
        startList.add(new FieldInfo(4,"D","","none",false));
        startList.add(new FieldInfo(4,"F","","none",false));
        startList.add(new FieldInfo(4,"H","","none",false));
        // 3 line
        startList.add(new FieldInfo(3,"A","pawn","player",true));
        startList.add(new FieldInfo(3,"C","pawn","player",true));
        startList.add(new FieldInfo(3,"E","pawn","player",true));
        startList.add(new FieldInfo(3,"G","pawn","player",true));
        // 2 line
        startList.add(new FieldInfo(2,"B","pawn","player",true));
        startList.add(new FieldInfo(2,"D","pawn","player",true));
        startList.add(new FieldInfo(2,"F","pawn","player",true));
        startList.add(new FieldInfo(2,"H","pawn","player",true));
        // 1 line
        startList.add(new FieldInfo(1,"A","pawn","player",true));
        startList.add(new FieldInfo(1,"C","pawn","player",true));
        startList.add(new FieldInfo(1,"E","pawn","player",true));
        startList.add(new FieldInfo(1,"G","pawn","player",true));

        gameList = startList;


    }


}
