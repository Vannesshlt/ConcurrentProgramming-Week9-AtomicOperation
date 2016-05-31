/**
 * Created by VannessTan on 31/05/2016.
 */
import java.util.concurrent.atomic.AtomicInteger;

public class User1 implements Runnable {

    private Bank b;

    public User1(Bank b1){ b = b1; }

    public void run(){

        while(true){
            synchronized(b) {
                System.out.printf("Deposited: 10\nAmount: %d\n\n", b.AddIn(10));
                b.notifyAll();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
