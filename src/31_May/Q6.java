import java.util.Scanner;

public class Q6 {
    static double finalSalary(int basic)
    {
        double bonus;
        double TA,DA,HRA,PF;
        TA=0.1*basic;
        DA=0.15*basic;
        HRA=0.2*basic;
        PF=0.12*basic;
         if(basic >=20000)
         {
             bonus=0.1*basic;
         }
         else {
             bonus=0.2*basic;
         }
          double gross;
         gross= basic+DA+TA+HRA+bonus-PF;

         return gross;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary");
        int basic=sc.nextInt();
        System.out.println(finalSalary(basic));
    }
}
