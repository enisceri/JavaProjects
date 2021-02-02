import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);
        System.out.println("What is your grade : ");
        String gradeStr = inputData.next();

        char grade = gradeStr.charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Grade : A");
                break;

            case 'B':
                System.out.println("Grade : B");
                break;

            default:
                System.out.println("Invalid Grade");
        }

        for(int i = 0; i< 5 ; i++)
        {
            System.out.println(i);
        }
    }
}
