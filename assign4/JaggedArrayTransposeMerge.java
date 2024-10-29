import java.util.Scanner;

public class JaggedArrayTransposeMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Jagged Array:");
        printJaggedArray(jaggedArray);

        int[][] transpose = transposeJaggedArray(jaggedArray);
        System.out.println("\nTransposed Jagged Array:");
        printJaggedArray(transpose);

        int[][] mergedArray = mergeJaggedArrays(jaggedArray, transpose);
        System.out.println("\nMerged Jagged Array:");
        printJaggedArray(mergedArray);
    }

    public static int[][] transposeJaggedArray(int[][] jaggedArray) {
        int rows = jaggedArray.length;
        int maxCols = 0;
        for (int[] row : jaggedArray) {
            maxCols = Math.max(maxCols, row.length);
        }

        int[][] transpose = new int[maxCols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                transpose[j][i] = jaggedArray[i][j];
            }
        }
        return transpose;
    }

    public static int[][] mergeJaggedArrays(int[][] arr1, int[][] arr2) {
        int rows = Math.max(arr1.length, arr2.length);
        int[][] merged = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int col1 = (i < arr1.length) ? arr1[i].length : 0;
            int col2 = (i < arr2.length) ? arr2[i].length : 0;
            merged[i] = new int[col1 + col2];
            System.arraycopy(arr1[i], 0, merged[i], 0, col1);
            System.arraycopy(arr2[i], 0, merged[i], col1, col2);
        }
        return merged;
    }

    public static void printJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}