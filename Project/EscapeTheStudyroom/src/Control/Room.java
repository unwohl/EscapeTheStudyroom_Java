package Control;

import Items.*;
import Control.RoomInitializer;
import java.util.List;
import java.util.ArrayList;

public class Room {

    public static List<Room> discoveredRooms = new ArrayList<Room>();
    private int room_Id;
    private String roomName;
    private boolean unlocked;
    private String _description;
    private List<Thing> itemsInRoom;
    private String[] adjacentRooms;

    public void __initializeDiscoveredRooms()
    {
        discoveredRooms.add(RoomInitializer.getNewRoom("Study"));
    }

    public Room(int ROOM_ID,
            String ROOM_NAME,
            String _DESCRIPTION,
            boolean _UNLOCKED,
            List<Thing> _ITEMS,
            String[] _ADJACENTS)
    {
        this.room_Id = ROOM_ID;
        this.unlocked = true;
        this.roomName = ROOM_NAME;
        this._description = _DESCRIPTION;
        this.itemsInRoom = _ITEMS;
        this.adjacentRooms = _ADJACENTS;
        if (!discoveredRooms.contains(ROOM_ID))
        {
            discoveredRooms.add(this);
        }
    }


    public static void enter(String roomName)
    {
        
        RoomInitializer.getNewRoom(roomName);
        System.out.println("You entered the " + roomName+" .\n");

    }
}
