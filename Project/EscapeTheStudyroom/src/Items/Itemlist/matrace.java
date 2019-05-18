package Items.Itemlist;

import Items.Thing;

public class matrace extends Thing {

    public matrace() {

        this._ID = 90001;
        this._combineID = 90002;

        this._description = "It's a white matrace. It looks like someone lie here before";
        this._name = "white mattress";
        this._combine_msg = "You slitt the mattress with your knife." +
                            "surprisingly you found lots of fethers a  golden shiny key. " +
                            "The key looks like the key for the terrace";

        this._combineable = true;

    }

}
