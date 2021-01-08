import java.util.Scanner;
import java.util.ArrayList;

class Expenses {
    private static Scanner input = new Scanner(System.in);

    private static int income, save, count;

    private static ArrayList < String > name = new ArrayList < String > (); // dynamic arrays instead of static ones.
    private static ArrayList < Integer > price = new ArrayList < Integer > (); // <-------------------------------------

    static void expenses() {
        System.out.print("Enter your income from all sources: ");
        income = input.nextInt();

        System.out.print("Enter your monthly savings: ");
        save = input.nextInt();

        System.out.print("Enter the number of items bought: ");
        count = input.nextInt();

        System.out.println("Enter the name and the price for the expense: ");

        for (int j = 0; j < count; j++) {
            System.out.print("Name: ");
            name.add(input.next());

            System.out.print("Price: ");
            price.add(input.nextInt());
        }
    }

    static void result() {
        price.forEach((n) -> save += n); // Just iterating through all n values of ArrayList price, and adding to save, instead of what you did!

        System.out.println("You have spent " + save + " this month!");
        System.out.println((save >= income) ? ((save - income) + " saved! Please spend less!") : ((income - save) + " saved! You have spent wisely!"));
    }

    public static void main(String[] args) {
        expenses();
        result();

        input.close(); // Closing the Scanner instance to prevent memory leakage.
    }
} // All within 50 lines of code, sweet isnt it?
