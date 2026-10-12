//optimal approach
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                long sum = (long) nums[i] + nums[j] + nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> a=new ArrayList<>();
                    a.add(nums[i]);a.add(nums[j]);a.add(nums[k]);
                    ans.add(a);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(k>j && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}

// //better approach is to sort the array and use two pointer approach
// import java.util.*;
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         HashSet<List<Integer>> ans=new HashSet<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             HashSet<Integer> map=new HashSet<>();
//             for(int j=i+1;j<n;j++){
//                 int req=-(nums[i]+nums[j]);
//                 if(map.contains(req)){
//                     List a=new ArrayList<>();
//                     a.add(nums[i]);a.add(nums[j]);a.add(req);
//                     Collections.sort(a);
//                     ans.add(a);
//                 }
//                 map.add(nums[j]);
//             }

//         }
//         return new ArrayList<>(ans);
//     }
// }