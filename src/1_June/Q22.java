import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" X "+i+" = "+number*i);
        }
    }
}