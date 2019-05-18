package Rooms;

import Control.Game;
import Items.*;

import java.util.List;
import Rooms.RoomInitializer;
import java.util.ArrayList;

public class Room {

    public static List<Room> discoveredRooms = new ArrayList<Room>();
    private int room_Id;
    private String roomName;
    private boolean unlocked;
    private String _description;
    private List<Thing> itemsInRoom;
    private String[] adjacentRooms;

    /**
     * Instantiates discoveredRooms List with beginning Room (Study)
     */
    public static void initializeStartRoom() {
        discoveredRooms.add(RoomInitializer.getNewRoom("Study"));
    }

    /**
     * Constructor
     * Initializes a Room with given parameters
     *
     * @param ROOM_ID
     * @param ROOM_NAME
     * @param _DESCRIPTION
     * @param _UNLOCKED
     * @param _ITEMS
     * @param _ADJACENTS
     */
    public Room(int ROOM_ID,
                String ROOM_NAME,
                String _DESCRIPTION,
                boolean _UNLOCKED,
                List<Thing> _ITEMS,
                String[] _ADJACENTS) {
        this.room_Id = ROOM_ID;
        this.unlocked = true;
        this.roomName = ROOM_NAME;
        this._description = _DESCRIPTION;
        this.itemsInRoom = _ITEMS;
        this.adjacentRooms = _ADJACENTS;
        if (!discoveredRooms.contains(ROOM_ID)) {
            discoveredRooms.add(this);
        }
    }


    /**
     * Activates Room initialization of Room with given Name
     * Use this to enter the desired room.
     * @param roomName
     */
    public static String enter(String roomName)
    {
        if (!roomDiscovered(roomName))
        {
            RoomInitializer.getNewRoom(roomName);
            Game.Panel.setLabelText("You entered the " + roomName + " .");
        }
        else
        {
            int i = 0;
            int desiredRoom = 0;
            for (Room r : discoveredRooms)
            {
                if (roomName.equals(r.roomName))
                {
                    desiredRoom = i;
                }
                i++;
            }
            Game.Panel.setLabelText("Room: " + roomName + "\n" + discoveredRooms.get(desiredRoom)._description + "\nItems: " +
                             discoveredRooms.get(desiredRoom).itemsInRoom + "\nAdjacent Rooms: " + discoveredRooms.get
                            (desiredRoom).adjacentRooms);
        }
        return null;
    }


    private static boolean roomDiscovered(String roomName)
    {
        boolean roomDiscovered = false;
        for(int i=0; i<discoveredRooms.size(); i++)
        {
            if(discoveredRooms.get(i).roomName.equalsIgnoreCase(roomName))
            { roomDiscovered = true; }
        }
        return roomDiscovered;
    }
}
