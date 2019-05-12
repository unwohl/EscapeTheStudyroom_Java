package Items;

public interface IThing {

    public String examine();
    public String use();
    public String take();
    public void combine(int ID);
    public void init();

}
