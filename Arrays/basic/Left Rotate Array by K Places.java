class Solution1{
    public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==n) return;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[i];
        }
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[n-k+i]=temp[i];
        }
    }
}

// another approach

class Solution2{
    public void reverse(int[] nums ,int l,int r){
        int n=nums.length;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0) return;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
}