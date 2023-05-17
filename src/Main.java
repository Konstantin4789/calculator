import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter mathematical expression");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        new Calculator(line);
    }
}
