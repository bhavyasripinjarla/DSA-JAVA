import java.util.*;
class Solution {
    public void generator(ArrayList<String> ans,char[] st,int i,String s){
        if(i>=st.length){
            ans.add(s);
            return;
        }
        generator(ans,st,i+1,s+st[i]);
        generator(ans,st,i+1,s);
    }
    public ArrayList<String> powerSet(String s) {
        // code here
        char[] st = s.toCharArray();
        ArrayList<String> ans=new ArrayList<String>();
        generator(ans,st,0,"");
        return ans;
    }
}