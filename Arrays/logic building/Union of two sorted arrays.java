import java.util.*;
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            if(j>0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j]){
                ans.add(nums2[j]);
                j++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            if(i==0 || nums1[i]!=nums1[i-1]){ans.add(nums1[i]);}
            i++;
        }
        while(j<m){
            if(j==0 || nums2[j]!=nums2[j-1]){ans.add(nums2[j]);}
            j++;
        }
        int[] temp=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            temp[k]=ans.get(k);
        }
        return temp;
    }
}