
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions of the matrices
        System.out.print("Enter the number of rows of 1st matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of 1st matrix: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of rows of 2nd matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the number of columns of 2nd matrix: ");
        int cols2 = sc.nextInt();

        // Check if the dimensions match for matrix addition
        if (rows != row1 || cols != cols2) {
            System.out.println("Matrix addition not possible. The dimensions do not match.");
            System.exit(0); // Exit the program
        }

        // Declare two matrices and one for the result
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[row1][cols2];
        int[][] result = new int[rows][cols];

        // Read the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Read the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
