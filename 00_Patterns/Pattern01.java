class Pattern01{
    public void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern01 sol=new Pattern01();
        sol.pattern(5);
    }
}