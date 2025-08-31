public class MatrixOperations2 {
    public static void main(String[] args) {
        double[][] A = {{4,7},{2,6}};

        System.out.println("Transpose:");
        print(transpose(A));

        System.out.println("Determinant = " + determinant(A));

        System.out.println("Inverse:");
        double[][] inv = inverse(A);
        print(inv);
    }

    static double[][] transpose(double[][] A) {
        int n = A.length;
        double[][] T = new double[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                T[j][i] = A[i][j];
        return T;
    }

    static double determinant(double[][] A) {
        return A[0][0]*A[1][1] - A[0][1]*A[1][0];
    }

    static double[][] inverse(double[][] A) {
        double det = determinant(A);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1]/det;
        inv[0][1] = -A[0][1]/det;
        inv[1][0] = -A[1][0]/det;
        inv[1][1] = A[0][0]/det;
        return inv;
    }

    static void print(double[][] M) {
        for (double[] row : M) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
    }
}
