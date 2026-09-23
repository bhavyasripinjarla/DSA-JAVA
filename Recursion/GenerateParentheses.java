import java.util.*;
class Solution{
    public void generator(ArrayList<String> ans,int n,int open,int close,String s){
        if(2*n==s.length()){
            ans.add(s);
            return;
        }
        if(open<n){
            generator(ans,n,open+1,close,s+"(");
        }
        if(close<open){
            generator(ans,n,open,close+1,s+")");
        }
    }
    public ArrayList<String> generateParentheses(int n){
        ArrayList<String> ans=new ArrayList<String>();
        generator(ans,n,0,0,"");
        return ans;
    }
    public void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        System.out.print(generateParentheses(n));
    }
}