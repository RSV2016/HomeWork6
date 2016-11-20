package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть розмір масиву: "); //код в порядке, но пользователь должен понимать, что от него хотят.
        Scanner sors = new Scanner(System.in);
        int n = sors.nextInt();
        outputArray(inputArray(n));

    }

    public static int[] inputArray(int n){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+ i +"] = ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static  void outputArray(int[] ar){
        System.out.print("arr: ");
        for (int i = 0; i < ar.length; i++) {

            System.out.print(ar[i]);
            if (i < ar.length-1){
                System.out.print(", ");//Убрана запятая после вывода массива.
            }
        }

    }
}
