import java.util.*; 
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[] > list=new ArrayList<>();
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        list.add(intervals[0]);
        for(int i=1;i<n;i++){
            if(list.get(list.size()-1)[1]>=intervals[i][0]){
                list.get(list.size()-1)[1]=Math.max(intervals[i][1],list.get(list.size()-1)[1]);
            }
            else{
                list.add(intervals[i]);
            }
        }
        return list.toArray(int[][]::new);
    }
}