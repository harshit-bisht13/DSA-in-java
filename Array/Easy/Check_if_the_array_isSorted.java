public class Check_if_the_array_isSorted {
    public boolean check(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Check_if_the_array_isSorted c= new Check_if_the_array_isSorted();
        int[] arr={1,2,3,4,5,0};
        System.out.println(c.check(arr));
    }    
}
