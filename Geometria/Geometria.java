/*

Classe di calcolo geometrico. Classi usate: Cerchio;

*/

public class Geometria{

	public static void main(String[] args){
	
		System.out.println("Facciamo dei calcoli geometrici:");
		
		Cerchio c1= new Cerchio();     //c1 contiene il RIFERIMENTO all'oggetto creato
		double area= c1.getArea();
		System.out.println("Area del cerchio= " + area);
		
		c1.setRaggio(3.0);
		area = c1.getArea();
		System.out.println("Area del cerchio= " + area);
		
		//// anche qui, r1 contiene il riferimento al nuovo oggetto di tipo "Rettangolo"
		Rettangolo r1= new Rettangolo();   
		area = r1.getArea();
		System.out.println("Area del rettangolo= " + area);
	
		//Ora libero la memoria inizializzando c1 e r1 a NULL, come fossero puntatori
		c1=null;
		r1=null;  //grazie di tutto, oggetti.
	}

}
