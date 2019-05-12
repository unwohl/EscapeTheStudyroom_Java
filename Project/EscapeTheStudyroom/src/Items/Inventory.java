package Items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static List<Thing> inventory = new ArrayList<Thing>();

    public Inventory(){

    }

    /**
     * Adds an Item to the Inventory of the player.
     * @param thing The Thing you want to add to the Inventory of the Player.
     */
    public void addToInventory(Thing thing){
        inventory.add(thing);
    }

    public void removeFromInventorybyID(int ID){
        for (Thing thing : inventory) {
            if(thing._ID == ID){
                inventory.remove(thing);
            }
        }
    }

    public boolean itemInInventory(int ID){
        for (Thing thing : inventory) {
            if(thing._ID == ID){
                return true;
            }
        }
        return false;
    }

    public boolean itemInInventory(Thing thing){
        if(inventory.contains(thing)){
            return true;
        }else{
            return false;
        }
    }
}
