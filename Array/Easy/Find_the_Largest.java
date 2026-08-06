public class Find_the_Largest {
    public int find(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Find_the_Largest f=new Find_the_Largest();
        int[] arr={1,2,3,4,6,4,7,0};
        System.out.println(f.find(arr));
    }
}
