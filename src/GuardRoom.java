public class GuardRoom extends EnemyRoom{
    Guard enemy;

    public GuardRoom(int x, int y, Guard enemy){
        super(x, y, enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " A Guard approaches you and begins to swing his sword!!!";
        }else{
            return "You defeat the Guard in a  sword fight.";
        }
    }
}
