public class Count_all_digits {
    public int countt(int n){
        int count=0;
        if(n==0){
            return 0;
        }
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Count_all_digits c=new Count_all_digits();
        System.out.println("Count:"+c.countt(876));
        
    }
}
