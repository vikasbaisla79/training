import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter any Sentence : ");
        String your_sentence =scan.nextLine();

        int maxSum=0;
        String Weighed_Word ="";
        for(String str: your_sentence.split(" ") )
        {
            int sum=0;
            for(int i=0; i<str.length(); i++)
                sum+=str.charAt(i)-97+1;
            if(maxSum<sum)
            {
                maxSum=sum;
                Weighed_Word =str;
            }
        }

        System.out.print("The highest weighed word: "+ Weighed_Word);



    }

}