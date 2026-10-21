class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] left=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }else{
                left[i]=1;
            }
        }
        int right=1,c=1,max=Math.max(1,left[n-1]);
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                c=right+1;
                right=c;
            }else{
                c=1;
                right=1;
            }
            max=max+Math.max(left[i],c);
        }
        return max;
    }

}