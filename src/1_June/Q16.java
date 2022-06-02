import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        int no_of_digits=0;
        int original;
        original =number;
        while (original !=0)
        {
            no_of_digits++;
            original = original /10;
        }
        original =number;
        int result =0;
        while (original !=0)
        {
            int remainder = original %10;
            result +=Math.pow(remainder,no_of_digits);
            original = original /10;
        }
        if(number== result)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }

    }
}