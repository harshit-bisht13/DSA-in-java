public class Pallindrome {
    public boolean isPallindrome(int n){
        int original=n;
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        if(rev==original){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Pallindrome p=new Pallindrome();
        System.out.println(p.isPallindrome(1));
    }    
}
