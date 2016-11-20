package Ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human orechov = createHuman();
        orechov.printInfo();
    }

    private static Human createHuman() {
        Scanner scanner = new Scanner(System.in);
        Human h = new Human();

        System.out.print("Please enter name of new human: ");
        h.name = scanner.nextLine();
        System.out.print("Please enter secondName of new human: ");
        h.secondName = scanner.nextLine();

        do {
            System.out.print("Please enter age of new human: ");
            h.age = scanner.nextInt();
            if (h.age<=0){
                System.out.println("Please enter a valid age");
            }
        } while (h.age<=0);
        return h;
    }
}



