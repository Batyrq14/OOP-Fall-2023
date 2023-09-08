package task1.Problem2;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();

        int area = side * side;
        int perimeter = 4 * side;
        double diagonal = Math.sqrt(2) * side;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length of diagonal: " + diagonal);
    }
}
