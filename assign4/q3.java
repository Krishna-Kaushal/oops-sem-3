public class q3 {
    public static double computeCorrelationFactor(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length || arr1.length < 2) {
            throw new IllegalArgumentException("Arrays must have the same length and at least two elements");
        }

        int[] trend1 = getTrend(arr1);
        int[] trend2 = getTrend(arr2);

        int matchedTrends = 0;
        for (int i = 0; i < trend1.length; i++) {
            if (trend1[i] == trend2[i]) {
                matchedTrends++;
            }
        }

        return (double) matchedTrends / trend1.length;
    }

    private static int[] getTrend(int[] arr) {
        int[] trend = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            trend[i - 1] = arr[i] > arr[i - 1] ? 1 : 0;
        }
        return trend;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6};
        double correlationFactor = computeCorrelationFactor(arr1, arr2);
        System.out.println(correlationFactor); // Output: 1.0
    }
}