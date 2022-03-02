public class BinarySearch {
    public static int binarySearch(int arr[],int target){
        int start=0;
        int end= arr.length-1;

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
    public static void main(String[] args) {
        int arr[]= {-10,-2,2,4,6,8,12,20,23,24,26,28,35};
        int ans=binarySearch(arr,12);
        System.out.println(ans);
    }
}
