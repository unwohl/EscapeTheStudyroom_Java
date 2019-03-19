package Items;

public class Thing {
    public static int ThingCount = 0;

    String _description = "No description available...";
    String _name = "Unknown Item";
    int _ID = 0;
    Items items = new Items();

    public Thing(String arg1){ //arg1 = description
        this._description = arg1;
        ThingCount++;
        this._ID = ThingCount;
        items.addItem(this);
    }

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

}
