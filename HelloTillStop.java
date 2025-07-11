import java.util.*;

class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice; //guard variable

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();//set guard variable
        while ("h".equals(choice)) {
            System.out.println("Hello");
            choice = sc.next();
            
        }
    }
    public static void main(String args[]) {
        HelloTillStop h1 = new HelloTillStop();
        h1.showHello(); // <-- call the method
    }
}
    

