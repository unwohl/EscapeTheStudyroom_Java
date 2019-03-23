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
        Thing Desk = new Thing();
        Thing Wall = new Thing();
    }
}
