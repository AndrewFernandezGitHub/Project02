package com.syntax.JavaProject02;

import javax.sound.midi.Soundbank;

public interface CodingTask1 {
      /*
1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code
     */
}
interface Shape{
    double calculateArea(double area);
    double calculatePerimeter(double perimeter);
}
class Circle implements Shape{
    @Override
    public double calculateArea(double radius){
        return (Math.PI*radius*radius);
    }
    @Override
    public double calculatePerimeter(double radius){
        return (2*Math.PI*radius);
    }
}
class Square implements Shape{
    @Override
    public double calculateArea(double a){
        return(a*a);
    }
    public double calculatePerimeter(double a){
        return(4*a);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("The area of the circle is "+circle.calculateArea(10.5));
        System.out.println("The perimeter of the circle is "+circle.calculatePerimeter(8.5));

    Square square=new Square();
        System.out.println("The area of the square is "+square.calculateArea(12));
        System.out.println("The perimeter of the square us "+square.calculatePerimeter(8));

    }
}