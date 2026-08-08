public class LinearSearch {
    public int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch l=new LinearSearch();
        int[] arr={1,2,3,4,5,6,6,7};
        System.out.print(l.search(arr,7));
    }    
}
