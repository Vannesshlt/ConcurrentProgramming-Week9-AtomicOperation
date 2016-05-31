/**
 * Created by VannessTan on 31/05/2016.
 */
public class Main {

    public static void main(String[] args){

        Bank b = new Bank(100);
        User1 u1 = new User1(b);
        User2 u2 = new User2(b);
        User3 u3 = new User3(b);

        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);

        t1.start(); t2.start(); t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
