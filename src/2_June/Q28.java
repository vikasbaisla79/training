import java.util.Scanner;

public class Q28{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =sc.nextInt();
        printTable(number,10);
    }
    static void printTable(int number, int n){
        if (n==0)
            return;
        printTable(number,n-1);
        System.out.println(number +" X "+n+" = "+ number *n);
    }
}