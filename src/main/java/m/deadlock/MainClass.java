package m.deadlock;

public class MainClass {

    public static void main(String[] args) {
        Message message = new Message();

        Thread writerThread = new Thread(new Writer(message));
        Thread readerThread = new Thread(new Reader(message));

        writerThread.start();
        readerThread.start();

//        Nothing printed on the console.
//        infinite wait

// or

//        Humpty Dumpty sat on a wall
//        infinte wait //No other lines get printed after the above one.


    }
}
