package ejercicio04;

public class Main {

	public static void main(String[] args) {
		
		Articulo art;
		
		try {
			art = new Articulo("a", 2, -12);
		}catch(InvalidNameException e){
			System.out.println(e);
		}catch(NegativePrecioException e){
			System.out.println(e);
		}catch(NegativeQuantityException e){
			System.out.println(e);
		}

	}

}
