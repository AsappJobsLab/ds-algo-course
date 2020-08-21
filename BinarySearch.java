public class BinarySearch {
    public static void main(String[] str){
        int arr[] = {1,2,3,4,5,6,7,8};
        int searchValue = 3;
        searchElementIteratively(arr,searchValue);
        System.out.println("value found in the array? (iterative way) = " + searchElementIteratively(arr,searchValue));
        System.out.println("value found in the array? (recursive way) = " + searchElementRecursively(arr,0,arr.length-1,10));
    }
    /*
    Binary Search (Iterative approach).
    Time complexity: O(log(n))
    Space complexity: O(1) // in-place searching
     */
    public static boolean searchElementIteratively(int[] arr, int val){
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while(leftIndex <= rightIndex){
            int midIndex = leftIndex + (rightIndex - leftIndex)/2;
            if(arr[midIndex] == val){
                return true;
            }else if(arr[midIndex] > val){
                rightIndex = midIndex - 1;
            }else{
                leftIndex = midIndex + 1;
            }
        }
        return false;
    }

    /*
    Binary Search (Recursive approach).
    Time complexity: O(log(n))
    Space complexity: O(log(n)) // in-place searching
     */
    public static boolean searchElementRecursively(int[] arr, int leftIndex, int rightIndex, int val){
        // base condition
        if(leftIndex > rightIndex) return false;
        int midIndex = leftIndex + (rightIndex - leftIndex)/2;
        if(arr[midIndex] == val){
            return true;
        }else if(arr[midIndex] > val){
            return searchElementRecursively(arr,leftIndex,midIndex - 1,val);
        }else{
            return searchElementRecursively(arr,midIndex+1,rightIndex,val);
        }
    }
}
