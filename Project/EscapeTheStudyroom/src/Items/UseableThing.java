package Items;

public class UseableThing extends Thing {

    String _use_msg = "Nothing happened...";

    public UseableThing(String arg1, String arg2){ //arg1 = desription, arg2 = use_msg
        super._description = arg1;
        _use_msg = arg2;
    }

    public UseableThing(){

    }

    public String use(){
        return _use_msg;
    }
}
