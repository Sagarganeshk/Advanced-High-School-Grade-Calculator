import java.util.Scanner;

public class AdvancedHighSchoolCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = input.nextLine();

        System.out.println("Enter number of subjects: ");
        int numsubjects = input.nextInt();
        input.nextLine();

        String[] subjects = new String[numsubjects];
        int[] marks = new int[numsubjects];
        String[] grade = new String[numsubjects];
        double[] gpas = new double[numsubjects];

        double totalGPA = 0;
        boolean hasFailed = false;

        for (int i=0; i < numsubjects; i++){
            System.out.print("Enter subject" + (i + 1) + " name:");
            subjects[i] = input.nextLine();


            System.out.print("Enter marks for " + subjects[i] + " (out of 100) ");
            marks[i] = input.nextInt();
            input.nextLine();

            while (marks[i] < 0 || marks[i] > 100){
                System.out.println("Invalid. Re-enter marks (0-100)");
                marks[i] = input.nextInt();
            }
            if ( marks[i] >= 90){
                grade[i] = "A+";
                gpas[i] = 4.0;
            }else if (marks[i] >= 80){
                grade[i] = "A";
                gpas[i] = 3.7;
            }else if (marks[i] >=70){
                grade[i] = "B";
                gpas[i] = 3.0;
            }else if (marks[i] >=60){
                grade[i] = "C";
                gpas[i] = 2.0;
            } else if (marks[i] >= 50) {
                grade[i] = "D";
                gpas[i] = 1.0;
            }else{
                grade[i] = "F";
                gpas[i] = 0.0;
                hasFailed = true;
            }
            totalGPA += gpas[i];
        }
        double avgGPA = totalGPA/numsubjects;

        System.out.println("\n------ Final Report ------");
        System.out.println("student: "+name);
        System.out.println("-------------------------------");
        System.out.printf("%-12s %8s %8s %-5s \n", "subject", "Marks", "Grade", "GPA");

        for(int i =0; i < numsubjects; i++){
            System.out.printf("%-12s %8s %8s %-5s \n", subjects[i], marks[i], grade[i], gpas[i]);
        }
        System.out.println("------------------------");
        System.out.printf("Average GPA: %.2f\n", avgGPA);
        System.out.println("Result: " + (hasFailed ? "Fail❌" : "Pass ✅ "));

        input.close();
    }
}
