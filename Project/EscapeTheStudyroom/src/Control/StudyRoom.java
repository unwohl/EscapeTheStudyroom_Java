/*
    DEPRECATED - SIEHE ROOMINITIALIZER
*/

package src.Control;

public class StudyRoom implements RoomConstants {

    String roomName = "Study";
    String _description = "Your study. A desk lamp dimly illuminates the following Items:";
    int room_Id = 0;

    public void enter(String roomName, String _description)
    {
        this.roomName = roomName;
        this. _description = _description;
        //Room study = new Room(ROOM ID: "study");
    }

//TEST INTIALISATION
public static void main(String args[])
{
    new StudyRoom();
}

}
