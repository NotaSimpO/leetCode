class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String result = "";
        Arrays.sort(strs);
        boolean flag = true;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                }
            }
            if (flag) {
                result += strs[0].charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

}