import java.util.*;
class Solution {
    public void generator(int n,List<String> ans,String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        generator(n,ans,s+"0");
        if( s.isEmpty() || s .charAt(s.length()-1)!='1'){
            generator(n,ans,s+"1");
        }
    }
    public List<String> generateBinaryStrings(int n) {
        // Your code goes here
        List<String> ans=new ArrayList<String>();
        generator(n,ans,"");
        return ans;
    }
}