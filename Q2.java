import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int sum=0 , a , b , c=0 , X , Y=0 , Z , odd;

        //a:
        Scanner sin = new Scanner(System.in);
        System.out.println("The sum of all even numbers between 2 and 100: ");
        for (int i = 1; i < 100; i++) {
            if (i%2==0) sum+=i;
        }
        System.out.println(sum);


        //b:
        System.out.println("\n\nEnter 2 numbers: ");
        a= sin.nextInt();
        b=sin.nextInt();
        System.out.println("The sum of all odd numbers between "+a+" and "+b+" is: ");
        for (int i = (a+1); i < b; i++) {
            if (i%2!=0) c+=i;
        }
        System.out.println(c);



        //c:
        System.out.println("\n\nEnter a number: ");
        X=sin.nextInt();
        Z=X;
        while (X>0)
        {
            odd=X%10;
            if (odd%2!=0) Y+=X%10;
            X=X/10;
        }
        System.out.println("The sum of all odd numbers in: "+Z+" is: "+Y);
    }
}