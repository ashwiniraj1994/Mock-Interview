/**
 * Created by ashwinirajasekar on 12/13/17.
 */
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter The Number Of Columns");
        int col = sc.nextInt();
        int[][] matrix = new int[rows][col];
        int[][] transpose = new int[col][rows];
        System.out.println("Enter The Data For Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

