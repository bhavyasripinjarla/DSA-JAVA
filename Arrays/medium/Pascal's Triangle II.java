import java.util.*;
class Solution {
    public int[] pascalTriangleII(int r) {
        int[] t=new int[r];
        List<Integer> w=new ArrayList<>();
        for(int i=0;i<r;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) a.add(1);
                else {
                    int k=w.get(j);
                    int l=w.get(j-1);
                    a.add(k+l);
                }
            }
            w=a;
        }
        for(int m=0;m<r;m++){
            t[m]=w.get(m);
        }
        return t;
    }
}