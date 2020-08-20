/*
Given an array, A of size N consisting of elements 1 to N. A boolean array B consisting of N-1 elements indicates that if B[i] is 1, then A[i] can be swapped with A[i+1].
Find out if A can be sorted by swapping elements.
Examples:
Input : A[] = {1, 2, 5, 3, 4, 6}
    	B[] = {0, 1, 1, 1, 0}
Output: A can be sorted
We can swap A[2] with A[3] and then A[3] with A[4].

Input : A[] = {2, 3, 1, 4, 5, 6}
    	B[] = {0, 1, 1, 1, 1}
Output : A can not be sorted
We can not sort A by swapping elements as 1 can never be swapped with A[0]=2.
 */
public class SwapAdjacentElements {
    public static void main(String[] str){
        int arrA[] = {2, 3, 1, 4, 5, 6};
        int arrB[] = {0, 1, 1, 1, 1};
        swapAdjacentElements(arrA,arrB);
        System.out.println("can array A be sorted? = " + swapAdjacentElements(arrA,arrB));
    }

    /*
    Efficient Solution
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static boolean swapAdjacentElements(int[] a, int[] b){
        for(int i=0; i<a.length-1; i++){
            if(b[i] == 1){
                if(a[i] != i+1) {
                    // swap a[i] and a[i+1]
                    a[i] = a[i] + a[i+1];
                    a[i+1] = a[i] - a[i+1];
                    a[i] = a[i] - a[i+1];
                }
            }
        }

        // check if array is sorted for not
        for(int i=0; i<a.length; i++){
            if(a[i] != i+1) return false;
        }

        return true;
    }
}
