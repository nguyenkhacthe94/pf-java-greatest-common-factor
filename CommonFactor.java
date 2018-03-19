import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) System.out.print("No greatest common fractor");
        else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.print("The greatest common factor: " + a);
        }
    }
}
