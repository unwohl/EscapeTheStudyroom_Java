package Control;

import Items.*;
import Items.Itemlist.InventoryItem;
import Rooms.Room;

public class Game {

    public static GamePanel Panel = new GamePanel();

    public static void main(String [] args){
        Room.initializeStartRoom();
        InventoryItem inv = new InventoryItem();
    }


    private void initializeitems(){

    }

}