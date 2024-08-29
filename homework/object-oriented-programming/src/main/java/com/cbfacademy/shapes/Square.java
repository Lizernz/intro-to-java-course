package com.cbfacademy.shapes;

import java.security.PublicKey;

public class Square implements Enclosure {
    private double width;

    public Square (double width) {
        this.width = width;
    }
    
    @Override
    public double perimeter() {
        return 4 * width;
    }

    @Override
    public double area() {
        return Math.pow(width, 2);
    }
}


