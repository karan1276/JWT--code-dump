/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import customShapes.Rectangle;
import customShapes.RtTriangle;

/**
 *
 * @author student
 */
public abstract class Shape {
    
    protected int dim1, dim2, dim3, numSides;

    public Shape(int dim1, int dim2, int dim3, int numSides) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.numSides = numSides;
    }
    
    public Shape() {
        this(0,0,0,0);
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea();
    
    public abstract int getPerimeter();
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape s = new Rectangle(3,5);
        System.out.println(" Area of rectanglle :"+s.getArea()+" cm2");
        System.out.println(" Perimeter of rectanglle :"+s.getPerimeter()+" cm");
        
        s = new RtTriangle(5,10);
        System.out.println(" Area of triangle :"+s.getArea()+" cm2");
        System.out.println(" Perimeter of triangle :"+s.getPerimeter()+" cm");
        
    }
    
}
