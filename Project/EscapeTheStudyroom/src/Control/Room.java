package Control;

import Items.*;

import java.util.List;

public class Room {

    private int room_Id;
    private String roomName;
    private boolean active;
    private String _description;
    private List<Thing> itemsInRoom;
    private String[] adjacentRooms;

    public Room(int ROOM_ID,
            String ROOM_NAME,
            String _DESCRIPTION,
            boolean _ACTIVE,
            List<Thing> _ITEMS,
            String[] _ADJACENTS)
    {
        this.room_Id = ROOM_ID;
        this.active = true;
        this.roomName = ROOM_NAME;
        this._description = _DESCRIPTION;
        this.itemsInRoom = _ITEMS;
        this.adjacentRooms = _ADJACENTS;
    }


    public static void enter(String roomName)
    {
        RoomInitializer.getNewRoom(roomName);
        System.out.println("You entered the " + roomName+" .\n");
    }
}
