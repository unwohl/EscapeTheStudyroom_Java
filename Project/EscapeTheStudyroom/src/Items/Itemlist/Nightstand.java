package Items.Itemlist;

import Items.ItemHolder;
import Items.Thing;

public class Nightstand extends Thing {

    public Nightstand(){
        this._ID = 1;
        this._combineable = true;
        this._useable = true;
        this._use_msg = "";
        this._description = "Figger";
        this._combine_msg = "";
        this._name = "nightstand";
        this._combineID = 2;
        ItemHolder.getInstance().addItem(this);
    }

}
