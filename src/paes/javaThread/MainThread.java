package paes.javaThread;

public class MainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Acumulator acumulator = new Acumulator();
        int max = 100;

        Thread t1 = new Thread(new Thread1(acumulator, max));
        Thread t2 = new Thread(new Thread2(acumulator, max));
        Thread t3 = new Thread(new Thread3(acumulator));

        t1.start();
        t2.start();
        t3.start();
    }
}
