
package geometrion;
/*
Class used to do geometric calculation.
Classes used: Circle; Rectangle;
*/

public class Geometrion{

	public static void main(String[] args){
	
		System.out.println("Let's do some calculations:");
		
		Circle c1= new Circle();     //c1 contains the REFERENCE of the new object of type "Circle"
		double area= c1.getArea();
		System.out.println("Circle area = " + area);
		
		c1.setRay(3.0);
		area = c1.getArea();
		System.out.println("Circle area = " + area);
		
		//// even here, r1 variable contains the reference of the new object. It's like a C pointer.
		Rectangle r1= new Rectangle();   
		area = r1.getArea();
		System.out.println("Rectangle area = " + area);
	
		//Now let's free the memory, c1 and r1 pointers are setted to NULL.
		c1=null;
		r1=null;  //thanks and bye, variables.
	}

}