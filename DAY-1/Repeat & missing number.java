/*
 Problem: Find the Repeating and Missing Number

 Description:
 Given an array of size n containing numbers from 1 to n,
 one number is repeated and one number is missing.
 This method identifies both numbers using a frequency array.

 Approach:
 - Calculate the expected sum of numbers from 1 to n
 - Traverse the array:
     • Keep track of the actual sum
     • Use a frequency array to find the repeating number
 - The missing number is calculated using:
     missing = expectedSum - actualSum + repeating

 Time Complexity: O(n)
 Space Complexity: O(n)
*/
class solution{
    public int[] RepeatAndMissingNumber(int[] arr){
        int n=arr.length;
        int s=0;
        int sum=n*(n+1)/2;
        int[] ans=new int[2];
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            s+=arr[i];
            freq[arr[i]]++;
            if(freq[arr[i]]>1){
                ans[0]=arr[i];
            }
        }
        ans[1]=sum-s-ans[0];
        return ans;
    }
}