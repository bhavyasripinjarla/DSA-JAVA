import java.util.*;
class Solution {
     public void generator(List<String> ans,StringBuilder temp,String digits,int i,Map<Integer,String> map){
        if(i>=digits.length()){
            ans.add(temp.toString());
            return;
        }

        int n= digits.charAt(i)-'0';
        String s=map.get(n);

        for(int k=0;k<s.length();k++){
            temp.append(s.charAt(k));
            generator(ans,temp,digits,i+1,map);
            temp.deleteCharAt(temp.length()-1);
        }


    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        List<String> ans=new ArrayList<>();

        generator(ans,new StringBuilder(),digits,0,map);
        return ans;
    }
}