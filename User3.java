/**
 * Created by VannessTan on 31/05/2016.
 */
import java.util.Random;

public class User3 implements Runnable {

    private Bank b;
    Random rand = new Random();

    public User3(Bank b3){ b = b3; }

    public void run(){

        while(true){
            int randNum = rand.nextInt(50-30) + 30;

            synchronized(b){
                while(b.RemoveIn(randNum) < 0){
                    try {
                        b.AddIn(randNum);
                        System.out.println("waiting..\n");
                        b.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            b.AddIn(randNum);
            System.out.printf("Withdraw: %d\nAmount: %d \n\n", randNum, b.RemoveIn(randNum));

            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
