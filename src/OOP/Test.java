package OOP;

public class Test {
    public static void main(String[] args) {


        Teacher teacher = new Teacher("Christopher Grill", 38, "M", "US History");
        //teacher.setInfo("Christopher Grill", 38, "M", "US History");
        teacher.display();

        Teacher teacher2 = new Teacher("MR Yuen", 38, "M", "Global History");
        //teacher.setInfo("Mr Yuen", 32, "M", "Global History");
        Teacher teacher3 = new Teacher("Dacatrel");
        teacher.display();
        teacher3.display2();


    }
}