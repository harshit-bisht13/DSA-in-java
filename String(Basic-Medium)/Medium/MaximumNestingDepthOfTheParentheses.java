public class MaximumNestingDepthOfTheParentheses{
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                count--;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses m=new MaximumNestingDepthOfTheParentheses();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = m.maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}