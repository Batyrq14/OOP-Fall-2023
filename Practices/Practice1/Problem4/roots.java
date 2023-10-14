import java.util.Scanner;

public class roots {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int d;
        d = b*b - 4*a*c;
        if(d<0){
            System.out.println("Error");
        }
        else{
            System.out.println((-b+Math.sqrt(d))/2*a);
            System.out.println((-b-Math.sqrt(d))/2*a);
        }
    }
}
