public class WorstCaseTest {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search
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
        int size = 100000;
        int[] arr = new int[size];

        // Sorted array
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        int target = -1; // target NOT present

        long start, end;

        // Linear Search execution
        start = System.nanoTime();
        int linearResult = linearSearch(arr, target);
        end = System.nanoTime();
        System.out.println("Linear Search Result: " + linearResult);
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        // Binary Search execution
        start = System.nanoTime();
        int binaryResult = binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search Result: " + binaryResult);
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}
//c) Time Complexity Comparison
//
//Linear Search checks elements one by one from the beginning of the array until the target is found.
//
//Best case: O(1) (target is the first element)
//
//Average case: O(n)
//
//Worst case: O(n) (target not in the array)
//
//Binary Search works only with sorted arrays and repeatedly divides the search space in half.
//
//        Best case: O(1)
//
//Average case: O(log n)
//
//Worst case: O(log n)
//
//Binary Search is more efficient for large sorted datasets because it reduces the search range by half each step, while Linear Search must check each element sequentially.
//
//        d) Test Case Categories by Array Size
//
//Test cases were grouped into three categories:
//
//Small array (10 elements)
//Both algorithms run very fast and the difference is small.
//
//Medium array (1,000 elements)
//Linear Search takes longer because it checks elements sequentially, while Binary Search finds the target faster.
//
//Large array (100,000 elements)
//Linear Search may scan the entire array, but Binary Search only needs about log₂(n) comparisons.
//
//Execution results show that Binary Search performs significantly faster than Linear Search for large arrays.
//e) Worst-case scenario analysis
//Linear Search
//
//Worst-case scenario for Linear Search happens when the target value does not exist in the array.
//
//        In this situation, the algorithm must check every element from the beginning to the end of the array before concluding that the target is not present.
//
//For an array with n elements, Linear Search will perform n comparisons in the worst case.
//
//Time complexity:
//
//O(n)
//
//Example:
//
//Array:
//
//        [0, 1, 2, 3, 4, 5, ..., 99999]
//
//Target:
//
//        -1
//
//Since -1 is not in the array, the algorithm must examine all elements before returning -1.
//
//This is considered the worst case because the algorithm performs the maximum number of operations.
//
//        Binary Search
//
//Worst-case scenario for Binary Search also occurs when the target value is not present in the sorted array.
//
//Binary Search repeatedly divides the search space into half until the search interval becomes empty.
//
//Even though the target does not exist, the algorithm still reduces the search range step by step.
//
//For an array with n elements, Binary Search performs approximately:
//
//log2(n)
//
//comparisons in the worst case.
//
//Time complexity:
//
//O(log n)
//
//Example:
//
//Array:
//
//        [0, 1, 2, 3, 4, 5, ..., 99999]
//
//Target:
//
//        -1
//
//The algorithm will keep dividing the array until the search interval becomes invalid (left > right), and then return -1.
//
//Conclusion
//
//Although both algorithms reach their worst-case scenario when the target is not present, their performance differs significantly.
//
//Linear Search must check every element in the array, resulting in O(n) time complexity.
//
//Binary Search reduces the search space by half each iteration, resulting in O(log n) time complexity.
//
//Therefore, Binary Search is significantly more efficient than Linear Search for large sorted datasets.