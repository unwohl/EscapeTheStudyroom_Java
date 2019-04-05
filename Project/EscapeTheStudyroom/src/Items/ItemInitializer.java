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
        Items items = new Items();

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
                String name = "";
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    String[] values = line.split(" : ");
                    switch(values[0]){
                        case "name":
                            if(!Items.itemExists(values[1])){
                                System.out.println("item does not exist yet!");
                                new Thing(values[1]);
                            }else{
                                System.out.println("item does exist!");
                                items.getThingFromName(values[1]).setName(values[1]);
                            }
                            name = values[1];
                            break;
                        case "useable":
                            if(values[1].equals("true")){
                                items.getThingFromName(name)._useable = true;
                                System.out.println("Yup...");
                                break;
                            }
                            System.out.println(values[1]);
                            break;
                        case "takeable":
                            if(values[1].equals("true")){
                                items.getThingFromName(name)._takeable = true;
                            }
                            break;
                        case "combineable":
                            if(values[1].equals("true")){
                                items.getThingFromName(name)._combineable = true;
                            }
                            break;
                        case "description":
                            System.out.println(name);
                            items.getThingFromName(name)._description = values[1];
                            break;
                        case "usemsg":
                            items.getThingFromName(name)._use_msg = values[1];
                            break;
                        case "takemsg":
                            items.getThingFromName(name)._take_msg = values[1];
                            break;
                        case "combinemsg":
                            items.getThingFromName(name)._combine_msg = values[1];
                            break;
                        case "combineid":
                            items.getThingFromName(name)._combineID = Integer.parseInt(values[1]);
                            break;
                        case "ID":
                            items.getThingFromName(name)._ID = Integer.parseInt(values[1]);
                            break;

                    }
                }
            } catch ( FileNotFoundException e ) {
                e.printStackTrace();
            }
        }
    }

}
