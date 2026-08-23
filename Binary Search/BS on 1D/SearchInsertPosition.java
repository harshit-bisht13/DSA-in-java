public class SearchInsertPosition {
    public int Search(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<=arr[mid]){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        SearchInsertPosition s=new SearchInsertPosition();
        int[] arr={1, 3, 5, 6};
        System.out.println(s.Search(arr,2));
    }    
}
