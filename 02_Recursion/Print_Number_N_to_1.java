public class Print_Number_N_to_1 {
    public void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
public static void main(String[] args) {
    Print_Number_N_to_1 p=new Print_Number_N_to_1();
    p.print(5);
}    
}
