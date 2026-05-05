class Solution {
    public int singleNumber(int[] nums) {
        // write your code here
        int i = 0;
        for(int n: nums){
            i^=n;
        }
        return i;
    }
}
