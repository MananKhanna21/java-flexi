class Student {
    String name;
    double grades[] = new double[10];
    int count = 0;

    Student(String n) {
        name = n;
    }

    void addGrade(double g) {
        grades[count] = g;
        count++;
    }

    double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < count; i++) sum += grades[i];
        if (count == 0) return 0;
        return sum / count;
    }

    void display() {
        System.out.print(name + " Grades: ");
        for (int i = 0; i < count; i++) System.out.print(grades[i] + " ");
        System.out.println(" Avg: " + calculateAverage());
    }
}

class GradeManager {
    Student students[] = new Student[10];
    int count = 0;

    void addStudent(Student s) {
        students[count] = s;
        count++;
    }

    Student findStudent(String n) {
        for (int i = 0; i < count; i++) {
            if (students[i].name.equalsIgnoreCase(n)) return students[i];
        }
        return null;
    }

    void displayAll() {
        for (int i = 0; i < count; i++) students[i].display();
    }
}

public class gradeManagement {
    public static void main(String[] args) {
        GradeManager g = new GradeManager();

        Student s = new Student("Mohul");
        s.addGrade(80);
        s.addGrade(90);

        g.addStudent(s);
        g.displayAll();
    }
}
