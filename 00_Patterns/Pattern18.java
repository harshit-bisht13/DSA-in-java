public class Pattern18 {
    public void pattern(int n){
        for(int i=0;i<n;i++){
            char ch=(char)('A'+n-i-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern18 p=new Pattern18();
        p.pattern(5);
    }
}
