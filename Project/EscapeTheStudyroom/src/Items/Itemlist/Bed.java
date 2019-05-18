package Items.Itemlist;

import Items.ItemHolder;
import Items.Thing;
import Items.Thing.*;

public class Bed extends Thing {

    public Bed() {
        this._ID = 90000;
        this._description = "Irgend was rein?";
        this._name = "bed";
        ItemHolder.getInstance().addItem( this );
    }

}
