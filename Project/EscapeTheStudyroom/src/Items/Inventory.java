package Items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<TakeableThing> inventory = new ArrayList<TakeableThing>();

    public Inventory(){

    }

    public void addToInventory(TakeableThing thing){
        inventory.add(thing);
    }

    public boolean itemInInventory(int ID){
        for (TakeableThing thing : inventory) {
            if(thing._ID == ID){
                return true;
            }
        }
        return false;
    }
}
