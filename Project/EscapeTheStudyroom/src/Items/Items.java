package Items;

import java.util.ArrayList;
import java.util.List;

public class Items {
    public static List<Thing> itemlist = new ArrayList<Thing>();

    public String getNameFromID(int ID){
        for (Thing thing:itemlist) {
            if(ID == thing.getID()){
                return thing._name;
            }
        }
        return "";
    }

    public Thing getThingFromName(String name){
        
    }

    public static boolean itemExists(Thing thing){
        if(itemlist.contains(thing)){
            return true;
        }
        return false;
    }

    public static boolean itemExists(String itemName){
        for(Thing thing : itemlist){
            if(thing._name == itemName){
                return true;
            }
        }
        return false;
    }

    public static void addItem(Thing thing){
        itemlist.add(thing);
    }
}
