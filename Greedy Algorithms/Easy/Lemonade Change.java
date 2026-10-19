class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0,ten=0;
        for(int i=0;i<n;i++){
            int c=bills[i];
            switch (c) {
                case 5 -> five++;
                case 10 -> {
                    if(five<1){ return false;}
                    ten++;
                    five--;
                }
                default -> {
                    if(ten>0  && five >0){
                        ten--;
                        five--;
                    }else if(five>=3){
                        five-=3;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}