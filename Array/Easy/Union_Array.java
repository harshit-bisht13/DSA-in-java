
import java.util.ArrayList;

public class Union_Array {
    // public int[] union(int arr1[], int arr2[]){
    //     HashSet<Integer> set= new HashSet<>();
    //     int n= arr1.length;
    //     int m=arr2.length;
    //     for(int i=0;i<n;i++){
    //         set.add(arr1[i]);
    //     }
    //     for(int i=0;i<m;i++){
    //         set.add(arr2[i]);
    //     }
    //     int[] ans=new int[set.size()];
    //     int i=0;
    //     for(int x:set){
    //         ans[i]=x;
    //         i++;
    //     }
    //     return ans;
    // }

    // Optimal
    public int[] union(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> union=new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i<n1) { 
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
        }
        while(j<n2){
             if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
        }
        int[] ans=new int[union.size()];
        int a=0;
        for(int x:union){
            ans[a]=x;
            a++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Union_Array u=new Union_Array();
        int[] arr1={2,3,4,5,6};
        int[] arr2={1,2,3,4,7};
        int[] ans=u.union(arr1, arr2);
        for(int x: ans){
            System.out.print(x+" ");
        }
    }
}
