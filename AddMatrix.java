import java.util.Scanner;

public class AddMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the size 
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        
        Integer[][] matrix1 = new Integer[rows][cols];
        Integer[][] matrix2 = new Integer[rows][cols];
        Integer[][] resultMatrix = new Integer[rows][cols];

        // Input for the first matrix
        System.out.println("Enter elements of first matrix:");
        input(matrix1, sc);

        // Input for the second matrix
        System.out.println("Enter elements of second matrix:");
        input(matrix2, sc);
        
        // Perform matrix addition
        addMatrices(matrix1, matrix2, resultMatrix);

        // Display the resulting matrix
        System.out.println("Resulting Matrix after addition:");
        display(resultMatrix);

        sc.close();
    }

    // Method to take input for a matrix
    public static void input(Integer[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to add two matrices
    public static void addMatrices(Integer[][] matrix1, Integer[][] matrix2, Integer[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    // Method to display a matrix
    public static void display(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
