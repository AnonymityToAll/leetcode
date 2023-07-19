package array;

public class ImitateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] resArr = new int[n][n];
        int num = 1;
        int target = n * n;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        while (num <= target){
            for (int i = left; i <= right; i++){
                resArr[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bottom; i++){
                resArr[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--){
                resArr[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--){
                resArr[i][left] = num;
                num++;
            }
            left++;
        }
        return resArr;
    }
}
