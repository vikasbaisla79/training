import java.util.Scanner;

public class Q4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String number =sc.next();
        char[] num_in_ch = number.toCharArray();
        int fd =Integer.parseInt(String.valueOf(num_in_ch[0]));
        int ld =Integer.parseInt(String.valueOf(num_in_ch[num_in_ch.length-1]));
        int sum = fd + ld;
        System.out.println("Sum of first & last digit of number  "+ number +" :"+ sum);
    }
}