package Rooms;

import Items.*;

import java.util.*;

public interface RoomConstants {

    public ArrayList<Thing> itemsInRoom = new ArrayList<Thing>();

    public static final int BEDROOM_ID = 0;
    public static final String BEDROOM_NAME = "bedroom";
    public static final String BEDROOM_DESCRIPTION = "You enter the bedroom and see the bed in which you woke up, aswell as your nightstand," +
            "\n your cupboard, a dildo and your favorite rag";
    public static final boolean BEDROOM_UNLOCKED_ = true;
    public static final List<Thing> BEDROOM_ITEMS_ = new ArrayList<Thing>();
    public static final String[] BEDROOM_ADJACENTS = {"livingroom"};

    public static final int LIVINGROOM_ID = 1;
    public static final String LIVINGROOM_NAME = "livingroom";
    public static final String LIVINGROOM_DESCRIPTION = "You enter the livingroom and your eyes immediately wander towards the TV you used " +
            "\nto watch the news in the morning, and then you see that your couch and couchchair have been rearranged " +
            "\nalong with your favorite plant. Your first urge is to make some food in the kitchen.";
    public static final boolean LIVINGROOM_UNLOCKED_ = false;
    public static final List<Thing> LIVINGROOM_ITEMS_ = new ArrayList<Thing>();
    public static final String[] LIVINGROOM_ADJACENTS = {"bedroom","bathroom","terrace"};

    public static final int BATHROOM_ROOM_ID = 2;
    public static final String BATHROOM_NAME = "bathroom";
    public static final String BATHROOM_DESCRIPTION = "You enter the bathroom and see your shower that seems to have been used recently, " +
            "\nnext to the toilet is the bin and your sink also seems to be in its usual place.";
    public static final boolean BATHROOM_UNLOCKED_ = false;
    public static final List<Thing> BATHROOM_ITEMS_ = new ArrayList<Thing>();
    public static final String[] BATHROOM_ADJACENTS = {"livingroom"};

    public static final int TERRACE_ID = 3;
    public static final String TERRACE_NAME = "terrace";
    public static final String TERRACE_DESCRIPTION = "You step out onto the terrace and INSTANTLY notice a big puddle of blood under your " +
            "\nchair thats flowing towards your parsley plant and dripping off under the rail.";
    public static final boolean TERRACE_UNLOCKED_ = false;
    public static final List<Thing> TERRACE_ITEMS_ = new ArrayList<Thing>();
    public static final String[] TERRACE_ADJACENTS = {"livingroom"};



}
