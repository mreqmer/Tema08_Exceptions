package ejercicio03;

public class CuentaCorriente {
		private String dni = "";
		private String nombre = "";
		private double saldo;
		
		

		public CuentaCorriente(String dni, double saldo) throws BadDniException, NegativeSaldoException {
			if (dni != null && !dni.equals("")) {
				this.dni = dni;
			}else {
				throw new BadDniException();
			}
			if (saldo >= 0) {
				this.saldo = saldo;
			}else {
				throw new NegativeSaldoException();
			}
		}

		public CuentaCorriente(String dni, String nombre, double saldo)throws BadDniException, NegativeSaldoException, WrongNameException {
			this(dni, saldo);
			if (!nombre.equals("")) {
				this.nombre = nombre;
			} else {
				throw new NegativeSaldoException();
			}
		}

		/**
		 * 
		 * @return
		 */
		public String getNombre() {
			return nombre;
		}
		
		/**
		 * 
		 * @param nombre
		 */
		public void setNombre(String nombre)throws NegativeSaldoException {
			if (!nombre.equals("")) {
				this.nombre = nombre;
			} else {
				throw new NegativeSaldoException();
			}
		}
		
		/**
		 * 
		 * @return
		 */
		public double getSaldo() {
			return saldo;
		}
		/**
		 * 
		 * @param saldo
		 */
		public void setSaldo(double saldo) throws  NegativeSaldoException {
			if (saldo >= 0) {
				this.saldo = saldo;
			}else {
				throw new NegativeSaldoException();
			}
		}
		
		/**
		 * 
		 * @return
		 */
		public String getDni() {
			return dni;
		}
		
		/**
		 * 
		 */
		@Override
		public String toString() {
			String cadena = "";

			cadena += "------------------------------\n";
			cadena += "Titular: " + this.nombre + "\n";
			cadena += "DNI: " + this.dni + "\n";
			cadena += "Saldo: " + this.saldo + "\n";
			cadena += "------------------------------";

			return cadena;
		}
		  
		@Override
		public boolean equals(Object obj) {
			boolean iguales = false;
			
			CuentaCorriente cuenta = (CuentaCorriente) obj;
			
			if(this.dni.equals(cuenta.dni) && this.nombre.equals(cuenta.nombre) && this.saldo == cuenta.saldo ){
				iguales = true;
			}
			
			return iguales;
		}

		
	}

