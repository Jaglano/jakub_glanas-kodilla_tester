package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10);
        showShapeDetalis(square);

        Circle circle = new Circle(7);
        showShapeDetalis(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapeDetalis(triangle);
    }

    private static void showShapeDetalis(Shape shape){
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
