class Solution {    
    public boolean prefix(String[] s,String res){
        for(String str:s){
            if(!str.startsWith(res)){
                return false;
            }
        }
        return true;
    }
    public String longestCommonPrefix(String[] str) {
        if(str.length==0) return "";
        if(str.length==1) return str[0];
        //your code goes here
        int n=str.length;
        String res="";
        for(int i=0;i<str[0].length();i++){
            res=res+str[0].charAt(i);
            if(!prefix(str,res)){
                return res.substring(0,res.length()-1);
            }
        }
        return str[0];
    }
}