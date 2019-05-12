package Control;

import Items.*;

import java.util.*;

public interface RoomConstants {

    public ArrayList<Thing> itemsInRoom = new ArrayList<Thing>();


    public static final int STUDY_ROOM_ID = 0;
    public static final String STUDY_ROOM_NAME = "Study";
    public static final String STUDY_DESCRIPTION = "";
    public static final boolean _UNLOCKED_STUDY = true;
    public static final List<Thing> _ITEMS_STUDY = Items.itemlist;
    public static final String[]_ADJACENTS_STUDY = {"Living Room", "Toilet"};

    public static final int LIVING_ROOM_ID = 1;
    public static final String LIVING_ROOM_NAME = "Living Room";
    public static final String LIVING_DESCRIPTION = "It's dirty.";
    public static final boolean _UNLOCKED_LIVING = false;
    public static final List<Thing> _ITEMS_LIVING = Items.itemlist;
    public static final String[]_ADJACENTS_LIVING = {"Study", "Toilet", "Kitchen"};

    public static final int KITCHEN_ROOM_ID = 2;
    public static final String KITCHEN_ROOM_NAME = "Kitchen";
    public static final String KITCHEN_DESCRIPTION = "It*s even dirtier.";
    public static final boolean _UNLOCKED_KITCHEN = false;
    public static final List<Thing> _ITEMS_KITCHEN = Items.itemlist;
    public static final String[]_ADJACENTS_KITCHEN = {"Toilet", "Living Room"};

    public static final int TOILET_ROOM_ID = 3;
    public static final String TOILET_ROOM_NAME = "Lavatory";
    public static final String TOILET_DESCRIPTION = "You really need to clean.";
    public static final boolean _UNLOCKED_TOILET = true;
    public static final List<Thing> _ITEMS_TOILET = Items.itemlist;
    public static final String[]_ADJACENTS_TOILET = {"Kitchen", "Trapdoor"};

    public static final int SECRET_ROOM_ID = 4;
    public static final String SECRET_ROOM_NAME = "Secret Room";
    public static final String SECRET_DESCRIPTION = "figga";
    public static final boolean _UNLOCKED_SECRET = false;
    public static final List<Thing> _ITEMS_SECRET = Items.itemlist;
    public static final String[]_ADJACENTS_SECRET = {};
/*
    public static final int _ROOM_ID = 0;
    public static final String _ROOM_NAME = "";
    public static final String _DESCRIPTION = "";
    public static final boolean _UNLOCKED_ = true;
    public static final List<Thing> _ITEMS_ = Items.itemlist;

    public static final int _ROOM_ID = 0;
    public static final String _ROOM_NAME = "";
    public static final String _DESCRIPTION = "";
    public static final boolean _UNLOCKED_ = true;
    public static final List<Thing> _ITEMS_ = Items.itemlist;

*/

}
