public class SingleElement_in_a_SortedArray {
    public int single(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                low=mid+2;
            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        SingleElement_in_a_SortedArray s=new SingleElement_in_a_SortedArray();
        int[] arr={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(s.single(arr));
    }
}
