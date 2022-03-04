public class RotatedArray {
    public static int findRotatedArray(int arr[], int target){
        //find the pivot. the greatest number.By doing so we will be able to move
        // in left or right direction of the array
       int pivot= findPivot(arr);
        //if pivot ==-1; meaning array is not rotated at all
        //call the simple binary search
        if(pivot ==-1) {
            return binarySearch(arr, target, 0, arr.length-1);
            //if the target element is the pivot element also that is the greatest element in the array
            //then return pivot index
        } else if(arr[pivot]==target){
               return pivot;
            }
        //if target element is greater less than the ist element of the array,
//        it will also be less than the pivot element, thus search from pivot+1 till end
        else if(target<arr[0]){
            return binarySearch(arr,target,pivot+1,arr.length-1);
            //if target element is greater than the start element, it would be somewhere brtween start to pivot -1.
            //as we have alreay checked the case of pivot==target, thus search from 0 till pivot -1;
        }else{
            return binarySearch(arr,target,0,pivot-1);
        }

    }
    public static int binarySearch(int arr[],int target, int start, int end) {
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end= mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;
    }

    public static int findPivot(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            //mid element index should be les than the end element. This is because is
            //mid is let's say the last element, then there will be no mid+1, thus check if end>mid
            if(end>mid &&arr[mid]>arr[mid+1]){
                return mid;
                //mid indec should be greater than the start element. This is because if mid-1 doesn't exist
                // the mid is the ist and last element
            }if(mid >start &&arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            //if mid element is less than that of the start element , the search window would be from start to mid-1 only
            if(arr[mid]<=arr[start]){
                end=mid-1;
                }else{
                //in opposite case, if mid element index is greater than that of start element,
                // the greatest element lies in the right side of the array
                start= mid+1;
            }
        }
        //if array is not rotated at all.
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2,3};
        System.out.println(findRotatedArray(arr,1));
    }
}
