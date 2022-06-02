import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three  angles of triangle: a ,b ,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((Valid(a, b, c)) == 1) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static int Valid(int a, int b, int c) {
        if (a + b + c == 180 && a != 0 && b != 0 && c != 0)
            return 1;
        else
            return 0;
    }
}
