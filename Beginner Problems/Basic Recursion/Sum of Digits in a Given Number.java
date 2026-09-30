// class Solution {
//     public int addDigits(int num) {
//         //your code goes here
//         if (num == 0) return 0;
//         return (num % 9 == 0) ? 9 : (num % 9);
//     }
// }
class Solution {
    public int sumD(int n){
        int sum = 0;
        while(n > 0){
            int t = n % 10;
            sum = sum + t;
            n = n / 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int ans = num;
        while(ans > 9){
            ans = sumD(ans);
        }
        return ans;
    }
}