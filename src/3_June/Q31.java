import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n= sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.print("Enter the elements of array :");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.print("Elements of actual array :");
        for(int i:arr1)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("Elements of new array :");
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
    }
}