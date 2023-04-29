public class SuperSwordRoom extends LootRoom {

    public SuperSwordRoom(int x, int y, SuperSword SuperSword){
        super(x, y, SuperSword);

    }

    public String intro_text(){
        if(pickedItem == false)
            return String.format("You got one SuperSword for killing an enemy");
        else
            return "";
    }

}
