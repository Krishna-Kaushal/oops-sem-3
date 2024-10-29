import java.util.Arrays;

public class q4 {
    public static double[][] computeCorrelationMatrix(int[][] matrix) {
        int n = matrix.length;
        double[][] correlationMatrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double correlation = computePearsonCorrelation(matrix[i], matrix[j]);
                correlationMatrix[i][j] = correlation;
                correlationMatrix[j][i] = correlation; // Symmetric matrix
            }
        }
        return correlationMatrix;
    }

    private static double computePearsonCorrelation(int[] x, int[] y) {
        int n = x.length;

        double sumX = Arrays.stream(x).sum();
        double sumY = Arrays.stream(y).sum();

        double sumX2 = Arrays.stream(x).map(value -> value * value).sum();
        double sumY2 = Arrays.stream(y).map(value -> value * value).sum();

        double sumXY = 0;
        for (int i = 0; i < n; i++) {
            sumXY += x[i] * y[i];
        }

        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));

        return numerator / denominator;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        double[][] correlationMatrix = computeCorrelationMatrix(matrix);

        // Print the correlation matrix
        for (int i = 0; i < correlationMatrix.length; i++) {
            for (int j = 0; j < correlationMatrix[i].length; j++) {
                System.out.printf("%.2f ", correlationMatrix[i][j]);
            }
            System.out.println();
        }
    }
}