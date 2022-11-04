import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int X;
        System.out.println("Enter an integer: ");
        X=sin.nextInt();
        System.out.println("The number in binary is: ");
        while (X>0) {
            System.out.println(X%2);
            X/=2;
        }
    }
}
