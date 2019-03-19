package Items;

public class UseableThing extends Thing {

    String _use_msg = "Nothing happened...";

    public UseableThing(String arg1, String arg2){ //arg1 = desription, arg2 = use_msg
        this._description = arg1;
        this._use_msg = arg2;
    }

    public UseableThing(){ //empty constructor

    }

    public String use(){ //returns the message that is sent whenever the player uses the Item.
        return _use_msg;
    }
}
