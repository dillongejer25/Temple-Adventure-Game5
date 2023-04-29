public class GiantSnakeRoom extends EnemyRoom{

    GiantSnake enemy;
    public GiantSnakeRoom(int x, int y, GiantSnake enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "You enter a dark and musty room, and suddenly a Giant Snake slithers its way from the shadows to attack you!";
        }else{
            return "The remains of the snake lie across the sandy floor. Proceed ";
        }
    }

}