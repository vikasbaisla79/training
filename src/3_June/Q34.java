import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int firstLargest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=0;
                }
            }
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest elements of array are "+arr[1]);
    }
}