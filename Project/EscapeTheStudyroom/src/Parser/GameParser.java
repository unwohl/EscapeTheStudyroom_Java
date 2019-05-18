package Parser;

import java.io.IOException;

import Items.*;
import Control.*;

public class GameParser {
    
	String [] zerlegteEingabe;
	//BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Constructor with two variables to prepare the input.
     *
     * @variable nPaarWoerter : Hold the Sting of words
     * @variable zerlegteEingabe : Contains the Content of varibale above but split
     *
     * @throws IOException
     */
    public GameParser () throws IOException {

    }

    /**
     * Method to execute parameter in Game (main).
     *
     * Switch-Case gets String to execute in specially situations.
     *
     * @use : Use a item
     * @examine : Examine a item
     * @take : Take a item
     * @combine : combine a item with another
     *
     */
    public void parse() {

            String nPaarWoerter = Game.Panel.getTextField();// Which input?!?
            zerlegteEingabe = nPaarWoerter.split(" ");

            switch (zerlegteEingabe[0]) {

                case ("use"):
                    Game.Panel.setLabelText(ItemHolder.getInstance().getThingFromName(zerlegteEingabe[1]).use());
                    break;
                case ("examine"): //take und combine
                    Game.Panel.setLabelText(ItemHolder.getInstance().getThingFromName(zerlegteEingabe[1]).examine());
                    break;
                case ("take"):
                    Game.Panel.setLabelText(ItemHolder.getInstance().getThingFromName(zerlegteEingabe[1]).take());
                    break;
                case ("combine"):
                    ItemHolder.getInstance().getThingFromName(zerlegteEingabe[1]).combine(ItemHolder.getInstance().getIdFromName(zerlegteEingabe[2]));
                    break;
                default:
                    System.out.println("FUCK YOU");
            }

    }
}



