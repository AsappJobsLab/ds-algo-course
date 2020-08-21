/*
Inversion Count for an array indicates – how far (or close) the array is from being sorted. If an array is already sorted then the inversion count is 0. If an array is sorted in the reverse order that inversion count is the maximum.
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
Example:
The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Note: You are only allowed to use array data structure
 */
public class CountInversions {
    public static void main(String[] str){
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println("inversion count = " + countInversionBruteForce(arr));
        System.out.println("inversion count = " + countInversionEfficient(arr));
    }

    /*
    Simple Solution
    Time complexity: O(n*n)
    Space complexity: O(1)
     */
    public static int countInversionBruteForce(int[] a){
        int count = 0;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) count++;

        return count;
    }

    /*
    Efficient Solution
    Time complexity: O(n*log(n))
    Space complexity: O(1)
     */
    public static int countInversionEfficient(int[] a){
        // TODO: please update the efficient code here
        // Hint: think of process of merge sort.
        return 0;
    }
}
