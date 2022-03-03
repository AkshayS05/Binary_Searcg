public class InfiniteArray {
public static int findRange(int arr[],int target){
    //find the initial start and end point
    int start=0;
    int end=1;
    //find the new start and new end if the target lies outside the current start and current end
    while(target>arr[end]){
        int newStart= end+1;
        //doubling the window
       end= end+ (end-start+1)*2;
       start= newStart;
    }
    //when the target lies between the search window, call the binary search.
    return binarySearch(arr,target,start,end);
}
public static int binarySearch(int arr[],int target, int start, int end){
    while(start<=end){
        int mid= start+ (end-start)/2;
        if(target> arr[mid]){
            start= mid+1;
        }
        else if(target<arr[mid]){
            end=mid-1;
        }else{
            return mid;
        }
    }
    return -1;
}
    public static void main(String[] args) {
    //taking an input array
        int arr[]= {1,12,22,23,24,25,26,27,34,35,38,58,59,60};
        System.out.println(findRange(arr,58));
    }
}
