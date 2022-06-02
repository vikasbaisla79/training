import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int reverse_number=0;
        while(number!=0)
        {
            int remainder =number%10;
            reverse_number=reverse_number*10+ remainder;
            number=number/10;
        }
        System.out.println("Reverse number is "+reverse_number);
    }
}
