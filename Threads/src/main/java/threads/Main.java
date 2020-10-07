package threads;

import org.w3c.dom.NodeList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        /*
        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());
        thread.start();
        thread1.start();

         */
        long d = System.currentTimeMillis();
        double s = 0;
        Thread thread1 = new Thread(() -> {
            double s1 = 0;
            for (double i = 0; i < 100000000; i++) s1+= i;
        });
        Thread thread2 = new Thread(() -> {
            double s2 = 0;
            for (double i = 0; i < 100000000; i++) s2+= i;
        });
        thread1.run();
        thread2.run();
        if (thread1.isAlive()) thread1.join();
        if (thread2.isAlive()) thread2.join();
        for (double i = 0; i < 100000000; i++) s+= i;
        System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - d));

    }
}
