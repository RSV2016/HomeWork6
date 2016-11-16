package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sors = new Scanner(System.in);
        int n = sors.nextInt();
        outputArray(inputArray(n));

    }

    public static int[] inputArray(int n){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static  void outputArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }

    }
}
