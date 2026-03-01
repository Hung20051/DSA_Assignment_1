public class PerformanceTest {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] largeArray = new int[size];
        for (int i = 0; i < size; i++)
            largeArray[i] = i;

        long start = System.nanoTime();
        linearSearch(largeArray, -1);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        binarySearch(largeArray, -1);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}
