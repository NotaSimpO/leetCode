class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length;i++){
            if (nums[i] == nums[i/2]){
                result = nums[i];
            }
        }
        return result;
    }
}