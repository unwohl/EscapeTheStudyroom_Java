package Items.Itemlist;

import Control.Game;
import Items.Inventory;
import Items.ItemHolder;
import Items.Thing;

public class Nightstand_Key extends Thing {

    public Nightstand_Key(){
        this._ID = 2;
        this._combineable = true;
        this._take_msg = "You took the key.";
        this._takeable = true;
        this._description = "This seems to be the key to the nightstand...";
        this._combine_msg = "You opened the drawer with the key...";
        this._name = "nightstandkey";
        this._combineID = 1;
        ItemHolder.getInstance().addItem(this);
    }

    @Override
    public void combine(int ID){
        if (ID == this._combineID && Inventory.getInstance().itemInInventory(ID)) {
            Nightstand._closed = false;
        }
        super.combine(ID);
    }

}
