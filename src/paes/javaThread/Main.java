package paes.javaThread;

public class Main {
	public static void main(String[] args) {

		//System.out.println(Thread.currentThread().getName());

        Acumulador acumulador = new Acumulador();

		Thread t1 = new Thread(new Thread1(acumulador));
		Thread t2 = new Thread(new Thread2(acumulador));
		Thread t3 = new Thread(new Thread3(acumulador));

		t1.start();
		t2.start();
		t3.start();
	}
}
