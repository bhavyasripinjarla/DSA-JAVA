class Solution {
    public int pascalTriangleI(int r, int c) {
        r=r-1;
        c=c-1;
        int res=1;
        for(int i=0;i<c;i++){
            res=(r-i)*res;
            res=res/(i+1);
        }
        return res;
    }
}