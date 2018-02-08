/**
 * Created by ashwinirajasekar on 12/13/17.
 */
import java.util.Scanner;
public class Matrix {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Number Of Rows");
            int row = sc.nextInt();
            System.out.println("Enter The Number Of Columns");
            int col = sc.nextInt();
            int[][] matrix = new int[row][col];
            System.out.println("Enter Matrix Data");
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Your Matrix is : ");
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
