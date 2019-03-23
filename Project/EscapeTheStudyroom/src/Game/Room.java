package Game;

import Items.Items;

public class Room {

    int room_Id = 0;
    String roomName = "";
    boolean active;
    String _description = "lol du figga";
    Items _items = new Items();

    public Room()
    {
        this.active = true;
        System.out.print(_description);
    }

    public void enter()
    {

    }
}
