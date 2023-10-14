import java.util.Scanner;

public class pali {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        boolean yesNo = false;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                yesNo = true;
            }
        }


        if(yesNo){
            System.out.println("NOOOOOOO");
        }else{
            System.out.println("Yes");
        }
    }
}

