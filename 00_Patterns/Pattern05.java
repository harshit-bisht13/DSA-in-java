public class Pattern05 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern05 p=new Pattern05();
        p.pattern(5);
    }
}
