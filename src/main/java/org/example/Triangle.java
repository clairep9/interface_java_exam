package org.example;


public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 ||
                sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
 return sideA;
    }


    public double getSideB() {
    return sideB;
    }


    public double getSideC() {
 return sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
 
    }

    @Override
    public double calculatePerimeter() {
      return sideB + sideA + sideC;
    }

    @Override
    public String getType() {
        if (sideA == sideB && sideB == sideC) {
            return "Equilateral Triangle";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
   
    }

    @Override
    public String toString() {
        return getType() + "(sides=" + sideA + ", " + sideB + ", " + sideC + ")";
    }
}