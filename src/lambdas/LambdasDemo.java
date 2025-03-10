package lambdas;

public class LambdasDemo {
    public void print(String message) {
        System.out.println(message);
    }

    public static void show() {
        var demo = new LambdasDemo();
        greet(demo::print);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }

}
