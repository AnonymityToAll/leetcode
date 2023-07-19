package hash;

public class HappyNum {
    public boolean isHappy(int n) {
        //把n的各个位置的数拿出来
        int i = 0;
        while (n != 1){
            n = getSum(n);
            if (i > 1000000){
                return false;
            }
        }
        return true;
    }

    private Integer getSum(int n){
        int sqNum = 0;
        while (n != 0){
            int num = n % 10;
            n = n / 10;
            sqNum += num * num;
        }
        return sqNum;
    }
}
