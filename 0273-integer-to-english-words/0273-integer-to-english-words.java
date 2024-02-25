class Solution {
    static String[] belowTwenty = new String[] {
            "","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    static String[] aboveTwenty = new String[] {
            "","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String process(int num) {
        String result = "";
        if (num < 20) {
            result = belowTwenty[num];
        } else if (num < 100) {
            result = aboveTwenty[num / 10] + " " + process(num % 10);
        } else if (num < 1000) {
            result = process(num / 100) + " Hundred " + process(num % 100);
        } else if (num < 1000000) {
            result = process(num / 1000) + " Thousand " + process(num % 1000);
        } else if (num < 1000000000) {
            result = process(num / 1000000) + " Million " + process(num % 1000000);
        } else if (num < Math.pow(2,31)) {
            result = process(num/ 1000000000) + " Billion " + process (num % 1000000000);
        }
        return result.trim();
    }

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return process(num);
    }
}