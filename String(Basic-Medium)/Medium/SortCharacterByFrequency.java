import java.util.*;
public class SortCharacterByFrequency{  
    public List<Character> frequencySort(String s) {
        // Your code goes here
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
            List<Character> list=new ArrayList<>(map.keySet());
            list.sort((a,b)->{if(map.get(a)!=map.get(b)){
                return map.get(b)-map.get(a);
            }
            return a-b;
    });
      return list;

    }
    public static void main(String[] args) {
        SortCharacterByFrequency sol = new SortCharacterByFrequency();
        String s = "tree";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);  
    }
}