//Approach
// class Solution {
//     public void rotateMatrix(int[][] matrix) {
//         int n=matrix.length;
//         int m=matrix[0].length;
//         int[][] temp=new int[n][m];
//         for(int i=0;i<n;i++){
//             int k=n-1;
//             for(int j=0;j<m;j++){
//                 temp[i][j]=matrix[k][i];
//                 k--;
//             }
//         }
//     }
// }
//Approach 2
class Solution {
    public void reverse(int[][] matrix,int i,int n){
        int l=0,r=n-1;
        while(l<=r){
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
            l++;r--;
        }
    }
    public void rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse row
        for(int i=0;i<n;i++){
            reverse(matrix,i,n);
        }
    }
}