package Items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory instance = new Inventory();

    public static Inventory getInstance(){
        return instance;
    }

    private static List<Thing> inventory = new ArrayList<Thing>();

    public List<Thing> getInventory(){
        return inventory;
    }

    /**
     * Adds an Item to the Inventory of the player.
     * @param thing The Thing you want to add to the Inventory of the Player.
     */
    public void addToInventory(Thing thing){
        inventory.add(thing);
    }

    /**
     * Removes an Item with the ID from the Inventory of the Player.
     * @param ID the ID of the Object you want to remove from the Inventory.
     */
    public void removeFromInventory( int ID){
        for (Thing thing : inventory) {
            if(thing._ID == ID){
                inventory.remove(thing);
            }
        }
    }

    /**
     * Checks if an Item with your ID is in the Inventory of the Player.
     * @param ID The ID of the Item you want to verify.
     * @return Returns TRUE if the item is in the Inventory of the Player.
     */
    public boolean itemInInventory(int ID){
        for (Thing thing : inventory) {
            if(thing._ID == ID){
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a THING is in the Inventory of the Player.
     * @param thing the THING you want to verify.
     * @return returns TRUE if the THING is in the Inventory of the Player.
     */
    public boolean itemInInventory(Thing thing){
        if(inventory.contains(thing)){
            return true;
        }else{
            return false;
        }
    }
}
