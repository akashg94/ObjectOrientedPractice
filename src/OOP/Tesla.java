package OOP;
//Extending the car

   public class Tesla extends Car {
    String colour;

    Tesla (String m, String n, int w, String c){

     super (m,n,w); //calling constructor of car class
     colour =c;


    }

    void display2(){
        System.out.println(model);
        System.out.println(name);
        System.out.println(wheel);
        System.out.println(colour);
    }
}
