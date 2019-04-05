package Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Items.*;
import Control.*;
import Game.*;

public class GameParser {
    
	String [] zerlegteEingabe;
	//BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

    public GameParser () throws IOException {
    	
        String nPaarWoerter = Game.getTextField();// Which input?!?
        zerlegteEingabe = nPaarWoerter.split(" ");
        
    }

    public void verarbeiteEingabe () //Switch Bedingung
    {
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



