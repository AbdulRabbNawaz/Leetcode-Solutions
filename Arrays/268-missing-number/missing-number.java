class Solution {
    public int missingNumber(int[] nums) {

        int tempSum = 0;
        int n = nums.length;

        int sum = n*(n+1) / 2;

        for(int i = 0; i < n; i++){

            tempSum += nums[i];
        }
        
        return sum - tempSum;
    }
}