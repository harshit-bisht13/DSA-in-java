public class Remove_duplicates_from_SortedArray {
    public int removeDuplicates(int[] arr){
        int i=0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Remove_duplicates_from_SortedArray r=new Remove_duplicates_from_SortedArray();
        int[] arr={1,1,2,3,4,5,6};
        System.out.println(r.removeDuplicates(arr));
    }
}
