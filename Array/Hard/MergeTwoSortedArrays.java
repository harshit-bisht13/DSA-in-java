import java.util.*;
public class MergeTwoSortedArrays {
    public void merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int left=n-1;
        int right=0;
        while (left>=0 && right<m) { 
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        MergeTwoSortedArrays m=new MergeTwoSortedArrays();
        int[] arr1={-5, -2, 4, 5};
        int[] arr2={3, 1, 8};
        m.merge(arr1,arr2);

    }    
}
