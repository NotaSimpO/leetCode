class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int temp = 0;
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "I": {
                    if (i + 1 >= arr.length) {
                        temp = 1;
                    } else {
                        if (arr[i + 1].equals("V")) {
                            temp = 4;
                            i++;
                        } else if (arr[i + 1].equals("X")) {
                            temp = 9;
                            i++;
                        } else {
                            temp = 1;
                        }
                    }
                }
                    break;
                case "V":
                    temp = 5;
                    break;
                case "X": {
                    if (i + 1 >= arr.length) {
                        temp = 10;
                    } else {
                        if (arr[i + 1].equals("L")) {
                            temp = 40;
                            i++;
                        } else if (arr[i + 1].equals("C")) {
                            temp = 90;
                            i++;
                        } else {
                            temp = 10;
                        }
                    }
                }
                    break;
                case "L":
                    temp = 50;
                    break;
                case "C": {
                    if (i + 1 >= arr.length) {
                        temp = 100;
                    } else {
                        if (arr[i + 1].equals("D")) {
                            temp = 400;
                            i++;
                        } else if (arr[i + 1].equals("M")) {
                            temp = 900;
                            i++;
                        } else {
                            temp = 100;
                        }
                    }
                }
                    break;
                case "D":
                    temp = 500;
                    break;
                case "M":
                    temp = 1000;
                    break;
                default:
                    temp = -1;
            }
            sum += temp;
        }
        return sum;
    }
}