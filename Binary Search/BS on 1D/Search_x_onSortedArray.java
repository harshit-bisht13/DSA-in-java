public class Search_x_onSortedArray {
    public int Search(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Search_x_onSortedArray s=new Search_x_onSortedArray();
        int[] arr={1,0,3,5,9,12};
        System.out.println(s.Search(arr,9));

    }    
}
