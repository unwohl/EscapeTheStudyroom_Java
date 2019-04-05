import Parser.*;
import Items.*;

import java.util.Scanner;

public class Game {

    private static Items items = new Items();

    public static void main(String [] args){
        addTestItems();
        ItemInitializer.init();
        examineAll();
        useAll();
        takeAll();
        Scanner scannerInsert = new Scanner(System.in);
        String insert = scannerInsert.next();
        System.out.println(insert);
        scannerInsert.close();
    }

    public static void addTestItems(){

    }

    public static void examineAll(){
        for(Thing thing : Items.itemlist){
            System.out.println(thing.examine());
        }
    }

    public static void useAll(){
        for(Thing thing : Items.itemlist){
            System.out.println(thing.use());
        }
    }

    public static void takeAll(){
        for(Thing thing : Items.itemlist){
            System.out.println(thing.take());
        }
        for(Thing thing : Inventory.inventory){
            System.out.println(thing._name);
        }
    }
}