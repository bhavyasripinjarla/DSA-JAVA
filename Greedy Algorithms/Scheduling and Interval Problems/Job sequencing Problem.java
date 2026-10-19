import java.util.*;
class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        int n=Jobs.length;
        int c=0,total=0;
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,Jobs[i][1]);
        }
        int[] idx=new int[max+1];
        Arrays.fill(idx,-1);
        for(int i=0;i<n;i++){
            for(int j=Jobs[i][1];j>=1;j--){
                if(idx[j]==-1){
                    c++;
                    total+=Jobs[i][2];
                    idx[j]=Jobs[i][0];
                    break;
                }
            }
        }
        return new int[] {c,total};

    }
}