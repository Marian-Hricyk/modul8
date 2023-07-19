package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Diamond diamond = new Diamond();

        ShapePrinter.printShape(circle);
        ShapePrinter.printShape(quad);
        ShapePrinter.printShape(triangle);
        ShapePrinter.printShape(square);
        ShapePrinter.printShape(diamond);

    }
}


