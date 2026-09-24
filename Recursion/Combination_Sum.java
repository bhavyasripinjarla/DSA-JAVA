import java.util.*;
class Solution{
    public void generator(int[] arr,List<List<Integer>> ans,List<Integer> l1,int target,int i){
        if(i>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(l1));
            }
            return;
        }

        if(arr[i]<=target){
            l1.add(arr[i]);
            generator(arr,ans,l1,target-arr[i],i);
            l1.remove(l1.size()-1);
        }
        generator(arr,ans,l1,target,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> l1 =new ArrayList<Integer>();
        generator(candidates,ans,l1,target,0);
        return ans;
    }
}