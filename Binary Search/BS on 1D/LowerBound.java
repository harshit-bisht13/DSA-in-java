public class LowerBound {
    public int lower(int[] arr, int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LowerBound l=new LowerBound();
        int[] arr={3,5,8,15,19};
        System.out.println(l.lower(arr,9));
    }    
}
