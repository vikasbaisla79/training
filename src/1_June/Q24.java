import java.util.Scanner;

public class Q24{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base=sc.nextInt();
        System.out.print("Enter the Power of base:");
        int power=sc.nextInt();
        int result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        System.out.println("Result =  " + result);
    }
}