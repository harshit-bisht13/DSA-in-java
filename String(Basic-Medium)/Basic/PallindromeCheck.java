public class PallindromeCheck {
    public String reverse(String str){
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            StringBuilder word=new StringBuilder();
            while(i<s.length() && s.charAt(i)!=' '){
                word.append(s.charAt(i));
                i++;
            }
            word.reverse();
            if(word.length()>0){
                if(ans.length()>0){
                    ans.append(" ");
                }
                ans.append(word);
            }
        }
        return ans.toString();
    }
public static void main(String[] args) {
    PallindromeCheck p=new PallindromeCheck();
    String str="Welcome to the Jungle";
    System.out.println(p.reverse(str));
}    
}
