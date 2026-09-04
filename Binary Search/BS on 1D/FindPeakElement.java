public class FindPeakElement {
    public int findPeak(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        FindPeakElement f=new FindPeakElement();
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
       System.out.println(f.findPeak(arr));
    }
}
