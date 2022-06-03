import java.util.Scanner;

public class Q25 {

    static void fibonacciTraingle(int No_Of_Terms)
    {
        int f1 =1, f2 =1;
        if(No_Of_Terms ==1)
        {
            System.out.print(f1 +" ");
            return;
        }
        if(No_Of_Terms ==2)
        {
            System.out.print(f1 +" "+ f2 +" ");
            return;
        }
        System.out.print(f1 +" ");
        System.out.print(f2 +" ");
        for(int i = 3; i<= No_Of_Terms; i++)
        {
            int c= f1 + f2;
            System.out.print(c+" ");
            f1 = f2;
            f2 =c;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range for fibonacci triangle");
        int trinagleRange=sc.nextInt();
        for(int i=1;i<=trinagleRange;i++)
        {
            fibonacciTraingle(i);
            for(int j=1;j<=trinagleRange-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}