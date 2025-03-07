import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String age = s.nextLine().trim();
        System.out.println("Your text: " + age);
    }
}