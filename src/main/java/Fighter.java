public class Fighter {

    private String name;
    private  int health;
    private int damage;

    public  Fighter(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;}

        public void hit(Fighter another){
            another.health -= this.damage;
            System.out.printf("%s ударил %s, dmg = %d, health left %d\n", this.name, another.name, this.damage, another.health);
        }

        //класс бойцов
        public boolean isAlive() {
            return this.health > 0;
        }



}
