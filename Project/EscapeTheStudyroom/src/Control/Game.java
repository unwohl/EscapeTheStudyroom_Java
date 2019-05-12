package Control;

import Items.*;

public class Game {

    public static GamePanel Panel = new GamePanel();

    public static void main(String [] args){
        Room.initializeStartRoom();
        ItemInitializer ii = new ItemInitializer();
        ii.init();
    }



}