import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by VannessTan on 31/05/2016.
 */
public class User2 implements Runnable {

    private Bank b;

    public User2(Bank b2){ b = b2; }

    public void run(){

        while(true){
            synchronized(this){
                System.out.printf("Deposited: 20\nAmount: %d \n\n", b.AddIn(20));
                notifyAll();
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
