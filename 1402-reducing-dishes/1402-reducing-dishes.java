class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int result = 0;
        for (int i = 0; i < satisfaction.length; i++){
            int sum = 0;
            int k = 1;
            for (int j = i; j < satisfaction.length; j++){
                sum += satisfaction[j]*k;
                k++;
            }
            result = Math.max(result,sum);
        }
        return result;
    }
}