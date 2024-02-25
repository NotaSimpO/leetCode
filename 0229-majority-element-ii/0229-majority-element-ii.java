class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            System.out.println(nums[i] + "+" + count);
            if (count > nums.length / 3 && !list.contains(nums[i])) {
                list.add(nums[i]);
                count =0;
            }
        }
        return list;
    }
}