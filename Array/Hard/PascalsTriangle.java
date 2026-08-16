public class PascalsTriangle {
    public int pascal(int row,int col){
        int res=1;
        int r=row-1;
        int c=col-1;
        c=Math.min(c,r-c);
        for(int i=0;i<c;i++){
            res=res*(r-i)/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        PascalsTriangle p=new PascalsTriangle();
        System.out.println(p.pascal(4,2));

    }    
}
