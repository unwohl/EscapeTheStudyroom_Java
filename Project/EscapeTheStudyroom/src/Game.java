//import Parser.*;
import java.util.Scanner;

public class Game {

    private static Items items = new Items();

    public static void main(String [] args){
        Scanner scannerInsert = new Scanner(System.in);
        String insert = scannerInsert.next();
        System.out.println(insert);
        scannerInsert.close();
    }
}