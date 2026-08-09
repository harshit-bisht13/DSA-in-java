public class Longest_Subarray_WIth_Given_Sum_k {
    public int longest(int[] arr,int k){
        int n=arr.length;
        int left=0;
        int right=0;
        int sum=0;
        int max=0;
        while(right<n){
            sum+=arr[right];
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                max=Math.max(max,right-left-1);
            }
            right++;
        }
        return max;

    }
    public static void main(String[] args) {
        Longest_Subarray_WIth_Given_Sum_k l=new Longest_Subarray_WIth_Given_Sum_k();
        int[] arr={10,5,2,7,1,9};
        int k=15;
        System.out.println(l.longest(arr,k));
    }
}
