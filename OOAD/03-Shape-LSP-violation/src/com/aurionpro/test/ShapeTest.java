package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(isRectangle(rectangle));

        Square square = new Square(7);
        System.out.println(isRectangle(square));
    }

    public static boolean isRectangle(Rectangle rect) {
        System.out.println("Rectangle height: " + rect.getHeight());
        System.out.println("Rectangle width: " + rect.getWidth());
        
        int prev=rect.getWidth();
        System.out.println("prev = "+prev);
        rect.setHeight(100);
        System.out.println(rect.getHeight());
        int curr=rect.getWidth();
        System.out.println("curr = "+curr);
        return prev==curr?true:false;

    }
}
