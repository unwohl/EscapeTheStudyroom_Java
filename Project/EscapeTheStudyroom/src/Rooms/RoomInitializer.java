package Rooms;

import Control.Game;
import Items.*;
import Items.Itemlist.Nightstand;
import Items.Itemlist.Nightstand_Key;

public class RoomInitializer implements RoomConstants {

    /**
     * Initializes the desired Room with current
     * @param name
     * @return
     */
    public static Room getNewRoom(String name)
    {
        switch (name)
        {
            case ("bedroom"):
                RoomConstants.BEDROOM_ITEMS_.add(new Nightstand());
                RoomConstants.BEDROOM_ITEMS_.add(new Nightstand_Key());
                return new Room(RoomConstants.BEDROOM_ID,
                            RoomConstants.BEDROOM_NAME,
                            RoomConstants.BEDROOM_DESCRIPTION,
                            RoomConstants.BEDROOM_UNLOCKED_,
                            RoomConstants.BEDROOM_ITEMS_,
                            RoomConstants.BEDROOM_ADJACENTS)
                        ;

            case ("livingroom"):
                return new Room(RoomConstants.LIVINGROOM_ID,
                            RoomConstants.LIVINGROOM_NAME,
                            RoomConstants.LIVINGROOM_DESCRIPTION,
                            RoomConstants.LIVINGROOM_UNLOCKED_,
                            RoomConstants.LIVINGROOM_ITEMS_,
                            RoomConstants.LIVINGROOM_ADJACENTS);

            case ("bathroom"):
                return new Room(RoomConstants.BATHROOM_ROOM_ID,
                            RoomConstants.BATHROOM_NAME,
                            RoomConstants.BATHROOM_DESCRIPTION,
                            RoomConstants.BATHROOM_UNLOCKED_,
                            RoomConstants.BATHROOM_ITEMS_,
                            RoomConstants.BATHROOM_ADJACENTS);

            case ("terrace"):
                return new Room(RoomConstants.TERRACE_ID,
                            RoomConstants.TERRACE_NAME,
                            RoomConstants.TERRACE_DESCRIPTION,
                            RoomConstants.TERRACE_UNLOCKED_,
                            RoomConstants.TERRACE_ITEMS_,
                            RoomConstants.TERRACE_ADJACENTS);

        }
        return null;
    }
}
