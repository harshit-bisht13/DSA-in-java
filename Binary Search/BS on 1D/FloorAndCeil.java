
import java.util.Arrays;

public class FloorAndCeil {
    public int[] find(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int floor=-1;
        int ceil=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return new int[]{target,target};
            }else if(arr[mid]<target){
                floor=arr[mid];
                low=mid+1;
            }else{
                ceil=arr[mid];
                high=mid-1;
            }
        }
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        FloorAndCeil f=new FloorAndCeil();
        int[] arr={3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(f.find(arr,5)));
    }    
}
