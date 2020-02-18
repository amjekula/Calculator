import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first Number: ");
        int x = input.nextInt();

        System.out.print("Enter second Number: ");
        int y = input.nextInt();

        add(x,y);
    }

    public static int add(int x, int y){
        int sum = 0;

        sum = x + y;
        System.out.print("\nSum: " + sum);

        return sum;
    }

}
