public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {1, 3, 5, 7, 9},
            {2, 4, 6, 8, 10},
            {5, 10, 15, 20},
            {100, 200, 300},
            {7},
            {},
            {1, 2, 3, 4, 5},
            {10, 20, 30, 40, 50},
            {11, 22, 33, 44, 55},
            {1, 5, 9, 13, 17}
        };

        int[] targets = {7, 6, 20, 500, 7, 1, 3, 35, 44, 17};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Test " + (i + 1) +
                " → Index: " + binarySearch(arrays[i], targets[i]));
        }
    }
}
