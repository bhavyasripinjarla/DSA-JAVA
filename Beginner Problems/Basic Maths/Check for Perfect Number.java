import java.util.*;
class Solution {
    public int divisors(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                arr.add(i);
                if(i!=(n/i)){
                    arr.add(n/i);
                }
            }
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==n) continue;
            sum+=arr.get(i);
        }
        return sum;
    }
    public boolean isPerfect(int n) {
        int m=divisors(n);
        return (m==n);
    }
}