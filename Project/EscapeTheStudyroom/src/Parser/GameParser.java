package Parser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public void verarbeiteEingabe () {

        String nPaarWoerter = Game.Panel.getTextField();// Which input?!?
        zerlegteEingabe = nPaarWoerter.split(" ");

       switch (zerlegteEingabe[0]) {

       case ("use"):
    	   Items.getThingFromName(zerlegteEingabe[1]).use();
       	   break;
       case ("examine"): //take und combine
    	   Items.getThingFromName(zerlegteEingabe[1]).examine();
    	   break;
       case ("take"):
    	   Items.getThingFromName(zerlegteEingabe[1]).take();
    	   break;
       case ("combine"):
    	   Items.getThingFromName(zerlegteEingabe[1]).combine(Items.getIdFromName(zerlegteEingabe[2]));
       	   break;
       default:
    	   System.out.println("FUCK YOU");
       }

    }
}



