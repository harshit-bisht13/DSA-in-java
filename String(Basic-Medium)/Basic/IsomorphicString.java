import java.util.*;

public class IsomorphicString {
    public boolean isomorphicString(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsKey(replacement)){
                    map.put(original,replacement);
                }
                else{
                    return false;
                }
            }else{
                Character mappedCharacter=map.get(original);
                if(mappedCharacter!=replacement){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsomorphicString solution = new IsomorphicString();
  
          String s = "see";
          String t = "add";
  
          if (solution.isomorphicString(s, t)) {
              System.out.println("Strings are isomorphic.");
          } else {
              System.out.println("Strings are not isomorphic.");
          }
    }
}
