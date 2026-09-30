class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        int m=0;
        while(m<s.length() && s.charAt(m)=='0'){
            m++;
        }
        int n=s.length();
        if(m>=n) return "";
        for(int i=n-1;i>=m;i--)
        {
            int k=s.charAt(i)-'0';
            if(k%2!=0){
                return s.substring(m,i+1);
            }
        }
        return "";
    }
}