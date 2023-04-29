public class DarkRoom extends MapTile {
    private String desc;

    public DarkRoom(int x, int y) {
        super(x, y);
        desc = "Completely dark room. Navigate slowly and find a door ";
    }
    public String intro_text() {
        return desc;
    }
    @Override
    public void modify_player(Player player) {

    }
}