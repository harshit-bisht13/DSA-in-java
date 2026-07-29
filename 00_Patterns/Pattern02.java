public class Pattern02 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern02 p=new Pattern02();
        p.pattern(5);
    }
}
