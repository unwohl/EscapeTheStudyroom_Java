import Parser.*;
import Items.*;

public class Game {

    private static Items items = new Items();

    public static void main(String [] args){
        GameParser a = new GameParser("HAaaaaa");
        a.parse();
        addTestItems();
    }

    public static void addTestItems(){
        Thing Desk = new Thing("This is a wooden desk.");
        Thing Wall = new Thing("You are looking at a wall... good job!");
    }
}
