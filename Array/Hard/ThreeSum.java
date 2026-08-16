import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] arr,int target){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    ans.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ThreeSum t=new ThreeSum();
        int[] arr={2, -2, 0, 3, -3, 5};
        List<List<Integer>> list=t.threeSum(arr,0);
        System.out.println(list);
    }    
}
