public class MountainArray {
    public static int checkInMountain(int arr[]){
        //take the initial start and end point
        int start=0;
        int end= arr.length-1;
        while(start<end){
            //find the mid point
            int mid= start+ (end-start)/2;
            //if mid element is greater than the mid+1 element, it means we are in the decreasing
//            part of the array. Thus, move the end to the mid which can be a possible ans i.e. greatest element
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                //alternatively, if we are in the increasing part of the array and mid+1 is greater tha  the mid element,
                // increase the start and take it to the mid+1 element which can be the possible ans.
                start=mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,7,6,5,4,3,2};
        System.out.println(checkInMountain(arr));
    }
}
