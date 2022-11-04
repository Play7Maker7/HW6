import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        double balance , interest ;
        int years=0;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter balance: ");
        balance=sin.nextDouble();
        System.out.println("Enter interest: ");
        interest=sin.nextDouble();
        double X = balance;
        while(X < 1000000)
        {
         X+=balance*(interest/100);
         years++;
        }
        System.out.println("It takes "+years+" years to reach 1000000");
    }
}