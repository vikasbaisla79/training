import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marital status");
        String ms =sc.next();
        if(ms.equalsIgnoreCase("married"))
        {
            System.out.println("You are insured by the company");
        }
        else
        {
            System.out.println("Enter Gender");
            String gender=sc.next();
            System.out.println("Enter age");
            int age=sc.nextInt();
            if(gender.equalsIgnoreCase("male"))
            {
                if(age>30)
                {
                    System.out.println("You are insured by the company");
                }
                else
                {
                    System.out.println("You are not insured by the company");
                }
            }
            else if(gender.equalsIgnoreCase("female"))
            {
                if(age>25)
                {
                    System.out.println("You are insured by the company");
                }
                else
                {
                    System.out.println("You are not insured by the company");
                }
            }
        }
    }
}