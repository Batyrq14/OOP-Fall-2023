import java.util.Scanner;

public class bank {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        int percentage = scan.nextInt();

        System.out.println(balance + balance*percentage/100);
        System.out.println(balance + balance*percentage/100/12);

    }
}
