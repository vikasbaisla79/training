import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting value of interval: ");
        int low = sc.nextInt();
        System.out.print("Enter the ending value of interval:");
        int high = sc.nextInt();

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                originalNumber /= 10;
                digits++;
            }

            originalNumber = number;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }
}