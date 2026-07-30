public class Pattern09 {
    public void pattern(int n){
        for(int i=0;i<n;i++){
         //space
         for(int j=0;j<n-i-1;j++){
            System.err.print(" ");
            }
        //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern09 p=new Pattern09();
        p.pattern(5);
    }
}
