public class RearrangementBySign {
    public int[] rearrange(int[] arr){
        int[] ans=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
            }else{
                ans[pos]=arr[i];
                pos+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        RearrangementBySign r=new RearrangementBySign();
        int[] arr={2, 4, 5, -1, -3, -4};
        int[] ans=r.rearrange(arr);
        for(int x: ans){
            System.out.print(x+" ");
        }
    }    
}
