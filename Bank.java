/**
 * Created by VannessTan on 31/05/2016.
 */
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    private AtomicInteger amount;

    public Bank(int x){ amount = new AtomicInteger(x); }

    public int AddIn(int x){
        return amount.addAndGet(x);
    }

    public int RemoveIn(int x){ return amount.addAndGet(x*-1); }

}

