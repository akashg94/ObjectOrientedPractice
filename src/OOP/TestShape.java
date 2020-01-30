package OOP;

public class TestShape {
    public static void main(String[] args) {
        Shape [] s = new Shape[3]; //using an array

        //using a dynamic polymorphism
        s[0] = new Shape();
        s[1] = new Rectangle(10,20);
        s[2] = new Rectangle(10,20);

        //using a loop to iterate all
        for (int i = 0; i <3; i++) {
            System.out.println(s[i].area());
        }

    }

}
