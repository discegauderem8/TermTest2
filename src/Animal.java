import java.util.HashSet;

public class Animal implements AutoCloseable{
    static Counter counter = new Counter();
    public Animal(){
    }

    @Override
    public void close() throws Exception {

    }
}