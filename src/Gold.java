public class Gold extends Item{

    private int amt;

    public Gold(int amt){

        super("Gold", String.format("A round coin with %s stamped in the front.", (amt)), amt);
        this.amt = amt;
    }
}
