import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String X;
        int Y=0;
        System.out.println("Write a word: ");
        X = sin.next();
        for (int i = (X.length() - 1); i >= 0; i--) {
            if (X.charAt(i)=='a'||X.charAt(i)=='e'||X.charAt(i)=='i'||X.charAt(i)=='o'||X.charAt(i)=='u'||
                    X.charAt(i)=='y'||X.charAt(i)=='A'||X.charAt(i)=='E'||X.charAt(i)=='I'||X.charAt(i)=='O'||
                    X.charAt(i)=='U'||X.charAt(i)=='Y') Y++;
        }
        System.out.println("There are "+Y+" Vowels in "+X+".");
    }
}
