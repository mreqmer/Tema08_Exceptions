package ejercicio04;

public class NegativePrecioException extends Exception {

	@Override
	public String toString() {
		return "Error. Precio negativo";
	}
}
