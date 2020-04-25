/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrion;


/*
	example class for a Circle
 */


public class Circle {
	//static variable of pi, it will be common for all object "Circle"
	static double pi= 3.14;
	//Circle's ray
	private double r;
	//Constructors: without parameters, the ray is setted to 1.0
	Circle(){
		r= 1.0;
	}
	Circle(double n){
		r=n;
	}
	//method for setting ray
	public void setRay(double n){
		r=n;
	}
	// area calculation method
	public double getArea(){
		double area= r*r*pi;
		return area;
	}
}
