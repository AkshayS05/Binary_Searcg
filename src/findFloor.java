public class findFloor {
    public static int findFloor(int arr[], int target){
        //take the initial start and end points
        int start= 0;
        int end= arr.length-1;

        while(start<=end){
            //find out the mid using the below formula as it will not exceed the highest int value.
            int mid= start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        //if target is not present and start becomes greater than the end
//        return the end as it will be just smalled than the target
        return end;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,9,14,16,18,21};
        int ans= findFloor(arr,15);
        System.out.println(ans);
    }
}



