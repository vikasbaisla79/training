import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        int actual_days = sc.nextInt();
        int no_of_months= actual_days /30;
        int no_of_left_days = actual_days %30;
        System.out.println(actual_days +" days can be said like "+no_of_months+" months and "+ no_of_left_days +" days");
    }
}