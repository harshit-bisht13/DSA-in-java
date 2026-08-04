import java.util.ArrayList;

public class Print_all_Divisor {
    public int[] divisors(int n){
        ArrayList <Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        } 
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Print_all_Divisor p=new Print_all_Divisor();
        int[] ans=p.divisors(4);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
