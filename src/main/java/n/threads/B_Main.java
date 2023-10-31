package n.threads;

class TaskRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("Task 2 started");
        for (int i = 0; i < 199; i++) {
            System.out.println(i + "");
        }
        System.out.print("Task 2 done");
    }
}

class TaskThread extends Thread {
    @Override
    public void run() {
        System.out.println("Task 1 started");
        for (int i = 0; i < 199; i++) {
            System.out.println(i + "");
        }
        System.out.print("Task 1 done");
    }
}


public class B_Main {
    public static void main(String[] args) {

        TaskThread taskThread = new TaskThread();
        taskThread.start();

        TaskRunnable taskRunnable = new TaskRunnable();
        Thread thread = new Thread(taskRunnable);
        thread.start();

        System.out.println("Task 3 started");
        for (int i = 0; i < 199; i++) {
            System.out.print(i + "");
        }
        System.out.println("Task 3 done");
    }
}
