    public class Lessen_2 {

    public static void main(String[] args){
    boolean flag = Sum(5,6);
    System.out.println(flag);
    printWhatNamber(0);
    boolean chek = printValue(5);
    System.out.println(chek);
        printMessage(5,"Hello!");
        boolean answer = printYear(2020);
        System.out.println(answer);
}
        // Задание_1

    public static boolean Sum(int a,int b){
    int sum = a + b;
    return (sum >= 10 && sum <= 20);
}
    // Задание_2

    public static void printWhatNamber(int namber){
    if (namber >= 0){
        System.out.println("Положительное число");
    }
    else {
        System.out.println("Отрицательное число");
        }
     }
     //Задание_3

     public static boolean printValue(int value) {
         return (value <= 0);
    }
    // Задание_4

        public static void printMessage(int count, String message){
        //Вариант_1
//        int counter = 0;
//        while (counter < count){
//            System.out.println(message);
//            counter++;
      //  }
            // Вариант_2
        for (int couter = 0; couter < count; couter++){
            System.out.println(message);
        }
        }
        // Задание_5

    public static boolean printYear(int year){
         return (year % 4 ==0 && year % 100 !=0 || year % 400 ==0 );
    }
     }

