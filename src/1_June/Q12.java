import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stating Interval range");

        int Start_Interval=sc.nextInt();
        System.out.println("Enter the ending Interval range");
        int End_Interval = sc.nextInt();

        while (Start_Interval < End_Interval) {
            boolean flag = false;

            for(int i = 2; i <= Start_Interval /2; ++i) {
                if(Start_Interval % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && Start_Interval != 0 && Start_Interval != 1)
                System.out.print(Start_Interval + " ");

            Start_Interval++;
        }
    }
}