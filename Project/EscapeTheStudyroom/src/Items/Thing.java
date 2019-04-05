package Items;

public class Thing {
    public static int ThingCount = 0;
    public static Items items = new Items();
    public static Inventory inventory = new Inventory();
    static String _abort = "You can't do that...";

    public boolean _useable = false;
    public boolean _takeable = false;
    public boolean _combineable = false;

    public String _description;
    public String _name;
    public String _use_msg;
    public String _take_msg;
    public String _combine_msg;

    public int _ID;
    public int _combineID;

    public Thing(){
        ThingCount++;
        this._ID = ThingCount;
        items.addItem(this);
    }

    public Thing(String name){
        ThingCount++;
        this._ID = ThingCount;
        items.addItem(this);
        this.setName(name);
    }

    public String examine(){ //returns the description of the inspected Item.
        return this._description;
    }

    public int getID(){ //returns the ID of the Item.
        return this._ID;
    }

    public void setName(String arg){
        this._name = arg;
    }

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

    public String use(){ //returns the message that is sent whenever the player uses the Item.
        if(this._useable){
            return this._use_msg;
        }
        return _abort;
    }

    public void combine(int ID){
        if(this._combineable) {
            if (ID == this._combineID && inventory.itemInInventory(ID)) {
                System.out.println("you combined " + this._name + " with " + items.getNameFromID(ID));
                inventory.removeFromInventorybyID(ID);
            } else if (ID == this._combineID) {
                System.out.print("You do not have the required item in your inventory...");
            } else {
                System.out.println(_abort);
            }
        }
    }
}
