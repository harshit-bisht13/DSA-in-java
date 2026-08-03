public class Reverse_a_number {
    int rev=0;
    public int reverse(int n){
        if(n<=9){
            return n;
        }
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Reverse_a_number r=new Reverse_a_number();
        System.out.println("Number after reversal: "+r.reverse(876));
    }    
}
