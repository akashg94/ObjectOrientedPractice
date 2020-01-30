package OOP;



public class Teacher {
    String name, gender, subject;
    int age;
    //created a constructor call it in object
    Teacher(String n, int a, String g, String s) {
        name = n;
        age = a;
        gender = g;
        subject = s;
    }

     //create a method to call
   /* void setInfo(String n,int a, String g, String s){
        name = n; //create an object of teacher class
        age = a;
        gender = g;
        subject = s;

    } */
     //to display the output


    //Overloading constructor

     Teacher(String n){
        name = n;

     }
    void display(){
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
        System.out.println("Gender :" + gender);
        System.out.println("subject :" + subject);
        System.out.println("\n");
    }
    void display2(){
        System.out.println("Name :" + name);
    }



}
