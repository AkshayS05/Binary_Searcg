public class FindCeiling {
    public static int findCeiling(int arr[], int target){
        //take the initial end and start points
        int start= 0;
        int end= arr.length-1;
        //if last element is less than the target return -1 as there is
        // no element greater than the target element present in the array
            if(arr[end]<target){
                return -1;
            }

        while(start<=end){
        int mid= start+ (end-start)/2;
        if(arr[mid]==target){
            //if target is present at the mid of the array
            return mid;
        }
        else if(arr[mid]<target){
            start= mid+1;
        }else{
            end= mid-1;
        }
        }
        //start becomes greater than the end element,
        // meaning start is the element just greater than the target element
        // which is not preent on the array
        return start;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,9,14,16,18,21};
        int ans= findCeiling(arr,22);
        System.out.println(ans);
    }
}
