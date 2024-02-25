class Solution {
    public int getSum(int a, int b) {
        // use binary sum
        int carry;
        while (b != 0){
            carry = a & b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }
}