import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numberOfElements; i++) {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }

        System.out.println("Number of unique elements in an array : "+set.size());
    }
}