public class Cat {

    private String name;
    private int appetite;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Bowl bowl){
        bowl.decreaseFood(appetite);
        System.out.printf("Кот %s съел %d еды\n", name, appetite);
    }
}
