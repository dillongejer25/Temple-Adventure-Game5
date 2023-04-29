public class SandRoom extends LootRoom {
    public SandRoom(int x, int y, Gems gems){
        super(x, y, gems);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You found a pile of Gems in the sand with value 15");
        else
            return "";
    }
}