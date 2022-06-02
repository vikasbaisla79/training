import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle amount");
        double Principle=sc.nextFloat();
        System.out.println("Enter the Time period in years");
        double Time=sc.nextInt();

        double rate=5;
        double simple_interest=(Principle*Time*rate)/100;
        System.out.println(simple_interest);
    }
}
