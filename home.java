import java.util.Scanner;
class home {
    static Scanner sc = new Scanner(System.in);
    static int total, a;
    static int inc, sav;
    static String[] name = new String[100];
    static int price[] = new int[100];
    static void income() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("enter your income from all sources");
        inc = sc.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }
    static void expenses() {
        System.out.println("enter your monthly savings");
        sav = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("enter the number of items bought");
        int i = sc.nextInt();
        System.out.println();
        System.out.println();
        a = i;
        System.out.println("enter the name and price for the expense");
        for (int j = 0; j < i; j++) {
            System.out.print("name: ");
            name[j] = sc.next();
            System.out.print("price: ");
            price[j] = sc.nextInt();
            System.out.println();
            System.out.println();
        }
    }
    static void display() {
        total = sav;
        for (int c = 0; c <= a; c++)
            total = total + price[c];
        System.out.println("you have spent " + total);
        if (total >= inc) {
            int bal;
            bal = total - inc;
            System.out.println("please reduce your expenses");
            System.out.println("you have spent " + bal + " more than your income");
        }
        if (total < inc) {
            int bal1;
            bal1 = inc - total;
            System.out.println("Congrats!!! you have saved " + bal1 + " from this month.hope you save more next month");

        }
    }
    public static void main(String[] args) {
        income();
        expenses();
        display();
    }
}
