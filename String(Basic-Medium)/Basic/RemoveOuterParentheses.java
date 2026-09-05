public class RemoveOuterParentheses {
    public String remove(String str){
        StringBuilder s=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                count--;
                if(count>0){
                    s.append(str.charAt(i));
                }
            }else if(str.charAt(i)=='('){
                if(count>0){
                    s.append(str.charAt(i));
                }
                count++;
            }
        }
        return  s.toString();
    }
public static void main(String[] args) {
    RemoveOuterParentheses r=new RemoveOuterParentheses();
    String str="((()))";
    System.out.println(r.remove(str));   
    }
}
