public class Pattern10 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=1;i<=(n-1);i++){
             for(int j=1;j<=(n-1)-i+1;j++){
                System.out.print("*");
             }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        Pattern10 p=new Pattern10();
        p.pattern(5);
    }
}
