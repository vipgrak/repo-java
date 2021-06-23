public class HomeWorkApp {
    public static void main ( String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("_ Orange\n" + "_ Banana\n" + "_ Apple");
    }
    public static void checkSumSign(){
        int a = -10;
        int b = 5;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительна");
        else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor(){
     int value = 0;
     if (value <= 0)
         System.out.println("Красный");
     else if (value >0 && value <= 100)
         System.out.println("Желтый");
     else if (value > 100)
         System.out.println("Зеленый");
    }
    public static void compareNumbers(){
        int a = 2;
        int b = 2;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

    }
}
