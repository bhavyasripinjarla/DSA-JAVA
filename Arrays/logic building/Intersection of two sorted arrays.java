import java.util.ArrayList;
class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] temp=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            temp[k]=ans.get(k);
        }
        return temp;
    }
}