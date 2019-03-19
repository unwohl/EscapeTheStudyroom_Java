package Items;

public class TakeableThing extends UseableThing {

    String take_msg = "You have taken this Item...";

    public TakeableThing(String arg1, String arg2, String arg3){//arg1 = description, arg2 = use_msg, arg3 = take_msg
        if(arg2 == ""){
            super._use_msg = "Nothing happened...";
        }else{
            super._use_msg = arg2;
        }
        super._description = arg1;
        take_msg = arg3;
    }

    public TakeableThing(){
        super._use_msg = "Nothing happened...";
    }

    public String take(){
        return take_msg;
    }
}
