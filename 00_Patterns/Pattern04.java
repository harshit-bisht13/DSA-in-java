public class Pattern04 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern04 p=new Pattern04();
        p.pattern(5);
    }
}
