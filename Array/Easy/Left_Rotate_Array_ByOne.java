public class Left_Rotate_Array_ByOne {
    public void rotate(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Left_Rotate_Array_ByOne l=new Left_Rotate_Array_ByOne();
        int[] arr={1,2,3,4,5,6};
        l.rotate(arr);
    }
}
