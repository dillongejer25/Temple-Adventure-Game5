public class Gems extends Item{
    public int amt;

    public Gems(int amt){
        super("Gems", "Shiny green stone", 10);
        this.amt = Integer.parseInt(String.valueOf(amt));


    }
}
