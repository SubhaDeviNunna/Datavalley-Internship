import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Project {
    private String studentName;
    private int completionTime;

    public Project(String studentName, int completionTime) {
        this.studentName = studentName;
        this.completionTime = completionTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getCompletionTime() {
        return completionTime;
    }
}

public class ProjectAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Project> projects = new ArrayList<>();

        System.out.print("Enter the number of student projects: ");
        int numProjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input projects
        for (int i = 0; i < numProjects; i++) {
            System.out.println("Enter details for project " + (i + 1) + ":");
            System.out.print("Student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Completion time (in days): ");
            int completionTime = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Project project = new Project(studentName, completionTime);
            projects.add(project);
        }

        // Analyze projects
        int onTimeCount = 0;
        int lateCount = 0;
        int earlyCount = 0;
        int totalCompletionTime = 0;

        for (Project project : projects) {
            int completionTime = project.getCompletionTime();
            totalCompletionTime += completionTime;

            if (completionTime == 7) {
                onTimeCount++;
            } else if (completionTime < 7) {
                earlyCount++;
            } else {
                lateCount++;
            }
        }

        int averageCompletionTime = totalCompletionTime / numProjects;

        // Display results
        System.out.println("\nProject Analysis:");
        System.out.println("Number of projects completed on time: " + onTimeCount);
        System.out.println("Number of projects completed early: " + earlyCount);
        System.out.println("Number of projects completed late: " + lateCount);
        System.out.println("Average completion time for all projects: " + averageCompletionTime + " days");

        scanner.close();
    }
}
