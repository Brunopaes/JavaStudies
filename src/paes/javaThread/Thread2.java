package paes.javaThread;

public class Thread2 implements Runnable {

    private Acumulador total;

    public Thread2 (Acumulador total) {
        this.total = total;
    }

    @Override
	public void run() {
        int t = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 2 != 0) t += 1;
            System.out.println(Thread.currentThread().getName());
        }
		this.total.setTotalImpares(t);
    }
}
