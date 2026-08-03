public class GCD {
    public int findgcd(int n1,int n2){
        int n=Math.min(n1,n2);
        int gcd=1;
        for(int i=1;i<=n;i++){
            if(n1%i==0 &&n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        GCD g=new GCD();
        System.out.println(g.findgcd(6,10));
    }   
}
