public class Prime {
    public boolean isPrime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n%i!=i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Prime p=new Prime();
        System.out.println(p.isPrime(11));
    }
}
