class Solution {
    public String removeOuterParentheses(String s) {
        // Your code goes here
        String ans="";
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
           char c=s.charAt(i);
           if (c == '(') {
                if (count > 0) {
                    ans = ans + c;
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans = ans + c;
                }
            }
           
        }
        return ans;
    }
}