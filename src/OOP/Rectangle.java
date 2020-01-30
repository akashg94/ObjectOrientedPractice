package OOP;

public class Rectangle extends Shape {
    double length, width; //instance variable

    Rectangle(double length, double width){ //local variable
        this.length = length;
        this.width = width;
    }

    double area(){
        return length * width;
    }
}
