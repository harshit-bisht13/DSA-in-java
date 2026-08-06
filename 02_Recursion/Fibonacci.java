public class Fibonacci {
    public int check(int n){
        if(n==0 || n==1){
            return n;
        }
        return check(n-2)+check(n-1);
    }
    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        System.out.println(f.check(6));
    }
}
