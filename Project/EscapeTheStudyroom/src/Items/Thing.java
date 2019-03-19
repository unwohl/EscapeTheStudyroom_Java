package Items;

public class Thing {
    public static int ThingCount = 0;

    String _description = "No description available...";
    int _ID = 0;

    public Thing(String arg1){ //arg1 = description
        _description = arg1;
        ThingCount++;
        _ID = ThingCount;
    }

    public Thing(){
        ThingCount++;
        _ID = ThingCount;
    }

    public String examine(){
        return _description;
    }

    public int getID(){
        return _ID;
    }
}
