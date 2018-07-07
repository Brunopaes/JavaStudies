package paes.javaThread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 201; i <= 400; i++) {
			System.out.println("Etapa 2:" + i);
		}
	}
}
