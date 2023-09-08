import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int length = name.length();
        System.out.println("+" + "-".repeat(length + 2) + "+");
        System.out.println("| " + name + " |");
        System.out.println("+" + "-".repeat(length + 2) + "+");
    }
}