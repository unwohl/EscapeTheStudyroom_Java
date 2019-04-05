package src.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import src.Items.Items;

public class GameParser {
    
	String [] zerlegteEingabe;
	BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

    public GameParser () throws IOException {
    	
        String nPaarWoerter = eingabe.readLine();
        zerlegteEingabe = nPaarWoerter.split(" ");
        
    }

    public void verarbeiteEingabe2 () //Switch Bedingung
    {
       switch (zerlegteEingabe[0]) {
       case ("use"):
    	   Items.getThingFromName(zerlegteEingabe[1]).use();
       	   break;
       case ("examine"): //take und combine
    	   
    	   break;
       case ("take"):
    	   
    	   break;
       case ("combine"):
       }
    }
}



