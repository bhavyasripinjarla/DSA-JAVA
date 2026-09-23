import java.util.*;
class Solution{
    public double pow(double b,double e){
        if(e==0) return 1;
        if(e<0) return 1.0/pow(b,-e);
        if(e==1) return b;
        double ans=1.0;
        while(e>0){
            if(b%2==0){
                b=b*b;
                e=e/2;
            }else{
                ans=ans*b;
                e=e-1;
            }
        }
        return ans;
    }
    public void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Base value :");
        double n=s.nextDouble();
        System.out.println("Enter the Exponent: ");
        double e=s.nextDouble();
        System.out.print(pow(n,e));
    }
}