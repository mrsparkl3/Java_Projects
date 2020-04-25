/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrion;

// Defining a Rectangle class

public class Rectangle{
		//let's define base and height variables
		private double h;
		private double b;
		
		//Constructors
		Rectangle (){
			h=1;
			b=3;
		}
		Rectangle(double height, double base){
			h=height;
			b=base;
		}
		
		// setting modules for Height and Base
		public void setHeight(double n){
			h=n;
		}
		public void setBase(double n){
			b=n;
		}
		
		//Basic operations
		public double getArea(){
			double area= h*b;
			return area;
		}
}