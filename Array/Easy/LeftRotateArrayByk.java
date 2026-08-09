public class LeftRotateArrayByk {

    //Brute force approach

    // public int[] rotate(int[] arr,int k){
    //     int n=arr.length;
    //     k%=n;
    //     int[] temp=new int[k];
    //     for(int i=0;i<k;i++){
    //         temp[i]=arr[i];
    //     }
    //     for(int i=k;i<n;i++){
    //         arr[i-k]=arr[i];
    //     }
    //     int j=0;
    //     for(int i=n-k;i<n;i++){
    //         arr[i]=temp[j];
    //         j++;
    //     }
    //     return arr;
    // }

    //Optimal

    public int[] rotate(int[] arr, int k){
        int n=arr.length;
        k%=n;
        //Reverse firstt k elements
        int left=0;
        int right=k-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=k;
        right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=n-1;
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
        LeftRotateArrayByk l=new LeftRotateArrayByk();
        int[] arr={1,2,3,4,5,6,7};
        int[] ans=l.rotate(arr,3);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
