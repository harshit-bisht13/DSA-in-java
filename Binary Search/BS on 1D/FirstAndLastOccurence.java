import java.util.*;
public class FirstAndLastOccurence {

    public int[] find(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]> target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(first==-1){
            return new int[]{-1,-1};
        }
        low=-1;
        high=n;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[] {first,last};
    }
    public static void main(String[] args) {
        FirstAndLastOccurence obj=new FirstAndLastOccurence();
        int[] arr={5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(obj.find(arr,8)));
    }    
}
