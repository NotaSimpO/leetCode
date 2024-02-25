class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int resultLength = nums1.length + nums2.length;
        int[] result = new int[resultLength]; 
        System.arraycopy(nums1, 0, result, 0, nums1.length); 
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length); 
        Arrays.sort(result);
        if(resultLength%2==0){
            return (double) (result[resultLength/2] + result[(resultLength/2) - 1])/2;
        }else{
            return result[resultLength/2];
        }
    }
}