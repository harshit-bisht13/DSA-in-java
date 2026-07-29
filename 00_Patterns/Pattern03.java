public class Pattern03 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern03 p=new Pattern03();
        p.pattern(5);
    }
}
