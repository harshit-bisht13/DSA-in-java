import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] arr,int target){
        int n=arr.length;
        int[][] num=new int[n][2];

        //Stores values with original index
        for(int i=0;i<n;i++){
            num[i][0]=arr[i];
            num[i][1]=i;
        }

        Arrays.sort(num, (a, b) -> Integer.compare(a[0], b[0]));

        int left=0;
        int right=n-1;
        int sum=0;
        while(left<right){
            sum=num[left][0]+num[right][0];
            if(sum==target){
                return new int[]{num[left][1],num[right][1]};
            }else if (sum<target) {
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        TwoSum t=new TwoSum();
        int[] arr={1, 6, 2, 10, 3};
        int[] ans=t.twoSum(arr,7);
        for(int x: ans){
            System.out.print(x+" ");
        }
    }
}
