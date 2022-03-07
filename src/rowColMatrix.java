import java.util.Arrays;

public class rowColMatrix {

    public static int[] searchInMatrix(int arr[][],int target){
        //initial row and col position. In which row is at 0 and col is at last to
        // shrink the window as per the requirement
        int row=0;
        int col= arr.length-1;
        //while row is less tha  or equal to the last row and col is greater than or ewual to the ist col
        while(row<arr.length && col >=0){
            //if we find the target
            if(arr[row][col]==target){
                return new int[] {row,col};
                //if let's sat target is 37, and row is at 0 and col is at arr.length-1 that is the last
                // if arr[row][col] is greater than target, the whole col will be greater in the sorted matrix,
                // thus eliminate the whole column
            }else if (arr[row][col]>target){
                col--;
                //if arr[row][col] is less than the target, it depicts that all the elements in that row
                // will be smaller than the target, thus eliminate the whole row.
            }else{
                row++;
            }
        }
        //if target is not present in the matrix, it will return -1,-1 after the condition breaks.
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[][]= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        System.out.println(Arrays.toString(searchInMatrix(arr, 37)));
    }
}
