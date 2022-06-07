import java.util.Scanner;

public class Q37 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the registration number");
        int reg_num =sc.nextInt();

        System.out.println(sum_of_digit(reg_num));
    }
    static boolean sum_of_digit(int reg_num)
    {
        int remainder, sum_even =0, sum_odd =0;
        while(reg_num >0){
            remainder = reg_num %10;

            if(remainder %2 ==0)
            {
                sum_even = sum_even + remainder;

            }
            else
            {
                sum_odd = sum_odd + remainder;
            }
            reg_num = reg_num /10;
        }
        return sum_even == sum_odd;
    }
}