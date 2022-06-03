import java.util.Scanner;

public class Q26{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int no_of_term =sc.nextInt();
        int F0 =0;
        int F1 =1;
        System.out.println("Fibonacci series are :");
        System.out.print(F0 +" "+ F1 +" ");
        for(int i = 1; i<= no_of_term -2; i++)
        {
            int Fn = F0 + F1;
            System.out.print(Fn +" ");
            F0 = F1;
            F1 = Fn;
        }
    }
}
