import java.util.*;
class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) a.add(1);
                else {
                    List<Integer> w=ans.get(i-1);
                    int k=w.get(j);
                    int l=w.get(j-1);
                    a.add(k+l);
                }
            }
            ans.add(a);
        }
        return ans;
    }
}