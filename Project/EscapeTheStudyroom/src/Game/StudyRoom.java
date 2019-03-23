package Game;

import Items.*;

public class StudyRoom extends Room{

    String roomName = "Study";
    String _description = "Your study. A desk lamp dimly illuminates the following Items:";
    int room_Id = 0;

    public StudyRoom()
    {
        this.roomName = roomName;
        this. _description = _description;
        Room Study = new Room();
    }

public static void main(String args[])
{
    new StudyRoom();
}
}
