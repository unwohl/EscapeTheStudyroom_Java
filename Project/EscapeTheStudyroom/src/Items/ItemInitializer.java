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
                    Thing thing = new Thing();
                    String line = sc.nextLine();
                    String[] values = line.split(" : ");
                    switch(values[0]){
                        case "name":
                            if(!Items.itemExists(values[1])){
                                new Thing(values[1]);
                                thing = Items.getThingFromName(values[1]);
                            }else{
                                thing = Items.getThingFromName(values[1]);
                                thing.setName(values[1]);
                            }
                            break;
                        case "useable":
                            if(values[1] == "true"){
                                thing._useable = true;
                            }
                            break;
                        case "takeable":
                            if(values[1] == "true"){
                                thing._takeable = true;
                            }
                            break;
                        case "combineable":
                            if(values[1] == "true"){
                                thing._combineable = true;
                            }
                            break;
                        case "description":
                            thing._description = values[1];
                            break;
                        case "usemsg":
                            thing._use_msg = values[1];
                            break;
                        case "takemsg":
                            thing._take_msg = values[1];
                            break;
                        case "combinemsg":
                            thing._combine_msg = values[1];
                            break;
                        case "combineid":
                            thing._combineID = Integer.parseInt(values[1]);
                            break;
                        case "ID":
                            thing._ID = Integer.parseInt(values[1]);
                            break;

                    }
                }
            } catch ( FileNotFoundException e ) {
                e.printStackTrace();
            }
        }
    }

}
