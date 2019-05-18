package Items.Itemlist;

import Items.Inventory;
import Items.ItemHolder;
import Items.Thing;

public class InventoryItem extends Thing {

    private static InventoryItem instance = new InventoryItem();

    public static InventoryItem getInstance(){
        return instance;
    }

    public InventoryItem(){
        this._name = "inventory";
        ItemHolder.getInstance().addItem(this);
    }

    @Override
    public String examine(){
        this._description = "Your inventory contains: ";
        for ( Thing thng:Inventory.getInstance().getInventory()) {
            System.out.println("found +"+thng.getName());
            this._description += " " + thng.getName() +",";
        }
        return this._description;
    }
}
