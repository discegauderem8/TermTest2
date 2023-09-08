public class Counter implements CounterInterface, AutoCloseable {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void add() {
        this.count += 1;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void close() throws Exception {
    }
}
