package Items;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class ItemInitializer implements IThing{

    @Override
    public String examine() {

        return null;
    }

    @Override
    public String use() {

        return null;
    }

    @Override
    public String take() {

        return null;
    }

    @Override
    public void combine( int ID ) {

    }

    public void init() {

        List<Thing> itemlist = Items.itemlist;

    }

}
