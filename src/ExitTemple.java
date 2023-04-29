public class ExitTemple extends MapTile {

    private String description;

    public ExitTemple(int x, int y) {
        super(x, y);
        description = "You have safely wandered out of the Temple. Congratulations!";
    }
    public String intro_text() {
        return description;
    }
    @Override
    public void modify_player(Player player) {

    }


}