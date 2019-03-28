package Items;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ItemInitializer {

    public static void init() {

        for ( Thing item : Items.itemlist ) {
            String fileName = "src\\Items\\Itemlist\\" + item._name + ".json";
            if ( !(new File(fileName).exists())) {
                File file = new File(fileName);

                System.out.println(( file.getAbsolutePath() ));
                try {
                    Formatter f = new Formatter(( file.getAbsolutePath() ));
                    f.format("useable : \r\n");
                    f.format("takeable : \r\n");
                    f.format("combineable : \r\n");
                    f.format("name : \r\n");
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
                    System.out.println(values[0]);
                }
            } catch ( FileNotFoundException e ) {
                e.printStackTrace();
            }
        }
    }

}
