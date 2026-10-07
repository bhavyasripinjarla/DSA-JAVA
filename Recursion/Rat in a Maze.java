import java.util.ArrayList;
class Solution {
    public void helper(int i,int j,String s,int[][] vis,int[][] maze,int n,ArrayList<String> ans,int[] di,int[] dj){
        if(i==n-1 && j==n-1){
            ans.add(s);
            return;
        }
        String dir="DLRU";
        for(int k=0;k<4;k++){
            int ni=i+di[k];
            int nj=j+dj[k];
            if(ni>=0 && nj>=0 && ni<n && nj<n && maze[ni][nj]!=0 && vis[ni][nj]!=9){
                vis[i][j]=9;
                helper(ni,nj,s+dir.charAt(k),vis,maze,n,ans,di,dj);
                vis[i][j]=0;
            }
        }
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<String>();
        int n=maze.length;
        int m=maze[0].length;
        int[][] vis=new int[n][n];
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }
        int[] di={1,0,0,-1};
        int[] dj={0,-1,1,0};
        helper(0,0,"",vis,maze,n,ans,di,dj);
        return ans;
        
    }
}