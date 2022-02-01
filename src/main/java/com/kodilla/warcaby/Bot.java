package com.kodilla.warcaby;

import java.util.ArrayList;
import java.util.List;

public class Bot {
    List<FieldInfo> listBot;

    public Bot(List<FieldInfo> list) {
        this.listBot = list;
    }


    public List<FieldInfo> listOFMoves(Path path){

        return path.getList();
    }
    public Path finalPath(List<FieldInfo> listToMove){
        Path path = pathing(listToMove);
        Path finalPath = new Path();
        switch(path.getPathNumber()) {
            case 1:
                finalPath.addToPath(new FieldInfo(8, "B", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 2:
                finalPath.addToPath(new FieldInfo(8, "D", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 3:
                finalPath.addToPath(new FieldInfo(8, "F", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 4:
                finalPath.addToPath(new FieldInfo(8, "H", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;

            case 5:
                finalPath.addToPath(new FieldInfo(7, "A", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 6:
                finalPath.addToPath(new FieldInfo(7, "C", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 7:
                finalPath.addToPath(new FieldInfo(7, "E", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 8:
                finalPath.addToPath(new FieldInfo(7, "G", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 9:
                finalPath.addToPath(new FieldInfo(6, "B", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 10:
                finalPath.addToPath(new FieldInfo(6, "D", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;

            case 11:
                finalPath.addToPath(new FieldInfo(6, "F", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 12:
                finalPath.addToPath(new FieldInfo(6, "H", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 13:
                finalPath.addToPath(new FieldInfo(5, "A", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 14:
                finalPath.addToPath(new FieldInfo(5, "C", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 15:
                finalPath.addToPath(new FieldInfo(5, "E", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 16:
                finalPath.addToPath(new FieldInfo(5, "G", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;

            case 17:
                finalPath.addToPath(new FieldInfo(4, "B", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 18:
                finalPath.addToPath(new FieldInfo(4, "D", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 19:
                finalPath.addToPath(new FieldInfo(4, "F", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 20:
                finalPath.addToPath(new FieldInfo(4, "H", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 21:
                finalPath.addToPath(new FieldInfo(3, "A", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 22:
                finalPath.addToPath(new FieldInfo(3, "D", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;

            case 23:
                finalPath.addToPath(new FieldInfo(3, "E", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 24:
                finalPath.addToPath(new FieldInfo(3, "G", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 25:
                finalPath.addToPath(new FieldInfo(2, "B", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 26:
                finalPath.addToPath(new FieldInfo(2, "D", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 27:
                finalPath.addToPath(new FieldInfo(2, "F", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 28:
                finalPath.addToPath(new FieldInfo(2, "H", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;

            case 29:
                finalPath.addToPath(new FieldInfo(1, "A", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 30:
                finalPath.addToPath(new FieldInfo(1, "C", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 31:
                finalPath.addToPath(new FieldInfo(1, "E", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;
            case 32:
                finalPath.addToPath(new FieldInfo(1, "G", "Pawn", "bot", true));
                for (FieldInfo field : path.getList()) {
                    finalPath.addToPath(field);
                }
                break;

        }
        return finalPath;
    }
    public Path pathing(List<FieldInfo> list){
        List<FieldInfo> listRoute = list;
        Path bestRoute;
        Path path8B = movement8B(listRoute,new Path(),false);
        path8B.setPathNumber(1);
        Path path8D = movement8D(listRoute,new Path(),false);
        path8D.setPathNumber(2);
        Path path8F = movement8F(listRoute,new Path(),false);
        path8F.setPathNumber(3);
        Path path8H = movement8H(listRoute,new Path(),false);
        path8H.setPathNumber(4);

        Path path7A = movement7A(listRoute,new Path(),false);
        path7A.setPathNumber(5);
        Path path7C = movement7C(listRoute,new Path(),false);
        path7C.setPathNumber(6);
        Path path7E = movement7E(listRoute,new Path(),false);
        path7E.setPathNumber(7);
        Path path7G = movement7G(listRoute,new Path(),false);
        path7G.setPathNumber(8);

        Path path6B = movement6B(listRoute,new Path(),false);
        path6B.setPathNumber(9);
        Path path6D = movement6D(listRoute,new Path(),false);
        path6D.setPathNumber(10);
        Path path6F = movement6F(listRoute,new Path(),false);
        path6F.setPathNumber(11);
        Path path6H = movement6H(listRoute,new Path(),false);
        path6H.setPathNumber(12);

        Path path5A = movement5A(listRoute,new Path(),false);
        path5A.setPathNumber(13);
        Path path5C = movement5C(listRoute,new Path(),false);
        path5C.setPathNumber(14);
        Path path5E = movement5E(listRoute,new Path(),false);
        path5E.setPathNumber(15);
        Path path5G = movement5G(listRoute,new Path(),false);
        path5G.setPathNumber(16);

        Path path4B = movement4B(listRoute,new Path(),false);
        path4B.setPathNumber(17);
        Path path4D = movement4D(listRoute,new Path(),false);
        path4D.setPathNumber(18);
        Path path4F = movement4F(listRoute,new Path(),false);
        path4F.setPathNumber(19);
        Path path4H = movement4H(listRoute,new Path(),false);
        path4H.setPathNumber(20);

        Path path3A = movement3A(listRoute,new Path(),false);
        path3A.setPathNumber(21);
        Path path3C = movement3C(listRoute,new Path(),false);
        path3C.setPathNumber(22);
        Path path3E = movement3E(listRoute,new Path(),false);
        path3E.setPathNumber(23);
        Path path3G = movement3G(listRoute,new Path(),false);
        path3G.setPathNumber(24);

        Path path2B = movement2B(listRoute,new Path(),false);
        path2B.setPathNumber(25);
        Path path2D = movement2D(listRoute,new Path(),false);
        path2D.setPathNumber(26);
        Path path2F = movement2F(listRoute,new Path(),false);
        path2F.setPathNumber(27);
        Path path2H = movement2H(listRoute,new Path(),false);
        path2H.setPathNumber(28);

        Path path1A = movement1A(listRoute,new Path(),false);
        path1A.setPathNumber(29);
        Path path1C = movement1C(listRoute,new Path(),false);
        path1C.setPathNumber(30);
        Path path1E = movement1E(listRoute,new Path(),false);
        path1E.setPathNumber(31);
        Path path1G = movement1G(listRoute,new Path(),false);
        path1G.setPathNumber(32);

        List<Path> listPaths = new ArrayList<>();
        listPaths.add(path8B);
        listPaths.add(path8D);
        listPaths.add(path8F);
        listPaths.add(path8H);

        listPaths.add(path7A);
        listPaths.add(path7C);
        listPaths.add(path7E);
        listPaths.add(path7G);

        listPaths.add(path6B);
        listPaths.add(path6D);
        listPaths.add(path6F);
        listPaths.add(path6H);

        listPaths.add(path5A);
        listPaths.add(path5C);
        listPaths.add(path5E);
        listPaths.add(path5G);

        listPaths.add(path4B);
        listPaths.add(path4D);
        listPaths.add(path4F);
        listPaths.add(path4H);

        listPaths.add(path3A);
        listPaths.add(path3C);
        listPaths.add(path3E);
        listPaths.add(path3G);

        listPaths.add(path2B);
        listPaths.add(path2D);
        listPaths.add(path2F);
        listPaths.add(path2H);

        listPaths.add(path1A);
        listPaths.add(path1C);
        listPaths.add(path1E);
        listPaths.add(path1G);

        bestRoute = choosePath(listPaths);
        return bestRoute;
    }

    public Path choosePath(List<Path> listToFind){
        Path bestPath = listToFind.get(0);
        for (Path path : listToFind) {
         if(path.getList().size() >= bestPath.getList().size() && path.getValue() >= bestPath.getValue()){
             bestPath = path;
            }
        }
        return bestPath;
    }





    public Path movement8B(List<FieldInfo> loadedList, Path path , boolean attack){
    List<FieldInfo> list8B = loadedList;
        for (FieldInfo field : list8B) {
            if(field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 8 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list8B) {
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list8B) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 6){
                                path.addToPath(field1);
                              path.addToPath(field2);
                              path.addToValue(2);
                              list8B.remove(field1);
                              return movement6D(list8B, path,true);
                            }
                        }
                    }else if(!field1.isOccupation() && field1.getLetter().equals("A") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement8D(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list8D = loadedList;
        Path pathL = new Path();
        Path pathR = new Path();
        FieldInfo fieldL = new FieldInfo();
        FieldInfo fieldR = new FieldInfo();

        for (FieldInfo field : list8D) {
            if(field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 8 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list8D) {
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list8D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 6){
                                List<FieldInfo> list8DL = loadedList;
                                list8DL.remove(field2);
                                fieldL = field2;
                                pathL = movement6B(list8DL, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list8D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 6){
                                List<FieldInfo> list8DR = loadedList;
                                list8DR.remove(field2);
                                fieldR = field2;
                                pathR = movement6F(list8DR, path ,true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list8D.remove(fieldL);
                        return movement6B(list8D, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list8D.remove(fieldR);
                        return movement6F(list8D, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list8D.remove(fieldL);
                        return movement6B(list8D, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement8F(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list8F = loadedList;
        for (FieldInfo field : list8F) {
            if(field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 8 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list8F) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list8F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 6){
                                List<FieldInfo> list8FL = loadedList;
                                list8FL.remove(field2);
                                fieldL = field2;
                                pathL = movement6H(list8FL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list8F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 6) {
                                List<FieldInfo> list8FR = loadedList;
                                list8FR.remove(field2);
                                fieldR = field2;
                                pathR = movement6D(list8FR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list8F.remove(fieldL);
                        return movement6H(list8F, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list8F.remove(fieldR);
                        return movement6D(list8F, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list8F.remove(fieldL);
                        return movement6H(list8F, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement8H(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list8H = loadedList;
        for (FieldInfo field : list8H) {
            if(field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 8 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list8H) {
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list8H) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 6){
                                path.addToPath(field2);
                                path.addToValue(2);
                                list8H.remove(field2);
                                return movement6F(list8H, path , attack);
                            }
                        }
                    }else if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement7A(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list7A = loadedList;
        for (FieldInfo field : list7A) {
            if(field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 7 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list7A) {
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list7A) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 5){
                                path.addToPath(field2);
                                path.addToValue(2);
                                list7A.remove(field2);
                                return movement5C(list7A, path, true);
                            }
                        }
                    }else if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement7C(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list7C = loadedList;
        for (FieldInfo field : list7C) {
            if(field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 7 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list7C) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list7C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 5){
                                List<FieldInfo> list7CL = loadedList;
                                list7CL.remove(field2);
                                fieldL = field2;
                                pathL = movement5A(list7CL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list7C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 5) {
                                List<FieldInfo> list7CR = loadedList;
                                list7CR.remove(field2);
                                fieldR = field2;
                                pathR = movement5E(list7CR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list7C.remove(fieldL);
                        return movement5A(list7C, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list7C.remove(fieldR);
                        return movement5E(list7C, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list7C.remove(fieldL);
                        return movement5A(list7C, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 6 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement7E(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list7E = loadedList;
        for (FieldInfo field : list7E) {
            if(field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 7 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list7E) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list7E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 5){
                                List<FieldInfo> list7EL = loadedList;
                                list7EL.remove(field2);
                                fieldL = field2;
                                pathL = movement5C(list7EL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list7E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("G") && field2.getNumber() == 5) {
                                List<FieldInfo> list7ER = loadedList;
                                list7ER.remove(field2);
                                fieldR = field2;
                                pathR = movement5G(list7ER, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list7E.remove(fieldL);
                        return movement5C(list7E, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list7E.remove(fieldR);
                        return movement5G(list7E, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list7E.remove(fieldL);
                        return movement5C(list7E, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 6 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement7G(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list7G = loadedList;
        for (FieldInfo field : list7G) {
            if(field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 7 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list7G) {
                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list7G) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 5){
                                path.addToPath(field2);
                                path.addToValue(2);
                                list7G.remove(field2);
                                return movement5E(list7G, path, true);
                            }
                        }
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("H") && field1.getNumber() == 6 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement6B(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list6B = loadedList;
        for (FieldInfo field : list6B) {
            if(field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 6 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list6B) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6B) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 8){
                                List<FieldInfo> list6BL = loadedList;
                                list6BL.remove(field2);
                                fieldL = field2;
                                pathL = movement8D(list6BL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6B) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 4) {
                                List<FieldInfo> list6BR = loadedList;
                                list6BR.remove(field2);
                                fieldR = field2;
                                pathR = movement4D(list6BR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list6B.remove(fieldL);
                        return movement8D(list6B, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list6B.remove(fieldR);
                        return movement4D(list6B, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list6B.remove(fieldL);
                        return movement8D(list6B, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("A") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement6D(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list6D = loadedList;
        for (FieldInfo field : list6D) {
            if(field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 6 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list6D) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 8){
                                List<FieldInfo> list6DL1 = loadedList;
                                list6DL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement8B(list6DL1, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 8) {
                                List<FieldInfo> list6DR1 = loadedList;
                                list6DR1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement8F(list6DR1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 4){
                                List<FieldInfo> list6DL2 = loadedList;
                                list6DL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement4B(list6DL2, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 4) {
                                List<FieldInfo> list6DR2 = loadedList;
                                list6DR2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement4F(list6DR2, path, true);
                            }
                        }
                    }


                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list6D.remove(fieldL1);
                        return movement8B(list6D, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list6D.remove(fieldR1);
                        return movement4B(list6D, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list6D.remove(fieldL2);
                        return movement8F(list6D, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list6D.remove(fieldR2);
                        return movement4F(list6D, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement6F(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list6F = loadedList;
        for (FieldInfo field : list6F) {
            if(field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 6 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list6F) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 8){
                                List<FieldInfo> list6FL1 = loadedList;
                                list6FL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement8D(list6FL1, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 8) {
                                List<FieldInfo> list6FR1 = loadedList;
                                list6FR1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement8H(list6FR1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 4){
                                List<FieldInfo> list6FL2 = loadedList;
                                list6FL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement4D(list6FL2, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 4) {
                                List<FieldInfo> list6FR2 = loadedList;
                                list6FR2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement4H(list6FR2, path, true);
                            }
                        }
                    }


                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list6F.remove(fieldL1);
                        return movement8D(list6F, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list6F.remove(fieldR1);
                        return movement4D(list6F, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list6F.remove(fieldL2);
                        return movement8H(list6F, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list6F.remove(fieldR2);
                        return movement4H(list6F, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement6H(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list6H = loadedList;
        for (FieldInfo field : list6H) {
            if(field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 6 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list6H) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 7 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6H) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 8){
                                List<FieldInfo> list6HL = loadedList;
                                list6HL.remove(field2);
                                fieldL = field2;
                                pathL = movement8F(list6HL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list6H) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 4) {
                                List<FieldInfo> list6HR = loadedList;
                                list6HR.remove(field2);
                                fieldR = field2;
                                pathR = movement4F(list6HR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list6H.remove(fieldL);
                        return movement8F(list6H, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list6H.remove(fieldR);
                        return movement4F(list6H, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list6H.remove(fieldL);
                        return movement8F(list6H, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement5A(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list5A = loadedList;
        for (FieldInfo field : list5A) {
            if(field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 5 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list5A) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5A) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 7){
                                List<FieldInfo> list5AL = loadedList;
                                list5AL.remove(field2);
                                fieldL = field2;
                                pathL = movement7C(list5AL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5A) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 3) {
                                List<FieldInfo> list5AR = loadedList;
                                list5AR.remove(field2);
                                fieldR = field2;
                                pathR = movement3C(list5AR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list5A.remove(fieldL);
                        return movement7C(list5A, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list5A.remove(fieldR);
                        return movement3C(list5A, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list5A.remove(fieldL);
                        return movement7C(list5A, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement5C(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list5C = loadedList;
        for (FieldInfo field : list5C) {
            if(field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 5 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list5C) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 7){
                                List<FieldInfo> list5CL1 = loadedList;
                                list5CL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement7A(list5CL1, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 7) {
                                List<FieldInfo> list5CR1 = loadedList;
                                list5CR1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement7E(list5CR1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 3){
                                List<FieldInfo> list5CL2 = loadedList;
                                list5CL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement3A(list5CL2, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 3) {
                                List<FieldInfo> list5CR2 = loadedList;
                                list5CR2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement3E(list5CR2, path, true);
                            }
                        }
                    }


                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list5C.remove(fieldL1);
                        return movement7A(list5C, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list5C.remove(fieldR1);
                        return movement3A(list5C, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list5C.remove(fieldL2);
                        return movement7E(list5C, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list5C.remove(fieldR2);
                        return movement3E(list5C, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement5E(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list5E = loadedList;
        for (FieldInfo field : list5E) {
            if(field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 5 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list5E) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 7){
                                List<FieldInfo> list5EL1 = loadedList;
                                list5EL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement7A(list5EL1, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("G") && field2.getNumber() == 7) {
                                List<FieldInfo> list5ER1 = loadedList;
                                list5ER1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement7C(list5ER1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 3){
                                List<FieldInfo> list5EL2 = loadedList;
                                list5EL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement3C(list5EL2, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("G") && field2.getNumber() == 3) {
                                List<FieldInfo> list5ER2 = loadedList;
                                list5ER2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement3G(list5ER2, path, true);
                            }
                        }
                    }


                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list5E.remove(fieldL1);
                        return movement7C(list5E, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list5E.remove(fieldR1);
                        return movement3C(list5E, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list5E.remove(fieldL2);
                        return movement7G(list5E, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list5E.remove(fieldR2);
                        return movement3G(list5E, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement5G(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list5G = loadedList;
        for (FieldInfo field : list5G) {
            if(field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 5 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list5G) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 6 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5G) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 7){
                                List<FieldInfo> list5GL = loadedList;
                                list5GL.remove(field2);
                                fieldL = field2;
                                pathL = movement7E(list5GL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list5G) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 3) {
                                List<FieldInfo> list5GR = loadedList;
                                list5GR.remove(field2);
                                fieldR = field2;
                                pathR = movement3E(list5GR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list5G.remove(fieldL);
                        return movement7E(list5G, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list5G.remove(fieldR);
                        return movement3E(list5G, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list5G.remove(fieldL);
                        return movement7E(list5G, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("H") && field1.getNumber() == 4 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement4H(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list4H = loadedList;
        for (FieldInfo field : list4H) {
            if(field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 4 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list4H) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4H) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 6){
                                List<FieldInfo> list4HL = loadedList;
                                list4HL.remove(field2);
                                fieldL = field2;
                                pathL = movement6F(list4HL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4H) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 2) {
                                List<FieldInfo> list4HR = loadedList;
                                list4HR.remove(field2);
                                fieldR = field2;
                                pathR = movement2F(list4HR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list4H.remove(fieldL);
                        return movement6F(list4H, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list4H.remove(fieldR);
                        return movement2F(list4H, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list4H.remove(fieldL);
                        return movement6F(list4H, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement4F(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list4F = loadedList;
        for (FieldInfo field : list4F) {
            if(field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 4 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list4F) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 6){
                                List<FieldInfo> list4FL1 = loadedList;
                                list4FL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement6D(list4FL1, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 6) {
                                List<FieldInfo> list4FR1 = loadedList;
                                list4FR1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement6H(list4FR1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 2){
                                List<FieldInfo> list4FL2 = loadedList;
                                list4FL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement2D(list4FL2, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 2) {
                                List<FieldInfo> list4FR2 = loadedList;
                                list4FR2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement2H(list4FR2, path, true);
                            }
                        }
                    }
                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list4F.remove(fieldL1);
                        return movement6D(list4F, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list4F.remove(fieldR1);
                        return movement2D(list4F, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list4F.remove(fieldL2);
                        return movement6H(list4F, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list4F.remove(fieldR2);
                        return movement2H(list4F, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement4D(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list4D = loadedList;
        for (FieldInfo field : list4D) {
            if(field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 4 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list4D) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 6){
                                List<FieldInfo> list4DL1 = loadedList;
                                list4DL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement6B(list4DL1, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 6) {
                                List<FieldInfo> list4DR1 = loadedList;
                                list4DR1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement6F(list4DR1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 2){
                                List<FieldInfo> list4DL2 = loadedList;
                                list4DL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement2B(list4DL2, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 2) {
                                List<FieldInfo> list4DR2 = loadedList;
                                list4DR2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement2F(list4DR2, path, true);
                            }
                        }
                    }
                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list4D.remove(fieldL1);
                        return movement6B(list4D, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list4D.remove(fieldR1);
                        return movement2B(list4D, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list4D.remove(fieldL2);
                        return movement6F(list4D, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list4D.remove(fieldR2);
                        return movement2F(list4D, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement4B(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list4B = loadedList;
        for (FieldInfo field : list4B) {
            if(field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 4 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list4B) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 5 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4B) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 6){
                                List<FieldInfo> list4BL = loadedList;
                                list4BL.remove(field2);
                                fieldL = field2;
                                pathL = movement6D(list4BL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list4B) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 2) {
                                List<FieldInfo> list4BR = loadedList;
                                list4BR.remove(field2);
                                fieldR = field2;
                                pathR = movement2D(list4BR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list4B.remove(fieldL);
                        return movement6D(list4B, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list4B.remove(fieldR);
                        return movement2D(list4B, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list4B.remove(fieldL);
                        return movement6D(list4B, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("A") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement3A(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list3A = loadedList;
        for (FieldInfo field : list3A) {
            if(field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 3 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list3A) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3A) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 5){
                                List<FieldInfo> list3AL = loadedList;
                                list3AL.remove(field2);
                                fieldL = field2;
                                pathL = movement5C(list3AL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3A) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 1) {
                                List<FieldInfo> list3AR = loadedList;
                                list3AR.remove(field2);
                                fieldR = field2;
                                pathR = movement1C(list3AR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list3A.remove(fieldL);
                        return movement5C(list3A, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list3A.remove(fieldR);
                        return movement1C(list3A, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list3A.remove(fieldL);
                        return movement5C(list3A, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement3C(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list3C = loadedList;
        for (FieldInfo field : list3C) {
            if(field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 3 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list3C) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 5){
                                List<FieldInfo> list3CL1 = loadedList;
                                list3CL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement5A(list3CL1, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 5) {
                                List<FieldInfo> list3CR1 = loadedList;
                                list3CR1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement5E(list3CR1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 1){
                                List<FieldInfo> list3CL2 = loadedList;
                                list3CL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement1A(list3CL2, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 1) {
                                List<FieldInfo> list3CR2 = loadedList;
                                list3CR2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement1E(list3CR2, path, true);
                            }
                        }
                    }
                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list3C.remove(fieldL1);
                        return movement5A(list3C, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list3C.remove(fieldR1);
                        return movement1A(list3C, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list3C.remove(fieldL2);
                        return movement5E(list3C, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list3C.remove(fieldR2);
                        return movement1E(list3C, path ,true);

                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement3E(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list3E = loadedList;
        for (FieldInfo field : list3E) {
            if(field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 3 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list3E) {
                    Path pathL1 = new Path();
                    Path pathR1 = new Path();
                    Path pathL2 = new Path();
                    Path pathR2 = new Path();
                    FieldInfo fieldL1 = new FieldInfo();
                    FieldInfo fieldR1 = new FieldInfo();
                    FieldInfo fieldL2 = new FieldInfo();
                    FieldInfo fieldR2 = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 5){
                                List<FieldInfo> list3EL1 = loadedList;
                                list3EL1.remove(field2);
                                fieldL1 = field2;
                                pathL1 = movement5C(list3EL1, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("G") && field2.getNumber() == 5) {
                                List<FieldInfo> list3ER1 = loadedList;
                                list3ER1.remove(field2);
                                fieldR1 = field2;
                                pathR1 = movement5G(list3ER1, path, true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 1){
                                List<FieldInfo> list3EL2 = loadedList;
                                list3EL2.remove(field2);
                                fieldL2 = field2;
                                pathL2 = movement1C(list3EL2, path ,true);
                            }
                        }
                    }
                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("G") && field2.getNumber() == 1) {
                                List<FieldInfo> list3ER2 = loadedList;
                                list3ER2.remove(field2);
                                fieldR2 = field2;
                                pathR2 = movement1G(list3ER2, path, true);
                            }
                        }
                    }
                    if(pathL1.getList().size() >= pathR1.getList().size() && pathL1.getList().size() >= pathL2.getList().size() && pathL1.getList().size() >= pathR2.getList().size() && pathL1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL1);
                        list3E.remove(fieldL1);
                        return movement5C(list3E, path ,true);
                    }else if(pathL2.getList().size() >= pathR1.getList().size() && pathL2.getList().size() >= pathL1.getList().size() && pathL2.getList().size() >= pathR2.getList().size() && pathL2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR1);
                        list3E.remove(fieldR1);
                        return movement1C(list3E, path ,true);
                    }else if(pathR1.getList().size() >= pathL1.getList().size() && pathR1.getList().size() >= pathL2.getList().size() && pathR1.getList().size() >= pathR2.getList().size() && pathR1.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL2);
                        list3E.remove(fieldL2);
                        return movement5G(list3E, path ,true);
                    }else if(pathR2.getList().size() >= pathR1.getList().size() && pathR2.getList().size() >= pathL2.getList().size() && pathR2.getList().size() >= pathL1.getList().size() && pathR2.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldR2);
                        list3E.remove(fieldR2);
                        return movement1G(list3E, path ,true);
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement3G(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list3G = loadedList;
        for (FieldInfo field : list3G) {
            if(field.isOccupation() && field.getLetter().equals("G") && field.getNumber() == 3 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list3G) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 4 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3G) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 5){
                                List<FieldInfo> list3GL = loadedList;
                                list3GL.remove(field2);
                                fieldL = field2;
                                pathL = movement5E(list3GL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list3G) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 1) {
                                List<FieldInfo> list3GR = loadedList;
                                list3GR.remove(field2);
                                fieldR = field2;
                                pathR = movement1E(list3GR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list3G.remove(fieldL);
                        return movement5E(list3G, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list3G.remove(fieldR);
                        return movement1E(list3G, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list3G.remove(fieldL);
                        return movement5E(list3G, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("H") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement2H(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list2H = loadedList;
        for (FieldInfo field : list2H) {
            if(field.isOccupation() && field.getLetter().equals("H") && field.getNumber() == 2 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list2H) {
                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list2H) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 4){
                                List<FieldInfo> list2HL = loadedList;
                                list2H.remove(field2);
                                return movement4F(list2H, path ,true);
                            }
                        }
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }

                }
            }
        }
        return path;
    }
    public Path movement2F(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list2F = loadedList;
        for (FieldInfo field : list2F) {
            if(field.isOccupation() && field.getLetter().equals("F") && field.getNumber() == 2 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list2F) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list2F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 4){
                                List<FieldInfo> list2FL = loadedList;
                                list2FL.remove(field2);
                                fieldL = field2;
                                pathL = movement4D(list2FL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list2F) {
                            if(!field2.isOccupation() && field2.getLetter().equals("H") && field2.getNumber() == 4) {
                                List<FieldInfo> list2FR = loadedList;
                                list2FR.remove(field2);
                                fieldR = field2;
                                pathR = movement4H(list2FR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list2F.remove(fieldL);
                        return movement4D(list2F, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list2F.remove(fieldR);
                        return movement4H(list2F, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list2F.remove(fieldL);
                        return movement4D(list2F, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement2D(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list2D = loadedList;
        for (FieldInfo field : list2D) {
            if(field.isOccupation() && field.getLetter().equals("D") && field.getNumber() == 2 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list2D) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list2D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("B") && field2.getNumber() == 4){
                                List<FieldInfo> list2DL = loadedList;
                                list2DL.remove(field2);
                                fieldL = field2;
                                pathL = movement4B(list2DL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list2D) {
                            if(!field2.isOccupation() && field2.getLetter().equals("F") && field2.getNumber() == 4) {
                                List<FieldInfo> list2DR = loadedList;
                                list2DR.remove(field2);
                                fieldR = field2;
                                pathR = movement4F(list2DR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list2D.remove(fieldL);
                        return movement4B(list2D, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list2D.remove(fieldR);
                        return movement4F(list2D, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list2D.remove(fieldL);
                        return movement4B(list2D, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("G") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement2B(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list2B = loadedList;
        for (FieldInfo field : list2B) {
            if(field.isOccupation() && field.getLetter().equals("B") && field.getNumber() == 2 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list2B) {
                    if(field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 3 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list2B) {
                            if(!field2.isOccupation() && field2.getLetter().equals("D") && field2.getNumber() == 4){
                                List<FieldInfo> list2BL = loadedList;
                                list2BL.remove(field2);
                                return movement4D(list2BL, path ,true);
                            }
                        }
                    }


                    if(!field1.isOccupation() && field1.getLetter().equals("A") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("C") && field1.getNumber() == 1 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement1A(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list1A = loadedList;
        for (FieldInfo field : list1A) {
            if(field.isOccupation() && field.getLetter().equals("A") && field.getNumber() == 1 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list1A) {
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list1A) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 3){
                                List<FieldInfo> list1AL = loadedList;
                                list1AL.remove(field2);
                                return  movement4D(list1AL, path ,true);
                            }
                        }
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement1C(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list1C = loadedList;
        for (FieldInfo field : list1C) {
            if(field.isOccupation() && field.getLetter().equals("C") && field.getNumber() == 1 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list1C) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list1C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("A") && field2.getNumber() == 3){
                                List<FieldInfo> list1CL = loadedList;
                                list1CL.remove(field2);
                                fieldL = field2;
                                pathL = movement3A(list1CL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list1C) {
                            if(!field2.isOccupation() && field2.getLetter().equals("E") && field2.getNumber() == 3) {
                                List<FieldInfo> list1CR = loadedList;
                                list1CR.remove(field2);
                                fieldR = field2;
                                pathR = movement3E(list1CR, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list1C.remove(fieldL);
                        return movement3A(list1C, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list1C.remove(fieldR);
                        return movement3E(list1C, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list1C.remove(fieldL);
                        return movement3A(list1C, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("B") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("E") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }

    public Path movement1E(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list1E = loadedList;
        for (FieldInfo field : list1E) {
            if(field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 1 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list1E) {
                    Path pathL = new Path();
                    Path pathR = new Path();
                    FieldInfo fieldL = new FieldInfo();
                    FieldInfo fieldR = new FieldInfo();
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list1E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 3){
                                List<FieldInfo> list1EL = loadedList;
                                list1EL.remove(field2);
                                fieldL = field2;
                                pathL = movement3C(list1EL, path ,true);
                            }
                        }
                    }

                    if(field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list1E) {
                            if(!field2.isOccupation() && field2.getLetter().equals("G") && field2.getNumber() == 3) {
                                List<FieldInfo> list1ER = loadedList;
                                list1ER.remove(field2);
                                fieldR = field2;
                                pathR = movement3G(list1ER, path, true);
                            }
                        }
                    }
                    if(pathL.getList().size() > pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list1E.remove(fieldL);
                        return movement3C(list1E, path ,true);
                    }else if(pathL.getList().size() < pathR.getList().size()){
                        path.addToValue(2);
                        path.addToPath(fieldR);
                        list1E.remove(fieldR);
                        return movement3G(list1E, path ,true);
                    }else if(pathL.getList().size() == pathR.getList().size() && pathL.getList().size() != 0){
                        path.addToValue(2);
                        path.addToPath(fieldL);
                        list1E.remove(fieldL);
                        return movement3C(list1E, path ,true);
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
    public Path movement1G(List<FieldInfo> loadedList, Path path, boolean attack){
        List<FieldInfo> list1G = loadedList;
        for (FieldInfo field : list1G) {
            if(field.isOccupation() && field.getLetter().equals("E") && field.getNumber() == 1 && field.getMembership().equals("bot")){
                for (FieldInfo field1 : list1G) {
                    if(field1.isOccupation() && field1.getLetter().equals("D") && field1.getNumber() == 2 && field1.getMembership().equals("player")){
                        for (FieldInfo field2 : list1G) {
                            if(!field2.isOccupation() && field2.getLetter().equals("C") && field2.getNumber() == 3){
                                list1G.remove(field2);
                                return movement3C(list1G, path ,true);

                            }
                        }
                    }

                    if(!field1.isOccupation() && field1.getLetter().equals("H") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                    if(!field1.isOccupation() && field1.getLetter().equals("F") && field1.getNumber() == 2 && !attack){
                        path.addToPath(field1);
                        path.addToValue(1);
                        return path;
                    }
                }
            }
        }
        return path;
    }
}
