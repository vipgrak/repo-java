import java.util.Arrays;
import java.util.Scanner;

public class Lessen_3 {

    public static void main(String[] args) {
        // Задание_1
        int[] mass = {1, 0, 0, 1, 1, 0, 0, 1, 0, 1};
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]  == 1) {
                mass[i] = 0;
            }else {
                mass[i] = 1;
            }
        }
        System.out.println(Arrays.toString(mass));
        printArray();
        mass2();
        square();
        input();
        output();
        printValue();

}

    //Задание_2
    public static void printArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println();// Разделитель
        System.out.println(Arrays.toString(arr));
        System.out.println();// Разделитель
    }

    //Задание_3
    public static void mass2() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++){
            if (a[i] < 6 ){
                a[i]= (a[i] * 2);
            }
        }
        System.out.println(Arrays.toString(a));
            }
    // Задание_4
    public static void square(){
        int[][] mass3 = new int[3][3];
        for (int i = 0; i < mass3.length; i++){
            for (int j = 0; j < mass3.length; j++) {
                if (i == j) {
                    mass3[i][j] = 1;
                } else
                    mass3[i][j] = 0;
                }
            }
        System.out.println();//Разделитель
        for (int i = 0; i < mass3.length; i++) {
            System.out.println(Arrays.toString(mass3[i]));
        }
        }
        //Задание_5
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int len = scanner.nextInt();
        int initialValue = scanner1.nextInt();
        int[] mass4 = new int[len];
        for (int i = 0; i < mass4.length; i++){
            mass4[i] = initialValue;
        }
        System.out.println(Arrays.toString(mass4));
    }
    //Задание_6
    public static void output(){
        int[]mass5 = {21,50,100,25,5};
        int min = mass5[0];
        int max = mass5[0];
        for (int i = 0; i < mass5.length; i++){
            if (mass5[i] < min){
                min = mass5[i];
            }else if (mass5[i] > max){
                max = mass5[i];
            }
        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);
    }
    // Задание_7
    public static void printValue(){
        int[] mass6 ={1,1,1,2,1};
        int a = mass6[0] + mass6[1] + mass6[2];
        int b = mass6[3] + mass6[4];
        for (int i = 0; i < mass6.length; i++);
      boolean sum = (a == b);
      System.out.println(sum);
    }

    }














