class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int temp = x % 10;
            result = result * 10 + temp;
            x = x / 10;
        }
        if (result <= Math.pow(-2, 31) || result > Math.pow(2, 31)) {
            return 0;
        }
        return (int) result;
    }
}