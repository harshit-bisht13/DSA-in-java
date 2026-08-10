public class KadaneAlgo {
    public int maxSum(int[] arr){
         int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            // if(sum<0){
            //     sum=0;
            // }
        }
        return max;
    }
    public static void main(String[] args) {
       KadaneAlgo k= new KadaneAlgo();
       int[] arr={2, 3, 5, -2, 7, -4};
       System.out.println(k.maxSum(arr));
    }
}
