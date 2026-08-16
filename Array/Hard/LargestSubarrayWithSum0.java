import java.util.HashMap;

public class LargestSubarrayWithSum0 {
    public int largest(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max=Math.max(max,i+1);
            }else{
                if(map.containsKey(sum)){
                    max=Math.max(max,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    } 
    public static void main(String[] args) {
        LargestSubarrayWithSum0 l=new LargestSubarrayWithSum0();
        int[] arr={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(l.largest(arr));
    }    
}
