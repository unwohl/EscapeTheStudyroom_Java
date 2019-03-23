package Items;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

public class ItemInitializer {
    public static void init(){
        for(Thing item : Items.itemlist){
            File file = new File("src\\Items\\Itemlist\\"+item._name+".json");
            System.out.println((file.getAbsolutePath()));
            try {
                Formatter f = new Formatter((file.getAbsolutePath()));
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
