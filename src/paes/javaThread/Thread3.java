package paes.javaThread;

public class Thread3 implements Runnable {
    private Acumulator total;

    public Thread3(Acumulator total) {
        this.total = total;
    }

    @Override
    public void run() {
        while (total.getTotalEven() == 0 || total.getTotalOdd() == 0) {
            System.out.println(Thread.currentThread().getName());

            try { Thread.sleep(2000); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }

        int sum = (total.getTotalEven() + total.getTotalOdd());

        total.toString(sum);
    }
}
