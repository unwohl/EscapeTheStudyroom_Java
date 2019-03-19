package Items;

import java.awt.*;

public class TakeableThing extends UseableThing {

    Inventory inventory = new Inventory();
    String take_msg = "You have taken this Item...";

    public TakeableThing(String arg1, String arg2, String arg3){//arg1 = description, arg2 = use_msg, arg3 = take_msg
        if(arg2 == ""){
            this._use_msg = "Nothing happened...";
        }else{
            this._use_msg = arg2;
        }
        this._description = arg1;
        this.take_msg = arg3;
    }

    public TakeableThing(){
        this._use_msg = "Nothing happened...";
    }

    public void take(){
        inventory.addToInventory(this);
        System.out.println(take_msg);
    }
}
