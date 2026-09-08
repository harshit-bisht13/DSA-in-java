public class Largest_Odd_Number_in_a_String {
    public String large_odd_number(String s){
        int index=-1;
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                index=i;
                break;
            }
        }
        if(index==-1){
            return "";
        }
        int i=0;
        while(i<=index && s.charAt(i)=='0'){
            i++;
        }
        return s.substring(i,index+1);
    }
    public static  void main(String[] args){
        Largest_Odd_Number_in_a_String solution = new Largest_Odd_Number_in_a_String();
        String num = "504";
        String result = solution.large_odd_number(num);
        System.out.println("Largest odd number: " + result);
    }
}
