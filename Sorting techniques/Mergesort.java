import java.util.Arrays;
public class Mergesort {
    
    public void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] larr=new int[n1];
        int[] rarr=new int[n2];

        for(int i=0;i<n1;i++){
            larr[i]=arr[low+i];
        }
         for(int i=0;i<n2;i++){
            rarr[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Mergesort m=new Mergesort();
        int[] arr={3,5,2,1,6,4};
        m.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
