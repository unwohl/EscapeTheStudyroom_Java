package Items;

import java.util.List;

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

        List<Thing> itemlist = ItemHolder.getInstance().itemlist;

    }

}
