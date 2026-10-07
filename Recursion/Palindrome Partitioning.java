import java.util.*;
class Solution {
    public void partioning(List<List<String>> ans,List<String> l1,String s,int i){
        if(i>=s.length()){
            ans.add(new ArrayList<>(l1));
            return;
        }

        for(int k=i;k<s.length();k++){
            if(ispalindrome(s,i,k)){
                l1.add(s.substring(i,k+1));
                partioning(ans,l1,s,k+1);
                l1.remove(l1.size()-1);
            }
        }
    }

    public boolean ispalindrome(String s, int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {

        List<List<String>> ans=new ArrayList<>();
        partioning(ans,new ArrayList<>(),s,0);
        return ans;
    }
}