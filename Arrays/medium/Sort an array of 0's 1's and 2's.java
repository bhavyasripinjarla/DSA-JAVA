class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int mid=0;
        while(mid<=high ){
            switch (nums[mid]) {
                case 0 ->                     {
                        int temp=nums[low];
                        nums[low]=nums[mid];
                        nums[mid]=temp;
                        low++;
                        mid++;
                    }
                case 1 -> mid++;
                case 2 ->                     {
                        int temp=nums[high];
                        nums[high]=nums[mid];
                        nums[mid]=temp;
                        high--;
                    }
                default -> {
                }
            }
        }
    }
}