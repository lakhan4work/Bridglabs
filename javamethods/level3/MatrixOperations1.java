import java.util.Scanner;

public class MatrixOperations1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};

        int[][] sum = add(A,B);
        int[][] diff = subtract(A,B);
        int[][] prod = multiply(A,B);

        System.out.println("Addition:");
        print(sum);
        System.out.println("Subtraction:");
        print(diff);
        System.out.println("Multiplication:");
        print(prod);
    }

    static int[][] add(int[][] A,int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    static int[][] subtract(int[][] A,int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    static int[][] multiply(int[][] A,int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                for (int k=0;k<n;k++)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }

    static void print(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
