package java_tasks;

public class A {

    public String helloWorld = "Hello World";
    public static int zero;
    public static int result;

    public static void main(String args[]) {
        try {
            result = 5 / zero;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            e.printStackTrace();
        }
    }

    public String printHelloWorld() {
        return helloWorld;
    }

}
