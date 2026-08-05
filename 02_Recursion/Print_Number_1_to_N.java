public class Print_Number_1_to_N {
    public void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Print_Number_1_to_N p=new Print_Number_1_to_N();
        p.print(5);
    }
}
