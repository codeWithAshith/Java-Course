package n.threads;

class Processor {
    public synchronized void waitingMethod() {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + " is releasing the lock and going to wait...");

        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread.getName() + " got back and continuing execution");
    }

    public synchronized void sleepMethod() {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + " is gng to sleep");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        notify();

        System.out.println(thread.getName() + " notified than execution is done");
    }

}

public class C_Synchronization {

    public static void main(String[] args) {
        Processor processor = new Processor();

        new Thread(processor::waitingMethod).start();
        new Thread(processor::sleepMethod).start();
    }
}
