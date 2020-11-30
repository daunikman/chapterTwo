import java.util.Scanner;
public class StudentGrade {

public static void main(String[] args) {
System.out.println("Enter grade");
   Scanner input = new Scanner(System.in);
   int grade = input.nextInt();

     if (grade >= 60){
        System.out.println("passed"); 
        System.out.println("Good Job");

       } else {
    
    //if (grade < 60)
     System.out.println("failed");
      System.out.println("You are a failure");

    }


}

}
