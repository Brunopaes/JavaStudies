package paes.javaThread;

public class Thread1 implements Runnable {
    private Acumulator totalEven;
    private int max;

    public Thread1(Acumulator totalEven, int max) {
        this.totalEven = totalEven;
        this.max = max;
    }

    @Override
    public void run() {
        int t = 0;

        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) t += 1;
            System.out.println(Thread.currentThread().getName());
        }
        this.totalEven.setTotalEven(t);
    }
}
