import java.util.Arrays;

public class LongestCommonPrefix { 
    public String longestCommonPrefix(String[] str) {
        StringBuilder s=new StringBuilder();
        Arrays.sort(str);
        char[] first=str[0].toCharArray();
        char[] last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            s.append(first[i]);
        }
        return s.toString();
    }
    public static void main(String[] args) {
        // Create an instance of Solution
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] input = {"interview", "internet", "internal", "interval"};
        String result = solution.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result); 
    }
}
