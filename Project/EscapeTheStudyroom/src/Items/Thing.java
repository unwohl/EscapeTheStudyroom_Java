package Items;

public class Thing {
    public static int ThingCount = 0;
    public static Items items = new Items();
    public static Inventory inventory = new Inventory();
    static String _abort = "You cannot combine this.";

    boolean _useable = false;
    boolean _takeable = false;
    boolean _combineable = false;

    String _description;
    String _name;
    String _use_msg;
    String _take_msg;
    String _combine_msg;

    int _ID;
    int _combineID;

    public Thing(){
        ThingCount++;
        this._ID = ThingCount;
        items.addItem(this);
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
            inventory.addToInventory(this);
            return this._take_msg;
        }
        return null;
    }

    public String use(){ //returns the message that is sent whenever the player uses the Item.
        if(this._useable){
            return this._use_msg;
        }
        return null;
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

    public void setType(String type){
        switch(type){
            case "combineable":
                this._combineable = true;
                break;
            case "takeable":
                this._takeable = true;
                break;
            case "useable":
                this._useable = true;
                break;
            case "combinetake":
                this._takeable = true;
                this._combineable = true;
            default:
                break;
        }
    }
}
