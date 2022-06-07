import java.util.Scanner;

public class Q36 {

    static boolean checkPrime(int number)
    {
        boolean isPrime=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth term of prime number");
        int n=sc.nextInt();
        int primeCount=1;
        int number=2;
        while(primeCount<n)
        {
            if(checkPrime(++number))
            {
                primeCount++;
            }
        }
        System.out.println(n+"th prime number is "+number);
    }
}