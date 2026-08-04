public class Armstrong {
    public boolean checkArmstrong(int n){
        int count =0;
        int original=n;
        int temp=n;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=n;
        int a=0;
        while(temp>0){
            int digit=temp%10;
            a+=Math.pow(digit, count);
            temp/=10;
        }
        return a==original;
    }
    public static void main(String[] args) {
        Armstrong a=new Armstrong();
        System.out.println(a.checkArmstrong(151));
    }
}
