import Parser.*;
import Items.*;

import java.util.Scanner;

public class Game {

    private static Items items = new Items();

    public static void main(String [] args){
        addTestItems();
        Scanner scannerInsert = new Scanner(System.in);
        String insert = scannerInsert.next();
        System.out.println(insert);
        scannerInsert.close();
    }

    public static void addTestItems(){
        Thing Desk = new Thing();
        Desk.setName("Desk");
        Thing Wall = new Thing();
        Wall.setName("Wall");
        Thing Key = new Thing();
        Key.setName("Shelf_Key");
    }
}