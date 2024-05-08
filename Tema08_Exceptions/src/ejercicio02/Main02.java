package ejercicio02;

public class Main02 {

	public static void main(String[] args) {

		Hora nuevaHora;
//
//		nuevaHora.inc();
//
//		System.out.println(nuevaHora);


		try {
			nuevaHora = new Hora(13, 14);
			nuevaHora.setHora(-1);
			System.out.println(nuevaHora);
		}catch(NegativeHourException e) {
			System.out.println(e);
		}catch(NegativeMinutesException e) {
			System.out.println(e);
		}
		
		

		

		//nuevaHoraExacta.inc();

		

	}

}
