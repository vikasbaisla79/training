import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.print("Total number of Duplicate elements : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
        }
        System.out.print(count);
    }
}