/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customShapes;

import shape.Shape;

/**
 *
 * @author student
 */
public class Rectangle extends Shape {
    
    protected int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    public Rectangle() {
        this(0,0);
    }
    
    public int getArea(){
        return height*width;
    }
    
    public int getPerimeter(){
        return 2*height*width;
    }
}
