public class RotateString {
    public boolean rotate(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        String doubleds=s+s;
        return doubleds.contains(goal);
    }
    public static void main(String[] args) {
        RotateString r=new RotateString();
        System.out.println(r.rotate("rotation", "tionrota"));
    }
}
