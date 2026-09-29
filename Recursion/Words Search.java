class Solution {
    public boolean find(char[][] board,String word,int i,int j,int idx){
        int n=board.length;
        int m=board[0].length;

        if(idx==word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=n || j>=m || board[i][j]=='$') return false;

        if(board[i][j]!=word.charAt(idx)) return false;

        char temp=board[i][j];

        board[i][j]='$';

        int[][] dim={{-1,0},{0,1},{1,0},{0,-1}};

        for(int[] d : dim){
            int new_i=i+d[0];
            int new_j=j+d[1];
            if(find(board,word,new_i,new_j,idx+1)){
                return true;
            }
        }

        board[i][j]=temp;

        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && find(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
}