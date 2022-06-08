import java.util.*;

public class Q40 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            try{
                System.out.print("Enter First Number :X =");
                int x = new Integer(sc.nextInt());
                System.out.print("Enter Second Number :Y =");
                int y = new Integer(sc.nextInt());
                System.out.println(""+(x/y));
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Input");
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

}