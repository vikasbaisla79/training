import java.util.Scanner;

public class Q23 {
    static void Table(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" * "+i+" = "+number*i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        System.out.println("All Tables from 1 to "+number);
        for(int i=1;i<=number;i++)
        {
            Table(i);
        }
    }
}