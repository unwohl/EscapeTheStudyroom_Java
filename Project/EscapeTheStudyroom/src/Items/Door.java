package Items;

import Control.Room;

public class Door extends Thing {

    public void unlock(String roomName)
    {
        Room.enter(roomName);
    }


    public void enter(String figga) {

        Room.enter(figga);

        /*
        public String use()
        {
            return null;
        }
        */
    }
}