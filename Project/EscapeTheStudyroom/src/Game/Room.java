package Game;

import Items.*;

public class Room {

    int room_Id = 0;
    String roomName = "";
    boolean active; //Nötig ?! Falls ja? Wie?
    String _description = "lol du figga";
    Items _items = new Items();

    public Room(String roomName)
    {
        this.active = true;
        this.roomName = roomName;
        System.out.print(_description);
    }

    /*
    public void enter()
    {
        new Room(roomName);
        System.out.println("You entered the "+this.roomName+" .\n");
    }
    */
}
