class Solution {   
    public boolean helper(String s,int i,int j){
        
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return helper(s,i+1,j-1);
    }
    public boolean palindromeCheck(String s) {
        //your code goes here
        int i=0,j=s.length()-1;
        return helper(s,i,j);
    }
}