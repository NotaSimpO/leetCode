class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int turn = (int) Math.floor(minutesToTest / minutesToDie);
        float b = (float) (Math.log(buckets)/Math.log(turn+1));
        return (int) Math.ceil(b);
    }
}