import java.util.*;
class Solution {
    public void solve(int idx,String num, int target,List<String> ans,long value,long prev,String s){
        if(idx==num.length()){
            if(value==target){
                ans.add(s);
                return;
            }
        }
        for(int i=idx;i<num.length();i++){
            String c=num.substring(idx,i+1);
            if(c.length()>1 && c.charAt(0)=='0') break;
            long n=Long.parseLong(c);
            if(idx==0){
                solve(i+1,num,target,ans,n,n,s+c);
            }
            else{
                solve(i+1,num,target,ans,value+n,n,s+'+'+c);
                solve(i+1,num,target,ans,value-n,-n,s+'-'+c);
                solve(i+1,num,target,ans,value-prev+prev*n,prev*n,s+'*'+c);
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        List<String> ans=new ArrayList<>();
        solve(0,num,target,ans,0,0,"");
        return ans;
    }
}