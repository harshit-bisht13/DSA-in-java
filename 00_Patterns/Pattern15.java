public class Pattern15 {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern15 p=new Pattern15();
        p.pattern(5);
    }
}
