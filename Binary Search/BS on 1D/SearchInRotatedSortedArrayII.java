public class SearchInRotatedSortedArrayII {
    public boolean search(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=k && k<arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=k &&  k<arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInRotatedSortedArrayII s= new SearchInRotatedSortedArrayII();
        int[] arr={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(s.search(arr,3));
    }
}
