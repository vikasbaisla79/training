import java.util.*;

public class Q43 {

    public static void no_of_likes(String[] arr){
        if(arr.length == 0) System.out.print("No one likes this");
        else if(arr.length == 1) System.out.print(arr[0]+" likes this");
        else if(arr.length == 2) System.out.print(arr[0]+" and "+arr[1]+" likes this");
        else if(arr.length == 3) System.out.print(arr[0]+", "+arr[1]+" and "+arr[2]+" likes this");
        else System.out.print(arr[0]+", "+arr[1]+" and "+(arr.length-2)+" others likes this" );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many people likes : ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter their names : ");
        for (int i=0;i<n;i++) arr[i] = sc.next();
        no_of_likes(arr);
    }
}