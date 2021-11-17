public class Bowl {
    private int foodAmount;

    //ложеь опред колво еды в миску
    public void putFood(int amount){
        this.foodAmount += amount;
        System.out.printf("Еды увеличилось на %d штук, теперь ее стало %d\n", amount, foodAmount);
    }

    // Метод уменьшающий количество еды
    public void decreaseFood(int amount){
        this.foodAmount -= amount;
        System.out.printf("Еды уменьшилось на %d штук, теперь ее стало %d\n ", amount, foodAmount);
    }
     //сколько в миске еды
    public int getFoodAmount() {
        return foodAmount;
    }
}
