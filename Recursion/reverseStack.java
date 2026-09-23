import java.util.*;
class Solution{
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        insertAtBottom(st,top);
    }
    public static void insertAtBottom(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top=st.pop();
        insertAtBottom(st, ele);
        st.push(top);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<5;i++){
            int n=s.nextInt();
            st.push(n);
        }
        reverseStack(st);
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}