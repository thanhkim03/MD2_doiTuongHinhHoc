package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Shape shape = new Shape("red", false);
        System.out.println(shape);
        Rectangle rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        Square square = new Square(2.4);
        System.out.println(square);
    }
}
