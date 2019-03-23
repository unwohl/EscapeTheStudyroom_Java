package Items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static List<Thing> inventory = new ArrayList<Thing>();

    public Inventory(){

    }

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
}
