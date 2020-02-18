import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first Number: ");
        int x = input.nextInt();

        System.out.print("Enter second Number: ");
        int y = input.nextInt();

        add(x,y);
        subtract(x,y);
        product(x,y);
        qoutient(x,y);
    }

    public static int add(int x, int y){
        int sum = 0;

            sum = x + y;
            System.out.print("\nSum: " + sum);

        return sum;
    }

    public static int subtract(int x, int y){
        int diff = 0;

        diff = x - y;
        System.out.print("\nDifference: " + diff);

        return diff;
    }

    public static int product(int x, int y){
        int prod = 0;

        prod = x * y;
        System.out.print("\nProduct: " + prod);

        return prod;

    }

    public static double qoutient(int x, int y){
        double qou = 0;

        qou = x / y;
        System.out.printf("\nQoutient: " + "%.1f%n", qou);

        return qou;

    }

}
