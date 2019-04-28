package u.br.com.blue.jakson.criando.threads.futuretask;

import java.util.concurrent.Callable;

public class Somar2 implements Callable<Integer> {

	private int n1;
	private int n2;

	public Somar2(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public Integer call() throws Exception {
		if (n1 < 0 || n2 < 0) {
			throw new IllegalArgumentException("N�mero negativo");
		}

		Thread.sleep(3000);
		return n1 + n2;
	}
}
