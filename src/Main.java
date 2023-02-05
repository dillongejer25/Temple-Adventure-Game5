public class Main {
    public static void main(String[] args) {

        //Weapons
        //goldBar, magicSword, softPillow, and bigMace
        Gold goldbar = new Gold(50);
        Weapon magicSword = new Weapon("magicSword", "Super Sword", 10,50);
        Weapon softPillow = new Weapon("softPillow", "Soft Pillow", 5,5);
        Weapon bigMace = new Weapon("bigMace", "Epic Mace", 20,75);
        Weapon coolArrow = new Weapon("coolArrow", "Magic Arrow", 25,80);


        //Enemies
        ///greenOgre, redOgre, slowZombie, fastZombie, spotDog, scarySpider, dashLion

        Ogre greenOgre = new Ogre("greenOgre", "A scary green Ogre", 30,20 );
        Ogre redOgre = new Ogre("redOgre","A scary red Ogre", 30, 20);
        Zombie slowZombie = new Zombie("slowZombie", "an ugly green and slow zombie", 20, 15);
        Zombie fastZombie = new Zombie("fastZombie", "an ugly green and fast zombie", 20, 15);
        Dog spotDog = new Dog("spotDog", "a quick 4 legged thing",20, 15);
        GiantSpider GiantSpider = new GiantSpider("GiantSpider","8 legged monster", 10, 2);
        Lion bigLion = new Lion("bigLion","a powerful boss like creature" , 50, 60);


        Player player1 = new Player("Dillon", (short)100, (short)10, true);
        if (player1.getLife())
            System.out.println("Player is alive");
        else
            System.out.println("Player is not alive");

        Player player2 = new Player("Emily", (short)10, (short)100, true);
        if (player2.getLife())
            System.out.println("Player is alive");
        else
            System.out.println("Player is not alive");



        //Print Sequences


        //System.out.println(goldbar);
        //System.out.println(magicSword.name + " " + magicSword.description + " " + magicSword.value + " " + magicSword.getDamage());
        //System.out.println(softPillow.name + " " + softPillow.description + " " + softPillow.value + " " + softPillow.getDamage());
        //System.out.println(bigMace.name + " " + bigMace.description + " " + bigMace.value + " " + bigMace.getDamage());

        //System.out.println(greenOgre);
        //System.out.println(redOgre);
        //System.out.println(slowZombie);
        //System.out.println(fastZombie);
        //System.out.println(spotDog);






        //Weapon w1 = new Weapon("super weapon", "super 2 weapon", 10, 50);
        //weapon.setDamage(40);
        //int dvalue = weapon.getDamage();
    }
}