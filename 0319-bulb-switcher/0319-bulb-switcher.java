class Solution {
    public int bulbSwitch(int n) {
        if(n==0){
            return 0;
        }
        else{
            int count = 0;
            for (int i = 1; i <= n; i++){
                if ((int)Math.sqrt(i)*(int)Math.sqrt(i)==i){
                    count++;
                }
            }
            return count;
        }
    }
}