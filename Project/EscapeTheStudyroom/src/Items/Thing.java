package Items;

import Control.Game;

public class Thing implements IThing {
    public static Inventory inventory = new Inventory();
    static String _abort = "You can't do that...";

    public boolean _useable = false;
    public boolean _takeable = false;
    public boolean _combineable = false;

    private String _description;
    private String _name;
    public String _use_msg;
    public String _take_msg;
    public String _combine_msg;

    public int _ID;
    public int _combineID;

    public Thing(){
        ItemHolder.getInstance().addItem(this);
    }

    public Thing(String name){
        ItemHolder.getInstance().addItem(this);
        this._name = name;
    }

    public void init(){

    }

    // -------------- Get-Methods --------------

    public String get_name() {
        return _name;
    }

    public int get_ID() {
        return _ID;
    }

    public String get_description() {
        return _description;
    }


    /**
     * Examine:
     * @return Returns the description of the Object.
     */
    public String examine(){ //returns the description of the inspected Item.
        return this._description;
    }

    /**
     * Gets you the ID
     * @return Returns the ID of the Object as an int.
     */
    public int getID(){ //returns the ID of the Item.
        return this._ID;
    }

    /**
     * REEEEEE
     * 
     * @return
     */
    public String getName() {

        return _name;
    }

    /**
     * Take:
     * Adds the Object to The inventory of the player.
     * @return Returns the Message of an Object that should be displayed when its being taken.
     */
    public String take(){
        if(this._takeable) {
            if(!inventory.itemInInventory(this)) {
                inventory.addToInventory(this);
                return this._take_msg;
            }else{
                return "This item is already in your inventory!";
            }
        }
        return _abort;
    }

    /**
     * Use:
     * @return Returns the message that should be displayed when an object is being used.
     */
    public String use(){ //returns the message that is sent whenever the player uses the Item.
        if(this._useable){
            return this._use_msg;
        }
        return _abort;
    }

    /**
     * Comnbine:
     * Prints the outcome of the combination of 2 objects. removes the item from the inventory if combination successful.
     * @param ID The Id of the object you want to combine this object with. The Item with the ID has to be in the players Inventory.
     */
    public void combine(int ID){
        if(this._combineable) {
            if (ID == this._combineID && inventory.itemInInventory(ID)) {
                Game.Panel.setLabelText("you combined " + this._name + " with " + ItemHolder.getInstance().getNameFromID(ID));
                inventory.removeFromInventorybyID(ID);
            } else if (ID == this._combineID) {
                Game.Panel.setLabelText("You do not have the required item in your inventory...");
            } else {
                Game.Panel.setLabelText(_abort);
            }
        }
    }
}
