public class findElementThatAppearsOnce {
    public int find(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        findElementThatAppearsOnce f=new findElementThatAppearsOnce();
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(f.find(arr));
    }
}
