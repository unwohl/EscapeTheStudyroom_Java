package Items;

public class CombineableThing extends UseableThing{
    String _abort = "You cannot combine this.";
    String _defaultUse = "you need to combine something with this.";
    String _combine_msg = "You tried to combine this with another item.";
    int _combineID = 0;
    Inventory inventory = new Inventory();

    public CombineableThing(String arg1,String arg2,String arg3,int arg4){
        super._description = arg1;
        if(arg2 == ""){
            this._use_msg = _defaultUse;
        }else{
            this._use_msg = arg2;
        }
        this._combine_msg = arg3;
        this._combineID = arg4;
    }

    public CombineableThing(int arg){
        this._combineID = arg;
    }

    public void combine(int ID){
        if(ID == _combineID && inventory.itemInInventory(ID)){
            System.out.println("you combined "+ _name+" with "+items.getNameFromID(ID));
            inventory.removeFromInventorybyID(ID);
        }else if(ID == _combineID) {
            System.out.print("You do not have the required item in your inventory...");
        } else {
            System.out.println(_abort);
        }
    }
}
