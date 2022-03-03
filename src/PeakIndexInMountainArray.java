public class PeakIndexInMountainArray {
    public static int findPeak(int arr[]){
        //take the initial start and end point
        int start=0;
        int end= arr.length-1;
        while(start<end){
            //find the mid point of the array
            int mid= start+(end-start)/2;
            //if mid element is greater than the mid+1, then element lies in left side of the array
            // move end to mid;
            if(arr[mid]>arr[mid+1]){
                end=mid;
                //element lies in the right side of the array
            }else{
                start=mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,2,1};
        System.out.println(findPeak(arr));
    }
}
