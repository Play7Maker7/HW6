import java.util.Scanner;

public class Q8_Follow {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int X , Y=0 , chk=0 , Z=0;
        System.out.println("Enter an integer: ");
        X=sin.nextInt();
        Y=X/2;
        Z=X;
        for (int c = 2; c <= X; c++) {
            for (int i = 2; i <= Y; i++) {
                if (X==0||X==1) X=2;
                if (X%i==0) {
                    chk=1;
                }
                else System.out.println(X);
            }
            X--;
        }
    }
}
