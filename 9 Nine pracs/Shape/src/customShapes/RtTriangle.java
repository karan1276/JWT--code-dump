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
public class RtTriangle extends Shape {
    
    protected int height, width;

    public RtTriangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    public RtTriangle() {
        this(0,0);
    }
    
    public int getArea(){
        return (int)height*width/2;
    }
    
    public int getPerimeter(){
        return (int) (width+2*Math.sqrt( Math.pow(height, 2) + Math.pow( width/2 , 2)));
    }
}
