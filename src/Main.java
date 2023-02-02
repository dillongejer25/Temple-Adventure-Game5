public class Main {
    public static void main(String[] args) {
        //goldBar, magicSword, softPillow, and bigMace
        Gold goldbar = new Gold(50);
        Weapon magicSword = new Weapon("magicSword", "Super Sword", 10,50);
        Weapon softPillow = new Weapon("softPillow", "Soft Pillow", 5,5);
        Weapon bigMace = new Weapon("bigMace", "Epic Mace", 20,75);
        Weapon coolArrow = new Weapon("coolArrow", "Magic Arrow", 25,80);



        ///greenOgre, redOgre, slowZombie, fastZombie, spotDog, scarySpider, dashLion
         Enemy greenOgre = new Enemy("greenOgre", 10, 50);
         Enemy redOgre = new Enemy("redOgre", 10, 50);
         Enemy slowZombie = new Enemy("slowZombie", 20, 15);
         Enemy fastZombie = new Enemy("fastZombie", 20, 15);
         Enemy spotDog = new Enemy("spotDog", 20, 15);
         Enemy GiantSpider = new Enemy("GiantSpider", 30, 40);
         Enemy bigLion = new Enemy("bigLion", 50, 60);

        System.out.println(goldbar);
        System.out.println(magicSword);
        System.out.println(softPillow);
        System.out.println(bigMace);
        System.out.println(greenOgre);
        System.out.println(redOgre);
        System.out.println(slowZombie);
        System.out.println(fastZombie);
        System.out.println(spotDog);





        //Weapon w1 = new Weapon("super weapon", "super 2 weapon", 10, 50);
        //weapon.setDamage(40);
        //int dvalue = weapon.getDamage();
    }
}