public class Pattern17 {
    public void pattern(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            //space
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<(2*i+1)/2){
                    ch++;
                }else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern17 p=new Pattern17();
        p.pattern(5);
    }
}
