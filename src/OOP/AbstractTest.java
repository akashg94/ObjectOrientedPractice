package OOP;

public class AbstractTest {
    public static void main(String[] args) {
       MobileUser mu;
       mu = new Akash();
       mu.sendMessage();
       mu.call();

       mu = new Sujoy();
       mu.sendMessage();
    }

}
