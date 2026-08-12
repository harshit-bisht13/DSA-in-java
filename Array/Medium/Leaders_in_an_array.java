import java.util.*;
public class Leaders_in_an_array {
    public List<Integer> leader(int[] arr){
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(max<arr[i]){
                max=Math.max(max,arr[i]);
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        Leaders_in_an_array l=new Leaders_in_an_array();
        int[] arr={1, 2, 5, 3, 1, 2};
        List<Integer> list=l.leader(arr);
        System.out.println(list);
    }
}
