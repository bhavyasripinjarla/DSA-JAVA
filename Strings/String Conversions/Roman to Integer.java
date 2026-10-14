import java.util.*;
class Solution {
    public int romanToInt(String s) {
        // Your code goes here
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int ans=map.get(s.charAt(n-1));
        int p=ans;
        for(int i=n-2;i>=0;i--){
            char c=s.charAt(i);
            int t=map.get(c);
            if(t>=p){
                ans+=t;
            }else{
                ans-=t;
            }
            p=t;
        }
        return ans;
    }
}