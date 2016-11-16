
package Ex3;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Human Orechov = createHuman();
        printInfo(Orechov);
        }

    private static Human createHuman() {
        Scanner scanner = new Scanner(System.in);
        Human h = new Human();
        System.out.print("Please enter name of new human: ");
        h.name = scanner.nextLine();
        System.out.print("Please enter secondName of new human: ");
        h.secondName = scanner.nextLine();
        System.out.print("Please enter age of new human: ");
        h.age = scanner.nextInt();

        if (h.age<0){
            System.out.println("Please enter a valid age");
        }

        return h;

    }
    private static void printInfo(Human human) {
        System.err.println("Name: " + human.name);
        System.err.println("SecondName: " + human.secondName);
        System.err.println("Age: " + human.age);

    }

}



