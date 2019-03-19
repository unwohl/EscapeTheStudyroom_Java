import Parser.*;
import Items.*;

public class Game {

    private static Items items = new Items();

    public static void main(String [] args){
        GameParser a = new GameParser("HAaaaaa");
        a.parse();
        addTestItems();
        for (Thing thing : Items.itemlist) {
            System.out.println(thing.examine());
        }
        for(int i = 0; i <= Thing.ThingCount; i++){
            System.out.println(items.getNameFromID(i+1));
        }
    }

    public static void addTestItems(){
        Thing Desk = new Thing("This is a wooden desk.");
        Thing Wall = new Thing("You are looking at a wall... good job!");
        UseableThing lightswitch = new UseableThing("This is a lightswitch...","You have turned on the light!");
        UseableThing Laptop = new UseableThing("This is an HP Omen with a GeForce 1060!","You are looking at Hardcore Granny Porn...");
        TakeableThing Spoon = new TakeableThing("Its an empty spoon...","You are licking the spoon and it tastes like metal...","You took the Spoon.");
        TakeableThing Screwdriver = new TakeableThing("This is a Screwdriver","You are fiddling with the screwdriver...","You took the Screwdriver");
        CombineableThing Screw = new CombineableThing("This is a screw, i wonder what it is holding","You are trying to pull out the spoon with your bare hands, it hurts","",6);
        CombineableThing Soup = new CombineableThing("A chicken noodle soup... looks tasty!","You try to drink the soup without a spoon and burn your tounge","",5);
        Desk.setName("the Desk");
        Wall.setName("a Wall");
        lightswitch.setName("the switch");
        Laptop.setName("Hp Omen");
        Spoon.setName("Metal Spoon");
        Screwdriver.setName("Screwdriver");
        Screw.setName("Metal Screw");
        Soup.setName("Chicken Soup");
    }
}
