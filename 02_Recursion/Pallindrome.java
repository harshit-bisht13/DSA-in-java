public class Pallindrome {
    public boolean checkpallindrome(int i,String str){
        if(i>=str.length()/2){
            return true;
        }if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return checkpallindrome(i+1,str);
    }
    public static void main(String[] args) {
        Pallindrome p=new Pallindrome();
        System.out.println(p.checkpallindrome(0,"madam"));
    }
}
