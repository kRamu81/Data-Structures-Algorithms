class Solution {
    public int missingNumber(int[] nums) {
        // write your code here
        int n = nums.length;
        int total = n*(n+1)/2;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return total-sum;
    }
}

