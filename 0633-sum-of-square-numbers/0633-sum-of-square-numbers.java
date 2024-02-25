class Solution {
    public boolean judgeSquareSum(int c) {
        long tail = (int) Math.sqrt(c);
        long head = 0;
        while (head <= tail){
            long result = head * head + tail * tail;
            if (result < c) {
                head += 1;
            }
            else if (result > c) {
                tail -= 1;
            }else{
                return true;
            }
        }
        return false;
    }
}