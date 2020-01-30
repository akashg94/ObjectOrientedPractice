package OOP;

//Inheritence example

public class Car {
    String model;
    String name;
    int wheel;

    Car(String m, String n, int w){
       this. model = m;
        this.name = n;
       this. wheel = w;
    }

    void display(){
        System.out.println(model);
        System.out.println(name);
        System.out.println(wheel);
    }

}
