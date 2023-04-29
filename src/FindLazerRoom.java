public class FindLazerRoom extends LootRoom{
    public FindLazerRoom (int x, int y, Lazer Lazer){
        super(x, y, Lazer);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You got a Lazer for killing Enemy");
        else
            return "";
    }
}