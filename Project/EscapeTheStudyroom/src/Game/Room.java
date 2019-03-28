package Game;

import Items.Items;

public class Room {

    int room_Id = 0;
    String roomName = "";
    boolean active;
    String _description = "lol du figga";
    Items _items = new Items();
    hashset<String>();

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
