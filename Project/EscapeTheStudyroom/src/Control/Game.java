package Control;

import Items.*;
import Rooms.Room;

public class Game {

    public static GamePanel Panel = new GamePanel();

    public static void main(String [] args){
        Room.initializeStartRoom();
        ItemInitializer ii = new ItemInitializer();
        ii.init();
    }


    private void initializeitems(){

    }

}