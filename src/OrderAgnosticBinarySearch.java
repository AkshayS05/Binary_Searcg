public class OrderAgnosticBinarySearch {
    public static int orderAgnosticBS(int arr[],int target){
        int start= 0;
        int end= arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
            if(arr[mid]<target){
                    start=mid+1;
                }else if(arr[mid]>target){
                    end=mid-1;
                }
            }
        else{
                if(arr[mid]>target){
                    start=mid+1;
                }else if(arr[mid]<target){
                    end=mid-1;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]= {100,68,54,43,30,29,21,17,12,5,4};
        int ans= orderAgnosticBS(arr,21);
        System.out.println(ans);
    }
}
