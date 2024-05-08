package ejercicio02;

public class HoraExacta extends Hora {
	
	/*
	 * 
	 */
	private int seg;

	public HoraExacta(int hora, int minutos, int seg) throws NegativeHourException, NegativeMinutesException, NegativeSecondException {
		super(hora, minutos);
		if(seg > 0 && seg <= 59){
			this.seg = seg;
		}else {
			throw new NegativeSecondException();
		}
	}
	
	boolean setSegundo(int valor ) {
		boolean correcto = false;
		
		if(seg > 0 || seg <= 59){
			this.seg = valor;
			correcto = true;
		}
		
		return correcto;
	}
	
	void inc(){
		
		if(seg < 59) {
			seg++;
		}else {
			seg = 0;
			super.inc();
		}
		
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += ":" + seg;
		
		return cadena;
	}
	
	
	
	

}
