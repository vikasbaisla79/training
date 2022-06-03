public class Q32 {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,5,3,2,7,8};
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