public class Pattern13 {
    public void pattern(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern13 p=new Pattern13();
        p.pattern(5);
    }
}
