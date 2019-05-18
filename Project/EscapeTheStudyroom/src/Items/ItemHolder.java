package Items;

import java.util.ArrayList;
import java.util.List;

public class ItemHolder {

    private static ItemHolder instance = new ItemHolder();

    public static ItemHolder getInstance() {

        return instance;
    }

    public List<Thing> itemlist = new ArrayList<Thing>();

    /**
     * Gets you the name of an object.
     * @param ID the ID of the object you want the name for.
     * @return Returns the Name of the Object as a String. Returns an empty String if there is no object with the ID.
     */
    public String getNameFromID(int ID){
        for (Thing thing:itemlist) {
            if(ID == thing.getID()){
                return thing.getName();

            }
        }
        return "";
    }

    /**
     * Gets you the ID of an object using the name.
     * @param name The Name of the Object you want the ID of.
     * @return Returns the Id of the Object as an Int.
     */
    public int getIdFromName(String name){
        for (Thing thing : itemlist){
            if(thing.getName().equals(name)){
                return thing.getID();
            }
        }
        return 0;
    }

    /**
     * gets you the THING from a name.
     * @param name The name of the Thing you want.
     * @return Returns a THING that has the name you entered.
     */
    public Thing getThingFromName(String name){
        for(Thing thing : itemlist){
            if(thing.getName().equals(name)){
                return thing;
            }
        }
        return null;
    }

    /**
     * Checks if a THING exists.
     * @param thing The THING you want to verify.
     * @return Returns True when your THING exists.
     */
    public boolean itemExists(Thing thing){
        if(itemlist.contains(thing)){
            return true;
        }
        return false;
    }

    /**
     * Checks if a Thing with a certain NAME exists.
     * @param itemName the name of the Thing you want to verify.
     * @return Returns True if there is a Thing with the NAME.
     */
    public boolean itemExists(String itemName){
        for(Thing thing : itemlist){
            if(thing.getName().equals(itemName)){
                return true;
            }
        }
        return false;
    }

    /**
     * Adds an Item to the General itemlist.
     * @param thing the THING you want to add.
     */
    public void addItem(Thing thing){
        itemlist.add(thing);
    }
}
