import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three digit number");
        int number= sc.nextInt();
        int rem,rev=0;
        while(number>0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
            System.out.print("Reverse of a number:");
            System.out.print(rev);


    }
}
