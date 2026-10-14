class Solution {
    public int myAtoi(String input) {
        // Your code goes here
        int n=input.length();
        int i=0;
        while(i<n && input.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;
        int sign=1;
        if(input.charAt(i)=='-'){
            i++;
            sign=-1;
        }else if(input.charAt(i)=='+'){
            i++;
        }

        long ans=0;
        while(i<n && Character.isDigit(input.charAt(i))){
            int c=input.charAt(i)-'0';
            ans=ans*10+c;
            if(sign<0 && -ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign>0 && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (ans*sign);
    }
}