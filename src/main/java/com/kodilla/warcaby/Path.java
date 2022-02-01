package com.kodilla.warcaby;

import java.util.ArrayList;
import java.util.List;

public class Path{

List<FieldInfo> list = new ArrayList<>();
int value = 0;
int pathNumber;

    public void addToPath(FieldInfo field){
        list.add(field);
    }

    public List<FieldInfo> getList(){
        return list;
    }

    public int getValue() {
        return value;
    }

    public void addToValue(int value) {
        this.value += value;
    }

    public void setPathNumber(int pathNumber) {
        this.pathNumber = pathNumber;
    }

    public int getPathNumber() {
        return pathNumber;
    }
}
