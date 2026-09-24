import java.util.*;
class Solution {
    public void generator(int[] candidates,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> l1,int target,int i){
        if(target==0){
            ans.add(new ArrayList(l1));return;
        }
        for(int k=i;k<candidates.length;k++){
            if(k>i && candidates[k]==candidates[k-1]) continue;
            if(candidates[k]>target) break;
            l1.add(candidates[k]);
            generator(candidates,ans,l1,target-candidates[k],k+1);
            l1.remove(l1.size()-1);
        }

    }
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        ArrayList<Integer> l1=new ArrayList<Integer>();
        generator(arr,ans,l1,target,0);
        return ans;
    }
}