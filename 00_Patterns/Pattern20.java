public class Pattern20 {
    public void pattern(int n){
        int space=2*(n-1);
        int spacee=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++ ){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
             for(int j=1;j<=spacee;j++){
            System.out.print(" ");
        }
            for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }
            spacee+=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern20 p=new Pattern20();
        p.pattern(5);
    }
}
