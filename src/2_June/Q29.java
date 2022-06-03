import java.util.Scanner;

public class Q29 {
    static int prime(int num)
    {
        int flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num % i == 0)
            {
                flag=1;
                break;
            }
        }
        if(flag ==0)
            return 1;
        else
            return 0;
    }
    static void alternate_prime(int n)
    {
        int counter=0;
        for(int num=2;num<n;num++)
        {
            if(prime(num) == 1)
            {
                if(counter %2 ==0)
                    System.out.print(num +" ");
                counter ++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        System.out.print("Alternate prime number are : ");
        alternate_prime(n);
    }
}