public class Client {
    public static void main(String[] args) {
        NumberGen numberGen1 = new NumberGen("A");
        NumberGen numberGen2 = new NumberGen("B");
        numberGen1.getThread().setPriority(Thread.MAX_PRIORITY);
        numberGen2.getThread().setPriority(Thread.MIN_PRIORITY);
        numberGen1.getThread().start();
        numberGen2.getThread().start();

    }
}
