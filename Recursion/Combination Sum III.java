import java.util.*;
class Solution {
    public void generator(List<List<Integer>> ans,List<Integer> l1,int m,int target,int i){
        if(l1.size()==m && target==0){
            ans.add(new ArrayList<>(l1));
            return;
        }
        if(l1.size()>m || target<0){
            return;
        }
        for(int k=i;k<=9;k++){
            
            l1.add(k);
            generator(ans,l1,m,target-k,k+1);

            l1.remove(l1.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> l1=new ArrayList<>();
        generator(ans,l1,k,n,1);
        return ans;
    }
}