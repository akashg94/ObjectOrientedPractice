package OOP;

public class Student {
    String name; //instance variable
    int id;      //instance variable

    //related with class not with object
    static String collegeName = "Brooklyn college"; //static variable

    Student(String n, int i){ //local variable is inside the parameter
     name = n;
     id = i;
    }

    void StudentInfo(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("college name : " + collegeName);
        System.out.println("\n");
    }

}
