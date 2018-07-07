package paes.javaThread;

public class Thread1 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i <= 200; i++) {
			System.out.println("Etapa 1: " + i);
		}
	}
}
