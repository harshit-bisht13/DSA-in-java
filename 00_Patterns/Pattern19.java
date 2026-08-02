public class Pattern19 {
    public void pattern(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            space-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern19 p=new Pattern19();
        p.pattern(5);
    }
}
