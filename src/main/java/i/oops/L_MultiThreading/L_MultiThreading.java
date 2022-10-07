package i.oops.L_MultiThreading;

public class L_MultiThreading extends Thread {

    public void run() {
        System.out.println("Thread is currently running...");
    }

    public static void main(String[] args) {
        L_MultiThreading th = new L_MultiThreading();
        th.start();
    }
}
