public class MaximumConsecutiveOnes {
    public int find(int[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
                max=Math.max(count,max);
            }else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumConsecutiveOnes m=new MaximumConsecutiveOnes();
        int[] arr={0,1,0,0,2,30,1,1,0};
        System.out.println(m.find(arr));
    }
}
