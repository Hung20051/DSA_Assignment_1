public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
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
            {9, 8, 7, 6, 5},
            {1, 2, 3, 4, 5, 6, 7},
            {50, 40, 30, 20, 10},
            {11, 22, 33, 44, 55}
        };

        int[] targets = {7, 10, 15, 500, 7, 1, 6, 8, 30, 44};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Test " + (i + 1) +
                " → Index: " + linearSearch(arrays[i], targets[i]));
        }
    }
}
