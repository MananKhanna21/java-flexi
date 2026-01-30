import java.util.Scanner;

class student_details {
    String name;
    int roll;
    long prn;

    student_details(String n, int r, long p) {
        name = n;
        roll = r;
        prn = p;
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(prn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        long prn = sc.nextLong();

        student_details s = new student_details(name, roll, prn);
        s.display();
    }
}
