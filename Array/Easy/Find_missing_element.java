public class Find_missing_element {
    public int find(int[] arr){
        int n=arr.length;
        int expected_sum=n*(n+1)/2;
        int actual_sum=0;
        for(int i=0; i<n;i++){
            actual_sum+=arr[i];
        }
        return expected_sum-actual_sum;
    }
    public static void main(String[] args) {
        Find_missing_element f=new Find_missing_element();
        int[] arr={1,0,3,4,5};
        System.out.println(f.find(arr));

    }
}
