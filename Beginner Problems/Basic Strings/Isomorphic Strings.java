class Solution {
    public boolean isomorphicString(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()) return false;
        int[] s1=new int[26];
        int[] t1=new int[26];
        for(int i=0;i<s.length();i++){
            int c1=s.charAt(i)-'a';
            int c2=t.charAt(i)-'a';
            if(s1[c1]!=t1[c2]){
                return false;
            }
            s1[c1]=i+1;
            t1[c2]=i+1;
        }
        return true;
    }
}