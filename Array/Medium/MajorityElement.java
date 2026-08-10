public class MajorityElement{
    public int majority(int[] arr){
        int element=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }
            else if(element==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                count1++;
            }
        }
        if(count1>n/2){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        MajorityElement m=new MajorityElement();
        int[] arr={2, 2, 1, 1, 1, 1,2, 1,2};
        System.out.println(m.majority(arr));
    }
}
