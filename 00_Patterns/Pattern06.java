public class Pattern06 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.err.print(j);
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        Pattern06 p=new Pattern06();
        p.pattern(5);
    }
}
