package Items;

public class Thing {
    public static int ThingCount = 0;
    public static Items items = new Items();
    public static Inventory inventory = new Inventory();

    boolean _takeable = false;
    boolean _useable = false;
    boolean _combineable = false;

    String _description;
    String _name;
    String _use_msg;
    String _take_msg;
    String _combine_msg;

    int _ID;

    public Thing(){
        ThingCount++;
        this._ID = ThingCount;
        items.addItem(this);
    }

    public String examine(){ //returns the description of the inspected Item.
        return _description;
    }

    public int getID(){ //returns the ID of the Item.
        return _ID;
    }

    public void setName(String arg){
        this._name = arg;
    }

    public void take(){
        inventory.addToInventory(this);
        System.out.println(_take_msg);
    }
}
