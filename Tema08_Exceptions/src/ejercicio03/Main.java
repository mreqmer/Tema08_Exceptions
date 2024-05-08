package ejercicio03;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cc;

		try {
			cc = new CuentaCorriente("123", -2);
		} catch (BadDniException e) {
			System.out.println(e);
		} catch (NegativeSaldoException e) {
			System.out.println(e);

		}
	}

}