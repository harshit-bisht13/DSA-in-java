public class Anagram { 
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        s=s.toLowerCase();
        t=t.toLowerCase();
        s=s.replace(" ","");
        t=t.replace(" ","");
        if(s.length()!=t.length()){
            return false;
        }
        int[] bucket=new int[26];
        for(int i=0;i<s.length();i++){
            bucket[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            bucket[s.charAt(i)-'a']--;
        }
        for(int count: bucket){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram a=new Anagram();
         String Str1 = "INTEGER";  
        String Str2 = "TEGERNI";  

    
        if (a.anagramStrings(Str2, Str2)) 
            System.out.println("True");  
        else 
            System.out.println("False");
    }
}

