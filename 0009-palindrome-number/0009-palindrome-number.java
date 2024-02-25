class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char[] digits = number.toCharArray();
        int n = digits.length - 1;
        for (int i = 0; i <= n/2; i++){
            if (digits[i] != digits[n - i]){
                return false;
            }
        }
        return true;
    }
}