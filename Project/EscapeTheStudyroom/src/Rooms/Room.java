package Rooms;

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
    public static void initializeStartRoom()
    {
        discoveredRooms.add(RoomInitializer.getNewRoom("Study"));
    }

    /**
     * Constructor
     * Initializes a Room with given parameters
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


    /**
     * Activates Room initialization of Room with given Name
     * Use this to enter the desired room.
     * @param roomName
     */
    public static void enter(String roomName)
    {
        if (!discoveredRooms.contains(roomName))
        {
            RoomInitializer.getNewRoom(roomName);
            System.out.println("You entered the " + roomName + " .\n");
        }
        else
        {
            int i = 0;
            int desiredRoom;
            for (Room r : discoveredRooms)
            {
                if (roomName.equals(r.roomName))
                {
                    desiredRoom = i;
                }
                i++;
            }
            System.out.println("Room: " + roomName + "\nItemHolder: " + discoveredRooms.get(i).itemsInRoom + "\nAdjacent Rooms: " + discoveredRooms.get(i).adjacentRooms);
        }
    }
}
