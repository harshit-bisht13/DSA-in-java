import java.util.*;
public class MajorityElement2 {
    public List<Integer> majority(int[] arr){
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==ele1){
                count1++;
            }
            else if(arr[i]==ele2){
                count2++;
            }
            else if(count1==0){
                count1=1;
                ele1=arr[i];
            }
            else if(count2==0){
                count2=1;
                ele2=arr[i];
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele1){
                count1++;
            } if(arr[i]==ele2){
                count2++;
            }
        }
        if(count1>n/3){
            ans.add(ele1);
        }if(count2>n/3){
            ans.add(ele2);
        }
        return ans;
    }
    public static void main(String[] args) {
        MajorityElement2 m=new MajorityElement2();
        int[] arr={1, 2,1, 2, 1, 2,3};
        List<Integer> ans=m.majority(arr);
        System.out.println(ans);
    }   
}
