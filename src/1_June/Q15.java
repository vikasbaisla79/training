import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int factorial=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number: ");
        int number=sc.nextInt();
        if(number>0)
        {
            for(int i=number;i>1;i--)
            {
                factorial=factorial*i;
            }
            System.out.println("Factorial of "+number+" is "+factorial);
        }
        else{
            System.out.println("invalid input");
        }
    }
}
