package threaddaemon;

public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t;
        t = new Thread(() -> {
           int i = 0;
           while (true) {
               System.out.println("Секунд прошло: " + i);
               if (i == 3) break;
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               i++;
           }
        });
        t.setDaemon(true);
        t.start();
        Thread.sleep(1500);
    }
}
