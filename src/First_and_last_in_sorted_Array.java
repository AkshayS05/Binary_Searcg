import java.util.Arrays;

public class First_and_last_in_sorted_Array {
    public static int[] findFirstAndLast(int[] arr, int target){
        int[] ans={-1,-1};
        //check for the first occurrence of a target
         ans[0]= search(arr,target, true);
//         if first occurrence is found then only find the last occurrence
         if((ans[0] != -1)){

            ans[1] = search(arr, target, false);
        }
//         will either return -1 and -1
//        or will return the first and last index of the target
    return ans;
    }
    public static int search(int arr[],int target, boolean searchStart){
        int ans=-1;
        int start=0;
        int end= arr.length-1;

        while(start<=end) {
            //find the mid index
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                //if we are searching for the start index of the target
                if (searchStart) {
                    end = mid - 1;
                    // if we are searching the end index of the target
                } else {
                    start = mid + 1;
                }
            }
        }
            return ans;
        }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,4,4,5,5,6,7,8,9,9};
        int ans[]=(findFirstAndLast(arr, 4));
        System.out.println(Arrays.toString(ans));
    }
}
