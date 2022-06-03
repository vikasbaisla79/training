import java.util.Scanner;

class Num_Factors{
    Num_Factors(int num){
        for(int i=1;i<=num;i++){
            if(num%i ==0){
                System.out.print(i+" ");
            }
        }
    }
}
public class Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num =sc.nextInt();
        Num_Factors obj1= new Num_Factors(num);
    }
}