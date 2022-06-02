import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int reverse =0;
        int temp =number;
        while(temp !=0)
        {
            int remainder = temp %10;
            reverse = reverse *10+ remainder;
            temp = temp /10;
        }
        if(reverse ==number)
        {
            System.out.println(number+" is a pallindrome number");
        }
        else
        {
            System.out.println(number+" is not a pallindrome number");
        }
    }
}