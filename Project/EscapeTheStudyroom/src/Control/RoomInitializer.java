package Control;

import java.util.List;

public class RoomInitializer implements RoomConstants {

    public static Room getNewRoom(String name)
    {
        switch (name)
        {
            case ("Study"):
                return new Room(RoomConstants.STUDY_ROOM_ID,
                            RoomConstants.STUDY_ROOM_NAME,
                            RoomConstants.STUDY_DESCRIPTION,
                            RoomConstants._UNLOCKED_STUDY,
                            RoomConstants._ITEMS_STUDY,
                            RoomConstants._ADJACENTS_STUDY)
                        ;

            case ("Living Room"):
                return new Room(RoomConstants.LIVING_ROOM_ID,
                            RoomConstants.LIVING_ROOM_NAME,
                            RoomConstants.LIVING_DESCRIPTION,
                            RoomConstants._UNLOCKED_LIVING,
                            RoomConstants._ITEMS_LIVING,
                            RoomConstants._ADJACENTS_LIVING);

            case ("Kitchen"):
                return new Room(RoomConstants.KITCHEN_ROOM_ID,
                                RoomConstants.KITCHEN_ROOM_NAME,
                            RoomConstants.KITCHEN_DESCRIPTION,
                            RoomConstants._UNLOCKED_KITCHEN,
                            RoomConstants._ITEMS_KITCHEN,
                            RoomConstants._ADJACENTS_KITCHEN);

            case ("Toilet"):
                return new Room(RoomConstants.TOILET_ROOM_ID,
                            RoomConstants.TOILET_ROOM_NAME,
                            RoomConstants.TOILET_DESCRIPTION,
                            RoomConstants._UNLOCKED_TOILET,
                            RoomConstants._ITEMS_TOILET,
                            RoomConstants._ADJACENTS_TOILET);

            case ("Trapdoor"):
                return new Room(RoomConstants.SECRET_ROOM_ID,
                            RoomConstants.SECRET_ROOM_NAME,
                            RoomConstants.SECRET_DESCRIPTION,
                            RoomConstants._UNLOCKED_SECRET,
                            RoomConstants._ITEMS_SECRET,
                            RoomConstants._ADJACENTS_SECRET);
            default:
                System.out.println("Room: " + name + "\nItems: " + itemsInRoom + "\nAdjacent Rooms: " + _ADJACENTS_LIVING);
        }
        return null;
    }

}
