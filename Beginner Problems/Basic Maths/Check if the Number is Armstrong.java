class Solution {
    public boolean isArmstrong(int n) {
        int m=n;
        int a=0;
        while(n>0){
            int temp=n%10;
            a=a+(temp*temp*temp);
            n=n/10;
        }
        return (a==m);
    }
}