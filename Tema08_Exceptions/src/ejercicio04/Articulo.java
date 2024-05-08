package ejercicio04;

public class Articulo {
	/**
	 * constante porcentaje iva
	 */
	public final static double IVA = 0.21;
	/**
	 * nombre del artículo
	 */
	private String nombre = "";
	/**
	 * precio del artículo
	 */
	private double precio;
	/**
	 * unidades en stock
	 */
	private int cuantosQuedan;

	/**
	 * constructor sin parámetros
	 */
	public Articulo() {

	}

	/**
	 * Constructor con parámetros del objeto libro
	 * 
	 * @param nombre        Nombre del artículo
	 * @param precio        Precio del artículo
	 * @param cuantosQuedan Stock del artículo
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan)
			throws NegativePrecioException, NegativeQuantityException, InvalidNameException {
		if (!nombre.equals("")) {
			this.nombre = nombre;
		} else {
			throw new InvalidNameException();
		}

		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new NegativePrecioException();
		}
		if (cuantosQuedan > 0) {
		this.cuantosQuedan = cuantosQuedan;
		}else {
			throw new NegativeQuantityException();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	public double getPVP() {
		double precioPvp;

		precioPvp = this.precio + (this.precio * IVA);

		return precioPvp;
	}

	public double getPVPDescuento(double descuento) {
		double descuentoPVP;

		descuentoPVP = getPVP() - ((descuento / 100) * getPVP());

		return descuentoPVP;
	}

	/**
	 * resta stock tras vender artículos si queda todavía, además lo comprueba con
	 * un boleano
	 * 
	 * @param vendidos Cuantos Artículos se han vendido
	 * @return comprobación de si la venta se ha realizado o no. True se ha
	 *         realizado false no se ha realizado
	 */
	public boolean vender(int vendidos) {
		boolean venta = false;
		int nuevoStock = this.getCuantosQuedan();

		if (cuantosQuedan <= vendidos) {
			nuevoStock -= vendidos;
			setCuantosQuedan(nuevoStock);
			venta = true;
		}

		return venta;
	}

	/**
	 * Almacena Articulos para tener más stock
	 * 
	 * @param almacena
	 */
	public void almacenar(int almacena) {
		setCuantosQuedan(almacena);
	}

	public String toString() {
		String cadena = "";

		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Precio: " + this.precio + "\n";
		cadena += "PVP: " + getPVP() + "\n";
		cadena += "Stock: " + this.cuantosQuedan + "\n";

		return cadena;
	}

}
