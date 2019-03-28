import Parser.*;
import Items.*;

public class Game {

    private static Items items = new Items();

    public static void main(String [] args){
        GameParser a = new GameParser("HAaaaaa");
        a.parse();
        addTestItems();
        ItemInitializer.init();
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
