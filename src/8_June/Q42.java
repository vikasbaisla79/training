import java.util.*;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String with numeric character : ");
        String str = sc.next();
        String result = new String("");
        for(int i=0;i<str.length();i++){
            if(Character.getNumericValue(str.charAt(i)) < 5) {
                result += 0;
            }
            else
            {
                result += 1;
            }
        }
        System.out.println(result);
    }
}