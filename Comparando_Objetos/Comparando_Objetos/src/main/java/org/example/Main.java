package org.example;


public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 10, 22);
        circle1.calculateArea();
        Circle circle2 = new Circle(15, 15, 21);
        circle2.calculateArea();

        int resultCircles = circle1.compareTo(circle2);
        System.out.println("");
        if (resultCircles < 0) {
            System.out.println("EL circulo1 es menor que el 2");
        } else if (resultCircles == 0) {
            System.out.println("Los dos circulos son iguales");
        } else {
            System.out.println("El circulo1 es mayor que el 2");
        }
        System.out.println("");

        Rectangle rec1 = new Rectangle(10, 10, 20, 20);
        rec1.calculateArea();
        Rectangle rec2 = new Rectangle(30, 30, 50, 50);
        rec2.calculateArea();

        int resultRecs = rec1.compareTo(rec2);
        System.out.println("");
        if (resultRecs < 0) {
            System.out.println("EL rectangulo1 es menor que el 2");
        } else if (resultRecs == 0) {
            System.out.println("Los dos rectangulos son iguales");
        } else {
            System.out.println("El rectangulo1 es mayor que el 2");
        }



    }

}