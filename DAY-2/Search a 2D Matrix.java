import java.util.*;

/*
 Problem: Search a 2D Matrix

 Description:
 Given an m x n integer matrix where each row is sorted in ascending order
 and the first integer of each row is greater than the last integer of the previous row,
 determine if a given target value exists in the matrix.

 Approach:
 - Traverse the matrix row by row
 - Skip rows where the target is greater than the last element of that row
 - Perform a linear search within the relevant row
 - Stop searching early if the current element exceeds the target

 Time Complexity: O(n * m) in the worst case
 Space Complexity: O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(target>matrix[i][m-1]){
                continue;
            }
            for(int j=0;j<m;j++){
                if(target==matrix[i][j]){
                    return true;
                }
                else if(matrix[i][j]>target){
                    break;
                }
            }
        }
        return false;
    }
}