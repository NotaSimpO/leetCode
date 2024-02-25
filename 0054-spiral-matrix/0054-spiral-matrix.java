class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int top = 0;
        int rowCount = matrix.length - 1;
        int colCount = matrix[0].length - 1;
        while (list.size() < matrix.length * matrix[0].length) {
            for (int i = left; i <= colCount; i++) {
                list.add(matrix[left][i]);
            }
            top++;
            for (int i = top; i <= rowCount; i++) {
                list.add(matrix[i][colCount]);
            }
            colCount--;
            if (rowCount >= top) {
                for (int i = colCount; i >= left; i--) {
                    list.add(matrix[rowCount][i]);
                }
                rowCount--;
            }

            if (colCount >= left) {
                for (int i = rowCount; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }
}