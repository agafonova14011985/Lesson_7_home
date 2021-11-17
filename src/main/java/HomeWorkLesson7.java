import java.util.Scanner;

public class HomeWorkLesson7 {

    public static void main(String[] args) {
        //stringComparing1();
        //stringComparing2();
        //StringBuilderExample();
        //catsAndBowls();
        fightExample();
    }

private static  void fightExample(){
Fighter fighter1 = new Fighter("Scorpion", 100,10);
        Fighter fighter2 = new Fighter("cat", 50,8);
        while (true){
            fighter1.hit(fighter2);
            if(!fighter2.isAlive()) {break;}
            fighter2.hit(fighter1);
            if (!fighter1.isAlive()){break;}
        }


    }

    //Массив из котов они обращаются к методу миска и едят
    private static  void catsAndBowls(){
        Cat[] cats = {
                new Cat("Barsik", 100),
                new Cat("Murzik", 150),
                new Cat("Zhorik", 200),};
        //кушают
        // var bowl = new Bowl(); с 10 джавы
        Bowl bowl = new Bowl();
        bowl.putFood(600);
        for (Cat  cat: cats){
            cat.eat(bowl);
        }}

private static void StringBuilderExample(){
    //вариант 1 - за какое время при опред условии к строке ++ 9000 раз индекс
    //если строка изменяется 1-9 раз
    String s1 = "Exampl";
    long startTime = System.currentTimeMillis();
        for(int i = 0; i< 9000; i++){
        s1 += i; }
    long delta = System.currentTimeMillis() - startTime;
        System.out.println("String time: " + delta);

    //  вариант 2  быстрей
    StringBuilder sb = new StringBuilder("Exampl");
    startTime = System.currentTimeMillis();
        for(int i = 0; i< 9000; i++){
        sb.append(i); }
    delta = System.currentTimeMillis() - startTime;
        System.out.println("String  Builder time: " + delta);

    //  вариант 3 засинхронизированный метод
    StringBuffer stringBuffer = new StringBuffer("Exampl");
    startTime = System.currentTimeMillis();
        for(int i = 0; i< 9000; i++){
        stringBuffer.append(i); }
    delta = System.currentTimeMillis() - startTime;
        System.out.println("String Buffer time: " + delta);}



    // сравнение объектов на одинаковость 2 "Верно"
    private static void stringComparing2() {
        System.out.println("ВВеди: Hi >>>");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = scanner.next();
        String s4 = new String("Hi");
        String s5 = new String(s1);
        System.out.println(s1.equals(s2)); // true одинаковые значения
        System.out.println(s1.equals(s3));// true одинаковые значения
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
    }


    // сравнение объектов на одинаковость 1
    // Для сравнения строк не использовать двойное равно System.out.println(s1 ==s4);
    private static void stringComparing1(){
        System.out.println("ВВеди: Hi >>>");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = scanner.next();
        String s4 = new String("Hi");
        //String s5 = new String(s1);
        String s5 = new String(s1).intern();// при  выводе будет тру из за intern()

        System.out.println(s1 ==s2); // true одинаковые значения
        System.out.println(s1 == s3);// false строка и сканер(ссылка) разные объекты
        System.out.println(s1 ==s4);
        System.out.println(s1 ==s5);
    }

}


