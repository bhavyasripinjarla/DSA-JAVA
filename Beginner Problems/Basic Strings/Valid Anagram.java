// class Solution {  
//     public boolean anagramStrings(String s, String t) {
//         //your code goes here
//         int n=s.length();
//         int m=t.length();
//         if(n!=m) return false;
//         char[] s1=s.toCharArray();
//         Arrays.sort(s1);
//         char[] t1=t.toCharArray();
//         Arrays.sort(t1);
//         for(int i=0;i<n;i++){
//             if(s1[i]!=t1[i]) return false;
//         }
//         return true;
//     }
// }
class Solution {  
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        int[] count=new int[26];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0) return false;
        }
        return true;
    }
}