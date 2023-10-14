import java.util.Scanner;

public class grading {

 public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  
  int score = scan.nextInt();
  
  int grade_number = 95;
  
  String[] grade = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
  
  for (int i = 0; i < grade.length; i++) {
   
   if (score < 50) {
    System.out.println("F");
    break;
   }
   
   else if (score >= grade_number){
    System.out.println(grade[i]);
    break;
   }
   
   else {
    grade_number -= 5;
   }
   
  }

 }

}