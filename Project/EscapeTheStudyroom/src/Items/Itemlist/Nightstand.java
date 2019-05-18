package Items.Itemlist;

import Items.Inventory;
import Items.ItemHolder;
import Items.Thing;

public class Nightstand extends Thing {

    public static boolean _closed = true;

    public Nightstand(){
        this._ID = 1;
        this._combineable = true;
        this._useable = true;
        this._use_msg = "It's closed...";
        this._description = "This is your trusty nightstand. It was always next to you when you needed it.";
        this._combine_msg = "You opened the drawer with the key";
        this._name = "nightstand";
        this._combineID = 2;
        ItemHolder.getInstance().addItem(this);
    }

    @Override
    public void combine(int ID){
        if (ID == this._combineID && Inventory.getInstance().itemInInventory(ID)) {
            _closed = false;
        }
        super.combine(ID);
    }

    @Override
    public String use(){
        if ( !_closed ){
            this._use_msg = "you open the top drawer of the nightstand and it presents you with a puddle of blood aswell as a crowbar.";
        }
        return super.use();
    }



}
