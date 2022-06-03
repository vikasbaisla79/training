public class Q31 {
    public static void main(String[] args) {
        int arr1[]=new int[]{ 5,122,13,16,17};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.print("Elements of actual array (arr1) :");
        for(int i:arr1)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("Elements of new array (arr2) :");
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
    }
}