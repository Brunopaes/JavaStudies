package paes.javaThread;

public class Thread3 implements Runnable {

    private Acumulador total;

    public Thread3 (Acumulador total) { this.total = total; }

    @Override
    public void run() {
        while (total.getTotalImpares() == 0 || total.getTotalPares() == 0) {
            System.out.println(Thread.currentThread().getId());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int soma = (total.getTotalImpares() + total.getTotalPares());

        System.out.println("Total: " + soma);
        System.out.println("Total Pares: " + total.getTotalPares());
        System.out.println("Total Ímpares: " + total.getTotalImpares());
    }
}
