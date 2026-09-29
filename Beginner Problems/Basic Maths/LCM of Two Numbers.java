class Solution {
    public int GCD(int n1, int n2) {
        if(n1==0 && n2==0) return 0;
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n2==0) return n1;
        return n2;
    }
    public int LCM(int n1, int n2) {
        return (n1*n2)/(GCD(n1,n2));
    }
}