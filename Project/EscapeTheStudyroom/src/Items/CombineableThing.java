package Items;

public class CombineableThing extends UseableThing{
    String _abort = "You cannot combine this.";
    String _defaultUse = "you need to combine something with this.";
    String _combine_msg = "You tried to combine this with another item.";
    int _combineID = 0;

    public CombineableThing(String arg1,String arg2,String arg3,int arg4){
        super._description = arg1;
        if(arg2 == ""){
            super._use_msg = _defaultUse;
        }else{
            super._use_msg = arg2;
        }
        _combine_msg = arg3;
        _combineID = arg4;
    }

    public CombineableThing(int arg5){

    }

    public void combine(int ID){
        if(ID == _combineID){

        }else{
            System.out.println(_abort);
        }
    }
}
