import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of rows/column: ");
        int row_columns = scan.nextInt();
        int[][] arr= new int[row_columns][row_columns];
        System.out.println("Enter the Elements of square matrix: ");
        for (int row = 0; row < row_columns; row++) {
            for (int col = 0; col < row_columns; col++) {
                arr[row][col]=scan.nextInt();
            }
        }

        int refSum=0;
        for (int row = 0; row < row_columns; row++) {
            refSum+=arr[0][row];
        }

        for (int row = 0; row < row_columns; row++) {
            int rowSum=0,columnSum=0;
            for (int col = 0; col < row_columns; col++) {
                rowSum+=arr[row][col];
                columnSum+=arr[col][row];
            }
            if(rowSum!=refSum || columnSum!=refSum){
                System.out.println("Matrix is not a Magic Square");
                return;
            }
        }

        int forwardDiagonalSum=0,backwardDiagonalSum=0;
        for (int row = 0; row < row_columns; row++) {
            forwardDiagonalSum+=arr[row][row];
            backwardDiagonalSum+=arr[row_columns -row-1][row_columns -row-1];
        }
        if(forwardDiagonalSum!=refSum || backwardDiagonalSum!=refSum){
            System.out.println("Matrix is a not a Magic Square");
            return;
        }

        System.out.println("Matrix is a Magic Square");
    }
}