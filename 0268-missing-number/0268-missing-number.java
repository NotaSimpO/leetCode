class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == result){
                result++;
            }
        }
        return result;
    }
}