public class Pattern14 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern14 p=new Pattern14();
        p.pattern(5);
    }
}
