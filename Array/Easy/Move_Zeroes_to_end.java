public class Move_Zeroes_to_end {

    //Brute

    // public void move(int[] arr){
    //     int[] temp=new int[arr.length];
    //     int index=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=0){
    //             temp[index]=arr[i];
    //             index++;
    //         }
    //     }
    //     for(int i=0;i<temp.length;i++){
    //         System.out.print(temp[i]+" ");
    //     }
    // }
    
    //Optimal
    public void move(int[] arr){
        int j=-1;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Move_Zeroes_to_end m=new Move_Zeroes_to_end();
        int[] arr={0,1,0,3,2,0,7,9};
        m.move(arr);    
    }
}
