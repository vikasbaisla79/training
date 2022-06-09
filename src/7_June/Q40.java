import java.util.*;

public class Q40 {

    public static void main(String[] args) {

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

        }
        catch (ArithmeticException e)
        {
            System.out.println("Y not to be equal to zero provide another value for y");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}