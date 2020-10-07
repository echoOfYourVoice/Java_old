package threadswork;

public class MyThread implements Runnable {
    MyObject obj;

    public MyThread(MyObject obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            obj.x = 0;
            for (int i = 0; i < 5; i++) {
                obj.x++;
                System.out.println(Thread.currentThread() + " obj.x = " + obj.x);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
