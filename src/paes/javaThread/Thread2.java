package paes.javaThread;

public class Thread2 implements Runnable {
    private Acumulator totalOdd;
    private int max;

    public Thread2(Acumulator totalOdd, int max) {
        this.totalOdd = totalOdd;
        this.max = max;
    }

    @Override
    public void run() {
        int t = 0;

        for (int i = 0; i < max; i++) {
            if (i % 2 != 0) t += 1;
            System.out.println(Thread.currentThread().getName());
        }
        this.totalOdd.setTotalOdd(t);
    }
}
