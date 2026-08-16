import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr,int target){
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
               if(j>i+1 && arr[j]==arr[j-1]){
                continue;
               }
            int left=j+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[j]+arr[left]+arr[right];
                if(sum==target){
                    ans.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        FourSum f=new FourSum();
        int[] arr={1, -2, 3, 5, 7, 9};
        List<List<Integer>> ans=f.fourSum(arr,7);
        System.out.println(ans);
    }
}
