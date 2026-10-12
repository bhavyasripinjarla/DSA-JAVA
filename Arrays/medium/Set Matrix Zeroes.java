//Approach 1
class Solution {
    public void setZeroes(int[][] matrix) {
        // Your code goes here
        int n=matrix.length;
        int m=matrix[0].length;

        boolean[] row=new boolean[n];
        boolean[] col=new boolean[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
//Approach 2
// class Solution {
//     public void setcol(int[][] matrix,int col,int n){
//         for(int i=0;i<n;i++){
//             if(matrix[i][col]!=0)
//             {matrix[i][col]=-1;}
//         }
//     }
//     public void setrow(int[][] matrix,int row,int m){
//         for(int i=0;i<m;i++){
//             if(matrix[row][i]!=0)
//              {matrix[row][i]=-1;}
//         }
//     }
//     public void setZeroes(int[][] matrix) {
//         // Your code goes here
//         int n=matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==0){
//                     setrow(matrix,i,m);
//                     setcol(matrix,j,n);
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }
// }