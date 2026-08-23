public class CountNumberOfOccurences {
    public int count(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(first==-1){
            return -1;
        }
        low=0;
        high=n-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (last-first+1);
    }
    public static void main(String[] args) {
        CountNumberOfOccurences c=new CountNumberOfOccurences();
        int[] arr={0, 0, 1, 1, 1, 2, 3};
        System.out.println(c.count(arr,1));
    }
}
