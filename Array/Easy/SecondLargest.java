public class SecondLargest {
    public int find(int[] arr){
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]<=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest; 
    }
    public static void main(String[] args) {
        SecondLargest s=new SecondLargest();
        int[] arr={1,2,3,4,5,0,6,9};
        System.out.println(s.find(arr));
    }    
}
