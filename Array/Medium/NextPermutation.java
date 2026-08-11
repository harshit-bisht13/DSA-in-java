public class NextPermutation {
    public int[] next(int[] arr){
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[i]>=arr[j]){
                j--;
            }
            int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;

             int left=i+1;
             int right=n-1;
             while(left<right){
                int tem=arr[left];
                arr[left]=arr[right];
                arr[right]=tem;
                left++;
                right--;
             }

        }
        return arr;
    }
    public static void main(String[] args) {
        NextPermutation n=new NextPermutation();
        int[] arr={1,2,3};
        int[] ans=n.next(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
