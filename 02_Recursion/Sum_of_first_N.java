class Sum_of_first_N{
    public int checksum(int n){
        if(n==1){
            return 1;
        }
        return n+checksum(n-1);
    }
    public static void main(String[] args) {
        Sum_of_first_N s=new Sum_of_first_N();
        System.out.println("Sum: "+s.checksum(1));
    }
}