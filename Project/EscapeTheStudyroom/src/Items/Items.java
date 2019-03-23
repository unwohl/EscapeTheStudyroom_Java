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

    public static void addItem(Thing thing){
        itemlist.add(thing);
    }
}
