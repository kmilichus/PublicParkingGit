package modelo;

public class Parqueadero {
	public final static double TARIFA_HORA_MOTO  = 1000;
	public final static double TARIFA_HORA_CARRO = 3500;
	
	public final static String MOTO  = "Moto";
	public final static String CARRO = "Carro";
	
	private String tipoVehiculo;
	
	private int horaInicio;
	private int minutoInicio;
	private int horaFinal;
	private int minutoFinal;
	
	public Parqueadero() {
	}
	
	public void marcarHoraInicio(String tipoV) {
		int [] horas = {7,8,9,10,11,12};
		int valor = 59;
		double minuto = Math.random();
		double hora = Math.random();
		
		double random = hora*5;
		double random2 = minuto*valor;
		
		int hora1 = horas[(int)random];
		int minuto1 = (int) random2; 
		horaInicio = hora1;
		minutoInicio =minuto1;
	}
	
	public String darHoraInicio() {
		return horaInicio+":"+minutoInicio;
	}
	
	public void marcarHoraFinal() {
		// To modify:
		
		int [] horas = {12,13,14,15,16,17,18,19,20,21};
		int valor = 59;
		double minuto = Math.random();
		double hora = Math.random();
		double random = hora*9;
		double random2 = minuto*valor;
		
		int hora1 = horas[(int)random];
		int minuto1 = (int) random2; 
		horaInicio = hora1;
		minutoInicio =minuto1;
	}
	
	public String darHoraFinal() {
		return horaInicio+":"+minutoInicio;
	}
	
	public double calcularValorAPagar() {
		
		tipoVehiculo = "MOTO";
		double tarifa;
		if(tipoVehiculo.equals(MOTO)) {
			tarifa = TARIFA_HORA_MOTO;
		}else {
			tarifa = TARIFA_HORA_CARRO;
		}
		
		double valorAPagar = (horaFinal-horaInicio)*tarifa;
		if(minutoFinal>minutoInicio) {
			valorAPagar += tarifa;
		}
		return valorAPagar;
	}
}
