/*

	Classe base per Rettangolo;
*/


public class Rettangolo{
		//Ovviamente avrà una base e un'altezza
		private double h;
		private double b;
		
		//Costruttori
		Rettangolo (){
			h=1;
			b=3;
		}
		Rettangolo(double altezza, double base){
			h=altezza;
			b=base;
		}
		
		// setting di base e altezza
		public void setAltezza(double n){
			h=n;
		}
		public void setBase(double n){
			b=n;
		}
		
		//Operazioni base
		public double getArea(){
			double area= h*b;
			return area;
		}
}
