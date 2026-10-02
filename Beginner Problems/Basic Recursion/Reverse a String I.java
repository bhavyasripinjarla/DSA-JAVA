import java.util.ArrayList;
class Solution {
    public void helper(ArrayList<Character> s,ArrayList<Character> ans,int i){
        if(i<0) return;
        ans.add(s.get(i));
        helper(s,ans,i-1);
    }
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        ArrayList<Character> ans=new ArrayList<Character>();

        int i=s.size();

        helper(s,ans,i-1);

        return ans;
    }
}