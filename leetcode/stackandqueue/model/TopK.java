package stackandqueue.model;

public class TopK {
    private Integer num;
    private Integer count;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void addCount(){
        count++;
    }

    public TopK(Integer num, Integer count) {
        this.num = num;
        this.count = count;
    }
}
