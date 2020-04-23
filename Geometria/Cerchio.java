/*
	Esempio di classe di Cerchio
 */


public class Cerchio {
	//static variable of pi, it will be common for all object "Cerchio"
	static double pi= 3.14;
	//Raggio del cerchio
	private double r;
	//Costruttori, senza parametro il raggio è inizializzato a 1.0
	Cerchio(){
		r= 1.0;
	}
	Cerchio(double n){
		r=n;
	}
	//metodo per modifica del Raggio
	public void setRaggio(double n){
		r=n;
	}
	// metodo per calcolare l'area del Cerchio
	public double getArea(){
		double area= r*r*pi;
		return area;
	}
}

