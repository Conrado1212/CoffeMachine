package main.stage6.instance;

public class Circle {
    double radius;

    double getLength(){
        double length =2*Math.PI*radius;
        return length;
    }
    double getArea(){
        double area = Math.PI*(radius*radius);
        return area;
    }
}
/*double radius;

    double getLength() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }*/