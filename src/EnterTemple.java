public class EnterTemple extends MapTile {
    public EnterTemple(int x,int y){
        super(x, y);
    }


    public String intro_text() {
        return "\n You're wandering through the desert \n and come across a Temple \n Defeat all enemies and collect gems";
    }
    public void modify_player(Player player){

    }
}
