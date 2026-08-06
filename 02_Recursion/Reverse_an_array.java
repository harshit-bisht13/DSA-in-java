public class Reverse_an_array {
    public int[] reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--; 
        }
        return arr;
    }
    public static void main(String[] args) {
        Reverse_an_array r=new Reverse_an_array();
        int[] arr={1,2,3,4,5};
        int[] ans=r.reverse(arr);
        for(int x: ans){
            System.out.print(x+" ");
        }
    }
}
