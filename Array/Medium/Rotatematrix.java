public class Rotatematrix {
    public void rotate(int[][] mat){
        int n=mat.length;

        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
       Rotatematrix r=new Rotatematrix();
       int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
       r.rotate(mat);
   } 
}
