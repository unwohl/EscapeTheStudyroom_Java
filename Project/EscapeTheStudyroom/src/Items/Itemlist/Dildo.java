package Items.Itemlist;

import Items.Thing;
import Items.Thing.*;

public class Dildo extends Thing {

    public Dildo () {

        this._ID = 90003;

        this._description = "This is a BigDong dildo. It is 300cm long and very heavy";
        this._use_msg = "Ohhhhhhhhhhhhh...";
        this._name = "dildo";
        this._take_msg = "You took the " + this._name;

        this._takeable = true; // I don't know for what but yes! JUST DO IT
        this._useable = true;

    }

}

