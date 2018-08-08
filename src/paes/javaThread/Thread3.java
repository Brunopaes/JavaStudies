package paes.javaThread;

public class Thread3 implements Runnable {

    private Acumulador total;

    public Thread3 (Acumulador total) {
        this.total = total;
    }

    @Override
    public void run() {
        while (total.totalImpares == 0 || total.totalPares == 0) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total: " + total.totalPares + total.totalImpares);
    }
}
