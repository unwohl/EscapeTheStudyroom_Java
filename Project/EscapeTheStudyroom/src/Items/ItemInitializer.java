package Items;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class ItemInitializer {

    public static void init() {

        List<Thing> itemlist = Items.itemlist;

        for ( Thing item : itemlist ) {
            String fileName = "src\\Items\\Itemlist\\" + item._name + ".thng";
            if ( !(new File(fileName).exists())) {
                File file = new File(fileName);

                System.out.println(( file.getAbsolutePath() ));
                try {
                    Formatter f = new Formatter(( file.getAbsolutePath() ));
                    f.format("name : \r\n");
                    f.format("useable : \r\n");
                    f.format("takeable : \r\n");
                    f.format("combineable : \r\n");
                    f.format("description : \r\n");
                    f.format("usemsg : \r\n");
                    f.format("takemsg : \r\n");
                    f.format("combinemsg : \r\n");
                    f.format("combineid : \r\n");
                    f.format("ID : " + item.getID());
                    f.close();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
        }

        for (File file : new File("src\\Items\\Itemlist").listFiles()){
            try {
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    String[] values = line.split(" : ");
                    switch(values[0]){
                        case "name":
                            if(!Items.itemExists(values[1])){
                                new Thing();
                            }
                            break;
                        case "useable":
                            break;
                        case "takeable":
                            break;
                        case "combineable":
                            break;
                        case "description":
                            break;
                        case "usemsg":
                            break;
                        case "takemsg":
                            break;
                        case "combinemsg":
                            break;
                        case "combineid":
                            break;
                        case "ID":
                            break;

                    }
                }
            } catch ( FileNotFoundException e ) {
                e.printStackTrace();
            }
        }
    }

}
