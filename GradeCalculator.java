import java.util.*;
class Student {
    String name;
    float grade;

    Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }
}
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the total number of students : ");
        int cnt = scanner.nextInt();
        for(int i = 1;i<=cnt;i++){
            System.out.print("Enter student's name: ");
            String name = scanner.next();
            System.out.print("Enter " + name + "'s grade: ");
            float grade = scanner.nextFloat();
            students.add(new Student(name, grade));
        }

        if (students.isEmpty()) {
            System.out.println("No student data was entered.");
            return;
        }

        float highest = students.get(0).grade;
        float lowest = students.get(0).grade;
        double sum = 0;

        for (Student student : students) {
            if (student.grade > highest) {
                highest = student.grade;
            }
            if (student.grade < lowest) {
                lowest = student.grade;
            }
            sum += student.grade;
        }

        double average = sum / students.size();

        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}